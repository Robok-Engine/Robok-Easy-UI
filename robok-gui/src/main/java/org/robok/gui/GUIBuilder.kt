package org.robok.gui

import android.content.Context
import android.widget.TextView
import android.app.AlertDialog
import java.util.*

class GUIBuilder (private val context: Context) {
    private val stringBuilder = StringBuilder()
    private var indentLevel = 0
    private val indent: String
        get() = "\t".repeat(indentLevel)
    val codes: MutableList<String> = mutableListOf()
    
    
        
    fun rootView(block: GUIBuilder.() -> Unit) {
        stringBuilder.newLineLn("<LinearLayout\n${DefaultValues.XMLNS}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        stringBuilder.newLineLn(">")
        indentLevel++
        this.block()
        indentLevel--
        stringBuilder.newLineLn("</LinearLayout>")
    }

    fun Column(id: String = DefaultValues.NO_ID, block: GUIBuilder.() -> Unit) {
        stringBuilder.newLineLn("${indent}<LinearLayout")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_WIDTH}")
        stringBuilder.newLine("${indent}${addId(id)}")
        stringBuilder.newLineLn(">")
        indentLevel++
        codes.add("<LinearLayout/>")
        
    }

    fun Text(id: String = DefaultValues.NO_ID, text: String) {
        stringBuilder.newLineLn("${indent}<TextView")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_WIDTH}")
        stringBuilder.newLineLn("${indent}${addId(id)}")
        stringBuilder.newLine("${indent}\tandroid:text=\"$text\"")
        stringBuilder.newLineLn("/>")
    }

    fun Button(id: String = DefaultValues.NO_ID, text: String) {
        stringBuilder.newLineLn("${indent}<Button")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_WIDTH}")
        stringBuilder.newLineLn("${indent}${addId(id)}")
        stringBuilder.newLine("${indent}\tandroid:text=\"$text\"")
        stringBuilder.newLineLn("/>")
    }
    
    private fun closeBlock(){
        indentLevel--
        
        stringBuilder.newLineLn("${indent}" + codes.get(codes.size))
        codes.removeAt(codes.size)
    }

    private fun addId(id: String): String = if (id != DefaultValues.NO_ID) "\tandroid:id=\"@+id/$id\"" else ""

    fun build(): String {
        return stringBuilder.toString()
    }
    
    fun finish(){
        val messageTextView = TextView(context)
        messageTextView.text = stringBuilder.toString()
        messageTextView.textSize = 16f
        messageTextView.setPadding(32, 32, 32, 32)
        messageTextView.setTextIsSelectable(true)
        AlertDialog.Builder(context)
            .setTitle("Error")
            .setView(messageTextView)
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}

/*fun gui(block: GUIBuilder.() -> Unit): String {
    val builder = GUIBuilder()
    builder.rootView(block)
    return builder.build()
}*/