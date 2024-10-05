package org.robok.gui.converter;

public class ConvertAtributeToXML {

    var atributesMap: Map<String, String>? = null
    
    init{
       atributesMap = mapOf(
        "width" to "android:layout_width",
        "height" to "android:layout_height",
        "text" to "android:text",
        "text:color" to "android:textColor",
        "text:style" to "android:textStyle",
        "text:size" to "android:textSize",
        "text:size" to "android:textSize",
        "padding" to "android:padding",
        "padding:top" to "android:paddingTop",
        "padding:bottom" to "android:paddingBottom",
        "padding:left" to "android:paddingLeft",
        "padding:right" to "android:paddingRight",
        "margin" to "android:layout_margin",
        "margin:top" to "android:layout_marginTop",
        "margin:bottom" to "android:layout_marginBottom",
        "margin:left" to "android:layout_marginLeft",
        "margin:right" to "android:layout_marginRight",
       )
    }
    
    fun convert(atr: String): String? {
        return atributesMap?.get(atr)
    }
    
}
