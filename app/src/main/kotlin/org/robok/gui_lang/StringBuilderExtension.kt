package org.robok.gui_lang

fun StringBuilder.newLine(text: String) {
    if (text.isNotEmpty()) {
        this.append("$text")
    }
}

fun StringBuilder.newLineLn(text: String) {
    if (text.isNotEmpty()) {
        this.append("$text\n")
    }
}