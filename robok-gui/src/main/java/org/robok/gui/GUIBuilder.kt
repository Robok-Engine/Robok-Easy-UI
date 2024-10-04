package org.robok.gui

import android.content.Context

import java.util.*

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
        stringBuilder.newLineLn("<LinearLayout\n${DefaultValues.XMLNS}")
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
    
    fun closeBlock(){
        var tags = closingTagLayoutList.get(closingTagLayoutList.size).split(":")
        
        var closingTagGui = tags[0]
        var closingTagXml = tags[1]
        indentLevel--
        stringBuilder.newLineLn("${indent}" + closingTagXml)
        closingTagLayoutList.removeAt(closingTagLayoutList.size)
    }
    
    fun runMethod(methodName: String) {
        if (debugLogs) stringBuilder.append("\nCode called on runMethod " + methodName) 
        try {
            // using reflection to call method by name
            val method = this::class.java.getDeclaredMethod(methodName)
            method.invoke(this)  // Call the method on the instance itself=
        } catch (e: Exception) {
            stringBuilder.append("\n"+e.toString()+"\n")
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