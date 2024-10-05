package org.robok.gui.compiler.listener;

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

import static org.robok.antlr4.gui.GUIParser.GuiFileContext;
import static org.robok.antlr4.gui.GUIParser.ComponentContext;
import static org.robok.antlr4.gui.GUIParser.ArgumentContext;
import static org.robok.antlr4.gui.GUIParser.ArgumentListContext;

import org.robok.gui.GUIBuilder;
import org.robok.antlr4.gui.GUIBaseListener;

import java.lang.reflect.Method;

public class GUIParserListener extends GUIBaseListener {

    private GUIBuilder guiBuilder;
    private String componentName;

    public GUIParserListener(GUIBuilder guiBuilder) {
        this.guiBuilder = guiBuilder;
    }
    
    @Override
    public void exitGuiFile(GuiFileContext ctx) {
        guiBuilder.finish();
        super.exitGuiFile(ctx);
        // TODO: Implement this method
    }
    
    // Detecta o início de um layout (ex: Column {)
    @Override
    public void enterComponent(ComponentContext ctx) {
        String componentName = ctx.IDENTIFIER().getText();
        if (ctx.getText().contains("{")) {
            guiBuilder.runMethod(componentName);
            // runMethodWithParams("enterLayout", componentName);  // Chama o método específico para layouts ao abrir {
        } else {
            guiBuilder.runMethod(componentName);
            this.componentName = componentName;
        }
    }

    // Detecta o fechamento de um layout (ex: })
    @Override
    public void exitComponent(ComponentContext ctx) {
        if (ctx.getText().contains("}")) {
            String componentName = ctx.IDENTIFIER().getText();
            
            // runMethodWithParams("exitLayout", componentName);  // Chama o método específico para layouts ao fechar }
        }else{
            guiBuilder.runMethod("closeBlock");
        }
    }

    // Ao entrar em uma lista de argumentos (ex: Button(text = "Click here"))
    @Override
    public void enterArgumentList(ArgumentListContext ctx) {
        String componentName = ctx.getParent().getChild(0).getText();
       // runMethodWithParams("runMethodArguments", componentName);
    }

    // Ao processar cada argumento
    @Override
    public void enterArgument(ArgumentContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        String value = ctx.value_atribute().STRING().getText();
        
        guiBuilder.newLine("\n" + "key: " + key + "\nvalue: " + value + "\n")
        
        if(value.startsWith("\"") && value.endsWith("\"")){
            value = value.substring(1, value.length() - 1);
        }
        if(value.contains("\\\"")) {
            value = value.replaceAll("\\\"", "&quot;");
        }
        
        guiBuilder.runMethodWithParameters("addAtributesForComponent", componentName, key, value);
    }
}