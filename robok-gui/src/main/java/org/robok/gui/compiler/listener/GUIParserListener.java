package org.robok.gui.compiler.listener;

import java.lang.reflect.Method;
import static org.robok.antlr4.kotlin.KotlinParser.BlockContext;
import static org.robok.antlr4.kotlin.KotlinParser.ExpressionContext;
import static org.robok.antlr4.kotlin.KotlinParser.PrimaryExpressionContext;
import static org.robok.antlr4.kotlin.KotlinParser.KotlinFileContext;

import org.robok.antlr4.kotlin.KotlinParserBaseListener;

import org.robok.gui.GUIBuilder;


public class GUIParserListener extends KotlinParserBaseListener {
    
    private GUIBuilder guiBuilder;
    public GUIParserListener(GUIBuilder guiBuilder){
        this.guiBuilder = guiBuilder;
    }
    
    private void start(String s) {
        try {

            Class<?> clazz = guiBuilder.getClass();
            Method method = clazz.getDeclaredMethod(s);
            method.invoke(guiBuilder);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void exitKotlinFile(KotlinFileContext ctx) {
        guiBuilder.finish();
        super.exitKotlinFile(ctx);
    }
        
    @Override
    public void enterBlock(BlockContext ctx) {
        
        start(ctx.getParent().toString());
        
        super.enterBlock(ctx);
        // TODO: Implement this method
    }
    
    @Override
    public void exitBlock(BlockContext ctx) {
        
        start("closeBlock");
        super.exitBlock(ctx);
        // TODO: Implement this method
    }
    
    @Override
    public void enterExpression(ExpressionContext ctx) {
        
        super.enterExpression(ctx);
        // TODO: Implement this method
    }
    
    @Override
    public void exitExpression(ExpressionContext ctx) {
        super.exitExpression(ctx);
        // TODO: Implement this method
    }
    
    @Override
    public void enterPrimaryExpression(PrimaryExpressionContext ctx) {
        super.enterPrimaryExpression(ctx);
        // TODO: Implement this method
    }
    
    @Override
    public void exitPrimaryExpression(PrimaryExpressionContext ctx) {
        super.exitPrimaryExpression(ctx);
        // TODO: Implement this method
    }
    


}
