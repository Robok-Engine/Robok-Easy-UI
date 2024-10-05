package org.robok.gui.converter

/*
 *  This file is part of Robok © 2024.
 *
 *  Robok is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Robok is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Robok.  If not, see <https://www.gnu.org/licenses/>.
 */ 

class ConvertAtributeToXML {

    var atributesMap: Map<String, String>? = null
    
    init {
       atributesMap = mapOf(
        "id" to "android:id",
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
    
    fun convert(attr, String): String? {
        return atributesMap?.get(attr)
    }
    
}
