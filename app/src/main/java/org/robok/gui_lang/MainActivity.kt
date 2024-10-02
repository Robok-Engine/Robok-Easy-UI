package org.robok.gui_lang

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.util.Xml
import android.view.View

import org.xmlpull.v1.XmlPullParser

import java.io.StringReader

import org.robok.gui_lang.databinding.ActivityMainBinding

public class MainActivity : Activity() {

    private var _binding: ActivityMainBinding? = null

    private val binding: ActivityMainBinding
        get() = checkNotNull(_binding) { "Activity has been destroyed" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createCode.setOnClickListener {
            val basicGuiXML = gui {
                Column {
                    Button(text = "Click here", id = "a")
                    Text(text = "Thanks love", id = "b")
                }
            }
            binding.xmlCode.text = basicGuiXML
            binding.xmlCode.setTextIsSelectable(true)

            try {
                preview(basicGuiXML)
            } catch (e: Exception) {
                showDialog(e.toString())
            }
        }
    }

    private fun showDialog(s: String) {
        val messageTextView = TextView(this)
        messageTextView.text = s
        messageTextView.textSize = 16f
        messageTextView.setPadding(32, 32, 32, 32)
        messageTextView.setTextIsSelectable(true)
        AlertDialog.Builder(this)
            .setTitle("Error")
            .setView(messageTextView)
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun preview(xml: String) {
        val xmlParser: XmlPullParser = Xml.newPullParser()
        xmlParser.setInput(StringReader(xml))
        val rootView = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
        }

        var eventType = xmlParser.eventType
        var currentView: View? = null

        while (eventType != XmlPullParser.END_DOCUMENT) {
            val tagName = xmlParser.name

            when (eventType) {
                XmlPullParser.START_TAG -> {
                    currentView = when (tagName) {
                        "Button" -> Button(this).apply {
                            text = xmlParser.getAttributeValue(null, "text")
                        }
                        "Text" -> TextView(this).apply {
                            text = xmlParser.getAttributeValue(null, "text")
                        }
                        else -> null
                    }
                    currentView?.let { rootView.addView(it) }
                }
                XmlPullParser.TEXT -> {
                    if (currentView is TextView) {
                        currentView.text = xmlParser.text
                    }
                }
            }
            eventType = xmlParser.next()
        }

        binding.preview.addView(rootView)
    }
}