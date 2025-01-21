package org.robok.amix.compiler.listener

/*
 *  This file is part of Robok © 2024.
 *
 *  Robok is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Robok is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Robok.  If not, see <https://www.gnu.org/licenses/>.
 */

import org.robok.amix.xml.AmixXmlGenerator
import org.robok.amix.internal.antlr4.AmixBaseListener
import org.robok.amix.internal.antlr4.AmixParser.ArgumentContext
import org.robok.amix.internal.antlr4.AmixParser.ArgumentListContext
import org.robok.amix.internal.antlr4.AmixParser.ComponentContext
import org.robok.amix.internal.antlr4.AmixParser.GuiFileContext
import org.robok.amix.internal.AttributeDefaults

class AmixParserListener(private val xmlGenerator: AmixXmlGenerator) : AmixBaseListener() {
  private var componentName: String = ""

  /** when finish the code */
  override fun exitGuiFile(context: GuiFileContext) {
    xmlGenerator.finish()
    super.exitGuiFile(context)
  }

  /** Called in start of component Example: Column { or Button( */
  override fun enterComponent(context: ComponentContext) {
    componentName = context.IDENTIFIER().text
    xmlGenerator.runMethod(componentName)
  }

  /** Called in end of component Example } or ) */
  override fun exitComponent(context: ComponentContext) {
    if (context.text.endsWith("}")) {
      xmlGenerator.closeBlockLayout()
      return
    }
    xmlGenerator.closeBlockComponent()
  }

  /*
   * When entering a list of arguments (example: Button(text = "Click here"))
   */
  override fun enterArgumentList(context: ArgumentListContext) {
    var componentName = context.getParent().getChild(0).text
  }

  /*
   * When enter new argument (example text = "")
   */
  override fun enterArgument(context: ArgumentContext) {
    var key = AttributeDefaults.DEFAULT_KEY

    if (context.IDENTIFIER() != null) {
      key = context.IDENTIFIER().text
    } else {
      key = context.IDENTIFIER_COLON().text
    }

    var value = getAttributeValue(context)

    if (value.startsWith("\"") && value.endsWith("\"")) {
      value = value.substring(1, value.length - 1)
    }

    if (value.contains("\\\"")) {
      value = value.replace("\\\"", "&quot;")
    }

    xmlGenerator.runMethodWithParameters("addAttribute", componentName, key, value)
  }

  /*
   * Returns the attribute value (example: text = "A", this method will return A)
   */
  private fun getAttributeValue(context: ArgumentContext): String {
    var value = AttributeDefaults.DEFAULT_VALUE

    if (context.value().STRING() != null) {
      value = context.value().STRING().text
    } else if (context.value().NUMBER() != null) {
      value = context.value().NUMBER().text
    } else if (context.value().IDENTIFIER_DOT() != null) {
      value = context.value().IDENTIFIER_DOT().text
    }

    return value
  }
}
