package org.robok.gui.compiler.listener;

import java.lang.reflect.Method;


import static org.robok.antlr4.gui.GUIParser.GuiFileContext;
import static org.robok.antlr4.gui.GUIParser.ComponentContext;
import static org.robok.antlr4.gui.GUIParser.ArgumentContext;
import static org.robok.antlr4.gui.GUIParser.ArgumentListContext;

import org.robok.gui.GUIBuilder;
import org.robok.antlr4.gui.GUIBaseListener;

public class GUIParserListener extends GUIBaseListener {

    private GUIBuilder guiBuilder;

    public GUIParserListener(GUIBuilder guiBuilder) {
        this.guiBuilder = guiBuilder;
    }
    
    private void runMethod(String s) {
        try {
            Class<?> clazz = guiBuilder.getClass();
            Method method = clazz.getDeclaredMethod(s);
            method.invoke(guiBuilder);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void runMethodWithParams(String methodName, Object... params) {
        try {
            Class<?> clazz = guiBuilder.getClass();
            // Get parameter types
            Class<?>[] paramTypes = new Class[params.length];
            for (int i = 0; i < params.length; i++) {
                paramTypes[i] = params[i].getClass();
            }
            Method method = clazz.getDeclaredMethod(methodName, paramTypes); // Find the method with the correct name and parameters
            method.invoke(guiBuilder, params); // Invoke the method with the given parameters
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            // runMethodWithParams("addComponent", componentName);  // Para componentes normais como Button
        }
    }

    // Detecta o fechamento de um layout (ex: })
    @Override
    public void exitComponent(ComponentContext ctx) {
        if (ctx.getText().contains("}")) {
            String componentName = ctx.IDENTIFIER().getText();
            guiBuilder.runMethod("closeBlock");
            // runMethodWithParams("exitLayout", componentName);  // Chama o método específico para layouts ao fechar }
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
        String value = ctx.STRING().getText();
        // runMethodWithParams("addArgument", key, value);
    }
}