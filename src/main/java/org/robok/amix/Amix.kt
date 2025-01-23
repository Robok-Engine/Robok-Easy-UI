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
    private var useComments: Boolean = false
    private var useStyle: Boolean = false
    private var useVerticalRoot: Boolean = false
    private var onGenerateCode: OnGenerateCode? = null
    private var onError: OnError? = null
    private var code: String? = null

    fun setUseComments(useComments: Boolean): Builder {
      this.useComments = useComments
      return this
    }

    fun setUseStyle(useStyle: Boolean): Builder {
      this.useStyle = useStyle
      return this
    }

    fun setUseVerticalRoot(useVerticalRoot: Boolean): Builder {
      this.useVerticalRoot = useVerticalRoot
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
          useComments = useComments,
          useStyle = useStyle,
          useVerticalRoot = useVerticalRoot,
          onGenerateCode = { code, config -> onGenerateCode?.call(code, config) },
          onError = { onError?.call(it) },
        )
      val amixCompiler = AmixCompiler(xmlGenerator = xmlGenerator, code = code)
      return Amix().apply { compiler = amixCompiler }
    }
  }

  fun interface OnGenerateCode {
    fun call(code: String, config: Config)
  }

  fun interface OnError {
    fun call(error: String)
  }
}
