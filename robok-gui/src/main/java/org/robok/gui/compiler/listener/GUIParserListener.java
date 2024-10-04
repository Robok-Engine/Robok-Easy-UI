package org.robok.gui.compiler.listener;

import java.lang.reflect.Method;
import org.robok.antlr4.kotlin.GUIBaseListener;
import org.robok.gui.GUIBuilder;
import org.robok.antlr4.kotlin.GUIParser;

public class GUIParserListener extends GUIBaseListener {

    private GUIBuilder guiBuilder;

    public GUIParserListener(GUIBuilder guiBuilder) {
        this.guiBuilder = guiBuilder;
    }
    
    private void startt(String s) {
        try {

            Class<?> clazz = guiBuilder.getClass();
            Method method = clazz.getDeclaredMethod(s);
            method.invoke(guiBuilder);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void start2(String methodName, Object... params) {
        try {
            Class<?> clazz = guiBuilder.getClass();

            // Obter os tipos dos parâmetros
            Class<?>[] paramTypes = new Class[params.length];
            for (int i = 0; i < params.length; i++) {
                paramTypes[i] = params[i].getClass();
            }

            // Encontrar o método com o nome e parâmetros corretos
            Method method = clazz.getDeclaredMethod(methodName, paramTypes);

            // Invocar o método com os parâmetros fornecidos
            method.invoke(guiBuilder, params);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void exitGuiFile(GUIParser.GuiFileContext ctx) {
        guiBuilder.finish();
        super.exitGuiFile(ctx);
        // TODO: Implement this method
    }
    


    // Detecta o início de um layout (ex: Column {)
    @Override
    public void enterComponent(GUIParser.ComponentContext ctx) {
        String componentName = ctx.IDENTIFIER().getText();
        if (ctx.getText().contains("{")) {
            guiBuilder.start(componentName);
         //   start2("enterLayout", componentName);  // Chama o método específico para layouts ao abrir {
        } else {
            guiBuilder.start(componentName);
           // start2("addComponent", componentName);  // Para componentes normais como Button
        }
    }

    // Detecta o fechamento de um layout (ex: })
    @Override
    public void exitComponent(GUIParser.ComponentContext ctx) {
        if (ctx.getText().contains("}")) {
            String componentName = ctx.IDENTIFIER().getText();
            guiBuilder.start("closeBlock");
          //  start2("exitLayout", componentName);  // Chama o método específico para layouts ao fechar }
        }
    }

    // Ao entrar em uma lista de argumentos (ex: Button(text = "Click here"))
    @Override
    public void enterArgumentList(GUIParser.ArgumentListContext ctx) {
        String componentName = ctx.getParent().getChild(0).getText();
       // start2("startArguments", componentName);
    }

    // Ao processar cada argumento
    @Override
    public void enterArgument(GUIParser.ArgumentContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        String value = ctx.STRING().getText();
       // start2("addArgument", key, value);
        
        
    }
}