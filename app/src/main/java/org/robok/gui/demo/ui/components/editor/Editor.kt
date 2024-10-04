package org.robok.gui.demo.ui.components.editor

import android.text.*
import android.widget.*
import android.view.*

import androidx.activity.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.platform.*
import androidx.compose.ui.draw.*
import androidx.activity.compose.*
import androidx.compose.runtime.*
import androidx.compose.ui.layout.*
import androidx.compose.material3.*
import androidx.compose.foundation.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.input.*
import androidx.compose.material.icons.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.viewinterop.*

import org.robok.gui.demo.ui.components.syntax.*

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
    modifier: Modifier = Modifier
) {
    AndroidView(
        factory = { ctx ->
            EditText(ctx).apply {
                setText(value)
                setFocusable(focusable)
                gravity = Gravity.TOP or Gravity.START 
                addTextChangedListener(object : TextWatcher {
                    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
                    override fun afterTextChanged(s: Editable?) {
                        s?.let {
                            onValueChange(it.toString())
                        }
                    }
                })
                SimpleHighlighter(this, syntaxType)
            }
        },
        update = {
            if (it.text.toString() != value) {
                it.setText(value)
            }
        },
        modifier = modifier
    )
}