package org.robok.gui.compiler

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.tree.ParseTreeWalker
import android.util.Log

import org.robok.antlr4.kotlin.*
import org.robok.gui.GUIBuilder
import org.robok.gui.compiler.listener.GUIParserListener

class GUICompiler {

    var code : String = """Column {
                    Button(text = "Click here", id = "a")
                    Text(text = "Thanks love", id = "b")
                   
                }"""

    constructor(gui: GUIBuilder){
        val th = Thread {
            try {
                val input = CharStreams.fromString(code)
                val lexer = KotlinLexer(input)
                val tokens = CommonTokenStream(lexer)
                val parser = KotlinParser(tokens)

                parser.interpreter.predictionMode = PredictionMode.SLL

                val compilationUnitContext = parser.kotlinFile()

                // Cria e adiciona o listener personalizado
                val walker = ParseTreeWalker.DEFAULT
                val compiler = GUIParserListener(gui)
                walker.walk(compiler, compilationUnitContext)
            } catch (e: Exception) {
                Log.e("TAG", "Error reading file", e)
            }
        }
        th.priority = Thread.MIN_PRIORITY
        th.start()
    }
}