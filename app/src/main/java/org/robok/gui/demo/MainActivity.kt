package org.robok.gui.demo

import android.os.Bundle
import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.widget.TextView

import org.robok.gui.demo.databinding.ActivityMainBinding

import org.robok.gui.GUIBuilder
import org.robok.gui.compiler.GUICompiler

class MainActivity : Activity() {

    private var _binding: ActivityMainBinding? = null

    private val binding: ActivityMainBinding
        get() = checkNotNull(_binding) { "Activity has been destroyed" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createCode.setOnClickListener {
            var guiBuilder = GUIBuilder(
                context = this,
                onFinish = { value, isError ->
                   runOnUiThread {
                     alertDialog(
                        title = if (!isError) "Finish Method" else "Un error ocurred",
                        message = value,
                        confirm = {
                            it.dismiss()
                        }
                     )
                   }
                }
            )
            val guiCompiler = GUICompiler(guiBuilder)
        }
    }
    
    private fun alertDialog(
        title: String,
        message: String,
        confirmText: String = "OK",
        confirm: (DialogInterface) -> Unit = {}
    ) {
        val messageTextView = TextView(this)
        messageTextView.text = message
        messageTextView.textSize = 16f
        messageTextView.setPadding(32, 32, 32, 32)
        messageTextView.setTextIsSelectable(true)
        AlertDialog.Builder(this)
            .setTitle(title)
            .setView(messageTextView)
            .setPositiveButton(confirmText) { dialog, _ ->
                confirm(dialog)
            }
            .show()
    }
}