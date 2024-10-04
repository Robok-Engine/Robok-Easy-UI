package org.robok.gui.compiler

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.tree.ParseTreeWalker
import android.util.Log

import org.robok.antlr4.gui.*
import org.robok.gui.GUIBuilder
import org.robok.gui.compiler.listener.GUIParserListener

class GUICompiler {

    var code : String = """Column {
                    Button(text = "Click here", id = "a")
                    Text(text = "Thanks love", id = "b")
                   
                }"""

 constructor(guiBuilder: GUIBuilder) {
    val th = Thread {
        try {
            val input = CharStreams.fromString(code)
            val lexer = GUILexer(input)
            val tokens = CommonTokenStream(lexer)
            val parser = GUIParser(tokens)

            parser.interpreter.predictionMode = PredictionMode.SLL

            val compilationUnitContext = parser.guiFile()

            // Create and add custom listener
            val compiler = GUIParserListener(guiBuilder)
            val walker = ParseTreeWalker.DEFAULT
            walker.walk(compiler, compilationUnitContext)
        } catch (e: Exception) {
            gui.returnError(e.toString())
        }
    }
    th.priority = Thread.MIN_PRIORITY
    th.start()
}
}