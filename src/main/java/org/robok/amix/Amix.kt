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

import org.robok.amix.compiler.AmixCompiler
import org.robok.amix.config.Config
import org.robok.amix.xml.AmixXmlGenerator

class Amix {

  lateinit var compiler: AmixCompiler

  fun compile() = compiler.compile()

  class Builder {
    private lateinit var onGenerateCode: OnGenerateCode
    private lateinit var onError: OnError
    private var useComments: Boolean = false
    private var code: String? = null

    fun setUseComments(useComments: Boolean): Builder {
      this.useComments = useComments
      return this
    }

    fun setCode(code: String): Builder {
      this.code = code
      return this
    }

    fun setOnGenerateCode(onGenerateCode: OnGenerateCode): Builder {
      this.onGenerateCode = onGenerateCode
      return this
    }

    fun setOnError(onError: OnError): Builder {
      this.onError = onError
      return this
    }

    fun create(): Amix {
      val xmlGenerator =
        AmixXmlGenerator(
          codeComments = useComments,
          onGenerateCode = { code, config -> onGenerateCode.call(code, config) },
          onError = { onError.call(it) },
        )
      val amixCompiler = AmixCompiler(xmlGenerator = xmlGenerator, code = code)
      return Amix().apply { compiler = amixCompiler }
    }
  }

  @FunctionalInterface
  interface OnGenerateCode {
    fun call(code: String, config: Config)
  }

  @FunctionalInterface
  interface OnError {
    fun call(error: String)
  }
}
