package org.robok.gui

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