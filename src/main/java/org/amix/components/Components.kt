package org.amix.components

/*
 *  This file is part of Amix © 2024.
 *
 *  Amix is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Amix is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Amix.  If not, see <https://www.gnu.org/licenses/>.
 */

import org.amix.annotation.Component
import org.amix.config.Config
import org.amix.ext.newLine
import org.amix.ext.newLineBroken
import org.amix.internal.AttributeDefaults
import org.amix.internal.Utils.comment
import org.amix.internal.Utils.convertStyleToFileName

internal class Components(
  private val useComments: Boolean = false,
  private val useStyle: Boolean = false, 
  private val useVerticalRoot: Boolean = false,
) {

  var indentLevel = 0
  val indent: String
    get() = "\t".repeat(indentLevel)

  val xmlCodeList: MutableList<String> = mutableListOf()
  val closingTagLayoutList: MutableList<String> = mutableListOf()
  var config: Config = Config(orientation = "portrait", style = "defaultStyle")

  /** just to not crash in reflection */
  fun config() = Unit

  /** ********* Layouts *********** */
  @Component("Root")
  fun Root() {
    if (useComments) xmlCodeList.newLineBroken(comment("Opening Root Layout"))
    xmlCodeList.newLineBroken("""<?xml version="1.0" encoding="utf-8"?>""")
    xmlCodeList.newLineBroken("<LinearLayout")
    indentLevel++
    xmlCodeList.newLineBroken(AttributeDefaults.XMLNS(indent))
    xmlCodeList.newLineBroken("${indent}${AttributeDefaults.LAYOUT_HEIGHT}")
    xmlCodeList.newLineBroken("${indent}${AttributeDefaults.LAYOUT_WIDTH}")
    if (useVerticalRoot) xmlCodeList.newLineBroken("${indent}\tandroid:orientation=\"vertical\"")
    xmlCodeList.newLine("${indent}\tandroid:id=\"@+id/root_view\"")
    xmlCodeList.newLineBroken(">")
    indentLevel++
  }

  @Component("Column")
  fun Column() {
    if (useComments) xmlCodeList.newLineBroken(comment("Opening Column Layout"))
    xmlCodeList.newLineBroken("${indent}<LinearLayout")
    indentLevel++
    xmlCodeList.newLineBroken("${indent}\tandroid:orientation=\"vertical\"")
    xmlCodeList.newLineBroken(">")
    indentLevel++
    closingTagLayoutList.newLine("Column:</LinearLayout>")
  }

  @Component("Row")
  fun Row() {
    if (useComments) xmlCodeList.newLineBroken(comment("Opening Row Layout"))
    xmlCodeList.newLineBroken("${indent}<LinearLayout")
    indentLevel++
    xmlCodeList.newLineBroken("${indent}\tandroid:orientation=\"horizontal\"")
    xmlCodeList.newLineBroken(">")
    indentLevel++
    closingTagLayoutList.newLine("Row:</LinearLayout>")
  }

  @Component("Box")
  fun Box() {
    if (useComments) xmlCodeList.newLineBroken(comment("Opening Box Layout"))
    xmlCodeList.newLineBroken("${indent}<RelativeLayout")
    indentLevel++
    xmlCodeList.newLineBroken(">")
    indentLevel++
    closingTagLayoutList.newLine("Box:</RelativeLayout>")
  }

  @Component("RadioGroup")
  fun RadioGroup() {
    if (useComments) xmlCodeList.newLineBroken(comment("Opening RadioGroup Layout"))
    xmlCodeList.newLineBroken("${indent}<RadioGroup")
    indentLevel++
    xmlCodeList.newLineBroken(">")
    indentLevel++
    closingTagLayoutList.newLine("RadioGroup:</RadioGroup>")
  }

  /** ********* Widgets *********** */
  @Component("Text")
  fun Text() {
    if (useComments) xmlCodeList.newLineBroken(comment("Text Component"))
    xmlCodeList.newLineBroken("${indent}<TextView")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "Text") +
          "\""
      )
    }
    closingTagLayoutList.newLine("Text:/>")
  }

  @Component("Button")
  fun Button() {
    if (useComments) xmlCodeList.newLineBroken(comment("Button Component"))
    xmlCodeList.newLineBroken("${indent}<Button")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "Button") +
          "\""
      )
    }
    closingTagLayoutList.newLine("Button:/>")
  }

  @Component("MaterialButton")
  fun MaterialButton() {
    if (useComments) xmlCodeList.newLineBroken(comment("MaterialButton Component"))
    xmlCodeList.newLineBroken("${indent}<com.google.android.material.button.MaterialButton")
    indentLevel++
    closingTagLayoutList.newLine("com.google.android.material.button.MaterialButton:/>")
  }

  @Component("Image")
  fun Image() {
    if (useComments) xmlCodeList.newLineBroken(comment("Image Component"))
    xmlCodeList.newLineBroken("${indent}<ImageView")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "Image") +
          "\""
      )
    }
    closingTagLayoutList.newLine("Image:/>")
  }

  @Component("CircleProgress")
  fun CircleProgress() {
    if (useComments) xmlCodeList.newLineBroken(comment("CircleProgress Component"))
    xmlCodeList.newLineBroken("${indent}<ProgressBar")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "CircleProgress") +
          "\""
      )
    }
    closingTagLayoutList.newLine("CircleProgress:/>")
  }

  @Component("BarProgress")
  fun BarProgress() {
    if (useComments) xmlCodeList.newLineBroken(comment("BarProgress Component"))
    xmlCodeList.newLineBroken("${indent}<ProgressBar")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "BarProgress") +
          "\""
      )
    }

    xmlCodeList.newLineBroken("style=\"?android:attr/progressBarStyleHorizontal\"")

    closingTagLayoutList.newLine("BarProgress:/>")
  }

  @Component("Switch")
  fun Switch() {
    if (useComments) xmlCodeList.newLineBroken(comment("Switch Component"))
    xmlCodeList.newLineBroken("${indent}<Switch")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "Switch") +
          "\""
      )
    }
    closingTagLayoutList.newLine("Switch:/>")
  }

  @Component("CheckBox")
  fun CheckBox() {
    if (useComments) xmlCodeList.newLineBroken(comment("CheckBox Component"))
    xmlCodeList.newLineBroken("${indent}<CheckBox")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "CheckBox") +
          "\""
      )
    }
    closingTagLayoutList.newLine("CheckBox:/>")
  }

  @Component("RadioButton")
  fun RadioButton() {
    if (useComments) xmlCodeList.newLineBroken(comment("RadioButton Component"))
    xmlCodeList.newLineBroken("${indent}<RadioButton")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "RadioButton") +
          "\""
      )
    }
    closingTagLayoutList.newLine("RadioButton:/>")
  }

  @Component("Slider")
  fun Slider() {
    if (useComments) xmlCodeList.newLineBroken(comment("Slider Component"))
    xmlCodeList.newLineBroken("${indent}<SeekBar")
    indentLevel++
    if (useStyle) {
      xmlCodeList.newLineBroken(
        "${indent}android:background=\"@drawable/" +
          convertStyleToFileName(config.style + "Slider") +
          "\""
      )
    }
    closingTagLayoutList.newLine("Slider:/>")
  }
}
