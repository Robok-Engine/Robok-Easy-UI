package org.robok.amix

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

import android.content.Context
import org.robok.amix.config.Config
import org.robok.amix.compiler.AmixCompiler
import org.robok.amix.xml.AmixXmlGenerator

class Amix(val context: Context) {

  lateinit var compiler: AmixCompiler

  fun compile() = compiler.compile()

  class Builder(private val context: Context) {
    private var useComments: Boolean = false
    private var code: String? = null
    private var onGenerateCode: (String, Config) -> Unit = { _, _ -> }
    private var onError: (String) -> Unit = { }

    fun setUseComments(useComments: Boolean): Builder {
      this.useComments = useComments
      return this
    }

    fun setCode(code: String): Builder {
      this.code = code
      return this
    }

    fun setOnGenerateCode(onGenerateCode: (String, Config) -> Unit): Builder {
      this.onGenerateCode = onGenerateCode
      return this
    }

    fun setOnError(onError: (String) -> Unit): Builder {
      this.onError = onError
      return this
    }

    fun create(): Amix {
      val xmlBuilder =
        AmixXmlGenerator(
          context = context,
          codeComments = useComments,
          onGenerateCode = onGenerateCode,
          onError = onError
        )
      val amixCompiler = AmixCompiler(xmlBuilder = xmlBuilder, code = code)
      return Amix(context).apply {
        compiler = amixCompiler
      }
    }
  }
}