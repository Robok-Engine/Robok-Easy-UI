package org.robok.gui

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

import java.lang.reflect.InvocationTargetException

class GUIBuilder (
    private val context: Context,
    private val debugLogs: Boolean = false,
    private val onFinish: (String, Boolean) -> Unit
) {
    private val stringBuilder = StringBuilder()
    private var indentLevel = 0
    private val indent: String
        get() = "\t".repeat(indentLevel)
    val closingTagLayoutList: MutableList<String> = mutableListOf()
    
    
    init {
        rootView()
    }
        
    fun rootView() {
        if (debugLogs) stringBuilder.newLineLn("<!-- opening Root Layout -->")
        stringBuilder.newLineLn("<LinearLayout")
        stringBuilder.newLineLn("${DefaultValues.XMLNS}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        stringBuilder.newLineLn(">")
        indentLevel++
    }

    fun Column(/*id: String = DefaultValues.NO_ID*/) {
        if (debugLogs) stringBuilder.newLineLn("<!-- opening Column Layout -->")
        stringBuilder.newLineLn("${indent}<LinearLayout")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        // stringBuilder.newLine("${indent}${addId(id)}") 
        stringBuilder.newLineLn(">")
        indentLevel++
        closingTagLayoutList.add("Column:<LinearLayout/>")
        
    }
    
    // TO-DO: re-add params
    fun Text(/*id: String = DefaultValues.NO_ID, text: String*/) {
        if (debugLogs) stringBuilder.newLineLn("<!-- Text Component -->")
        stringBuilder.newLineLn("${indent}<TextView")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        /*
        stringBuilder.newLineLn("${indent}${addId(id)}")
        stringBuilder.newLine("${indent}\tandroid:text=\"$text\"")
        */
        stringBuilder.newLineLn("/>")
    }
    
    // TO-DO: re-add params
    fun Button(/*id: String = DefaultValues.NO_ID, text: String*/) {
        if (debugLogs) stringBuilder.newLineLn("<!-- Button  Component -->")
        stringBuilder.newLineLn("${indent}<Button")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        /*
        stringBuilder.newLineLn("${indent}${addId(id)}")
        stringBuilder.newLine("${indent}\tandroid:text=\"$text\"")
        */
        stringBuilder.newLineLn("/>")
    }
    
    fun newLine(log: String){
        stringBuilder.append(log)
    }
    
    fun closeBlock() {
    if (closingTagLayoutList.isNotEmpty()) {
    
        val tags = closingTagLayoutList.last().split(":")

        if (tags.size >= 2) {
            val closingTagGui = tags[0]
            val closingTagXml = tags[1]

            indentLevel--

            if (debugLogs) stringBuilder.newLineLn("<!-- closing $closingTagGui Layout -->")

            stringBuilder.newLineLn("${indent}$closingTagXml")

            closingTagLayoutList.removeAt(closingTagLayoutList.size - 1)
        } else {
            stringBuilder.newLineLn("Erro: Formato inválido de tag de fechamento.")
        }
    } else {
        stringBuilder.newLineLn("Erro: Nenhum layout para fechar.")
    }
}
    
    fun runMethod(methodName: String) {
        try {
            // using reflection to call method by name
            val method = this::class.java.getDeclaredMethod(methodName)
            method.invoke(this)  // Call the method on the instance itself=
        } catch (e: InvocationTargetException) {
        
            val originalException = e.cause
    
            stringBuilder.append("\n ${originalException?.message}\n")
            e.printStackTrace() // display the exception stack if there is an error
        }
    }

    private fun addId(id: String): String = if (id != DefaultValues.NO_ID) "\tandroid:id=\"@+id/$id\"" else ""

    fun buildXML(): String {
        return stringBuilder.toString()
    }
    
    fun finish(){
        indentLevel--
        if (debugLogs) stringBuilder.newLineLn("<!-- closing Root Layout -->")
        stringBuilder.newLineLn("</LinearLayout>")
        if (debugLogs) stringBuilder.append("\nEnd.")
        onFinish(stringBuilder.toString(), false)
    }
    
    fun returnError(error: String){
       onFinish(error, true)
    }
}
 
/* maybe it will be used in the future
fun gui(block: GUIBuilder.() -> Unit): String {
    val builder = GUIBuilder()
    builder.rootView(block)
    return builder.build()
}
*/