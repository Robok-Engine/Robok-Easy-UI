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
 
 /*
 * This class converts the Robok Easy UI Attributes Names to Android View Names.
 */

class AttributeConverter {

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
        
        "gravity" to "android:gravity",
        
        "layout:gravity" to "android:layout_gravity",
        
        "layout:gravity:center:horizontal" to "android:layout_centerHorizontal",
        "layout:gravity:cr:hl" to "android:layout_centerHorizontal", //abbreviations
        
        "layout:gravity:center:vertical" to "android:layout_centerVertical",
        "layout:gravity:cr:vl" to "android:layout_centerVertical", //abbreviations
        
        "layout:startof" to "android:layout_toStartOf",
        "layout:endof" to "android:layout_toEndOf",
        "layout:above" to "android:layout_above",
        "layout:below" to "android:layout_below",
        
        "layout:align:start" to "android:layout_alignParentStart",
        "layout:align:end" to "android:layout_alignParentEnd",
        "layout:align:top" to "android:layout_alignParentTop",
        "layout:align:bottom" to "android:layout_alignParentBottom",
        "layout:align:baseline" to "android:layout_alignBaseline",
        
        "background" to "android:background",
        
        "orientation" to "android:orientation",
        
        "layout:weight" to "android:layout_weight",
       
        "visibility" to "android:visibility",
        "clickable" to "android:clickable",
        "enabled" to "android:enabled",
        "focusable" to "android:focusable",
        "hint" to "android:hint",
        "input:type" to "android:inputType",
        "src" to "android:src",
        "scale:type" to "android:scaleType"
    )
}
    
    fun convert(attr: String): String? {
        return atributesMap?.get(attr)
    }
}    
