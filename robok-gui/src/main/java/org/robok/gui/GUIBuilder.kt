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
    val codes: MutableList<String> = mutableListOf()
    
    
    init {
        rootView()
    }
        
    fun rootView() {
        stringBuilder.newLineLn("<!-- opening root layout -->")
        stringBuilder.newLineLn("<LinearLayout\n${DefaultValues.XMLNS}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        stringBuilder.newLineLn(">")
        indentLevel++
    }

    fun Column(/*id: String = DefaultValues.NO_ID*/) {
        stringBuilder.newLineLn("${indent}<LinearLayout")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_WIDTH}")
        // stringBuilder.newLine("${indent}${addId(id)}") 
        stringBuilder.newLineLn(">")
        indentLevel++
        codes.add("<LinearLayout/>")
        
    }
    
    // TO-DO: re-add params
    fun Text(/*id: String = DefaultValues.NO_ID, text: String*/) {
        stringBuilder.newLineLn("${indent}<TextView")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_WIDTH}")
        /*
        stringBuilder.newLineLn("${indent}${addId(id)}")
        stringBuilder.newLine("${indent}\tandroid:text=\"$text\"")
        */
        stringBuilder.newLineLn("/>")
    }
    
    // TO-DO: re-add params
    fun Button(/*id: String = DefaultValues.NO_ID, text: String*/) {
        stringBuilder.newLineLn("${indent}<Button")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_WIDTH}")
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
        indentLevel--
        stringBuilder.newLineLn("${indent}" + codes.get(codes.size))
        codes.removeAt(codes.size)
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
        stringBuilder.newLineLn("<!-- closing root layout -->")
        stringBuilder.newLineLn("</LinearLayout>")
        stringBuilder.append("\nEnd.")
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