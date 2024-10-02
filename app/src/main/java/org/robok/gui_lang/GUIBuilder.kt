package org.robok.gui_lang

class GUIBuilder {
    private val stringBuilder = StringBuilder()
    private var indentLevel = 0
    private val indent: String
        get() = "\t".repeat(indentLevel)
        
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
        this.block()
        indentLevel--
        stringBuilder.newLineLn("${indent}</LinearLayout>")
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

    private fun addId(id: String): String = if (id != DefaultValues.NO_ID) "\tandroid:id=\"@+id/$id\"" else ""

    fun build(): String {
        return stringBuilder.toString()
    }
}

fun gui(block: GUIBuilder.() -> Unit): String {
    val builder = GUIBuilder()
    builder.rootView(block)
    return builder.build()
}