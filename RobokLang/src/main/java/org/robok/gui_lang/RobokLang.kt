package org.robok.gui_lang

import android.util.Xml
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import org.xmlpull.v1.XmlPullParser
import java.io.StringReader

object RobokLang {
  fun render(xml: String, parent: ViewGroup) {
    with(parent) {
      val xmlParser: XmlPullParser = Xml.newPullParser()
      xmlParser.setInput(StringReader(xml))
      val rootView = LinearLayout(context).apply {
        orientation = LinearLayout.VERTICAL
      }

      var eventType = xmlParser.eventType
      var currentView: View? = null

      while (eventType != XmlPullParser.END_DOCUMENT) {
        val tagName = xmlParser.name

        when (eventType) {
          XmlPullParser.START_TAG -> {
            currentView = when (tagName) {
              "Button" -> Button(context).apply {
                text = xmlParser.getAttributeValue(null, "text")
              }

              "Text" -> TextView(context).apply {
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
      parent.addView(rootView)
    }
  }
}