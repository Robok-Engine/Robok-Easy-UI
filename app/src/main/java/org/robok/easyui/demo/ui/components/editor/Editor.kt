package org.robok.easyui.demo.ui.components.editor

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

import android.text.*
import android.view.*
import android.widget.*
import androidx.activity.*
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.*
import androidx.compose.material.icons.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.platform.*
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.viewinterop.*
import org.robok.easyui.demo.ui.components.syntax.*

/*
 *  A Simple implementation of EditText with Syntax Scheme Colors.
 * @author Aquiles Trindade (trindadedev).
 */

@Composable
fun HighlightingEditor(
    value: String,
    onValueChange: (String) -> Unit,
    syntaxType: String,
    focusable: Boolean = true,
    modifier: Modifier = Modifier,
) {
    AndroidView(
        factory = { ctx ->
            HorizontalScrollView(ctx).apply {
                isHorizontalScrollBarEnabled = true
                addView(
                    EditText(ctx).apply {
                        setText(value)
                        setFocusable(focusable)
                        gravity = Gravity.TOP or Gravity.START
                        addTextChangedListener(
                            object : TextWatcher {
                                override fun beforeTextChanged(
                                    s: CharSequence?,
                                    start: Int,
                                    count: Int,
                                    after: Int,
                                ) {}

                                override fun onTextChanged(
                                    s: CharSequence?,
                                    start: Int,
                                    before: Int,
                                    count: Int,
                                ) {}

                                override fun afterTextChanged(s: Editable?) {
                                    s?.let { onValueChange(it.toString()) }
                                }
                            }
                        )
                        SimpleHighlighter(this, syntaxType)
                    }
                )
            }
        },
        update = { scrollView ->
            val editText = scrollView.getChildAt(0) as? EditText
            if (editText?.text.toString() != value) {
                editText?.setText(value)
            }
        },
        modifier = modifier,
    )
}
