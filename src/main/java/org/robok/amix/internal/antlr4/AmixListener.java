package org.robok.easyui.internal.antlr4;

// Generated from Amix.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.tree.ParseTreeListener;

/** This interface defines a complete listener for a parse tree produced by {@link AmixParser}. */
public interface AmixListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AmixParser#guiFile}.
   *
   * @param ctx the parse tree
   */
  void enterGuiFile(AmixParser.GuiFileContext ctx);

  /**
   * Exit a parse tree produced by {@link AmixParser#guiFile}.
   *
   * @param ctx the parse tree
   */
  void exitGuiFile(AmixParser.GuiFileContext ctx);

  /**
   * Enter a parse tree produced by {@link AmixParser#component}.
   *
   * @param ctx the parse tree
   */
  void enterComponent(AmixParser.ComponentContext ctx);

  /**
   * Exit a parse tree produced by {@link AmixParser#component}.
   *
   * @param ctx the parse tree
   */
  void exitComponent(AmixParser.ComponentContext ctx);

  /**
   * Enter a parse tree produced by {@link AmixParser#argumentList}.
   *
   * @param ctx the parse tree
   */
  void enterArgumentList(AmixParser.ArgumentListContext ctx);

  /**
   * Exit a parse tree produced by {@link AmixParser#argumentList}.
   *
   * @param ctx the parse tree
   */
  void exitArgumentList(AmixParser.ArgumentListContext ctx);

  /**
   * Enter a parse tree produced by {@link AmixParser#argument}.
   *
   * @param ctx the parse tree
   */
  void enterArgument(AmixParser.ArgumentContext ctx);

  /**
   * Exit a parse tree produced by {@link AmixParser#argument}.
   *
   * @param ctx the parse tree
   */
  void exitArgument(AmixParser.ArgumentContext ctx);

  /**
   * Enter a parse tree produced by {@link AmixParser#value}.
   *
   * @param ctx the parse tree
   */
  void enterValue(AmixParser.ValueContext ctx);

  /**
   * Exit a parse tree produced by {@link AmixParser#value}.
   *
   * @param ctx the parse tree
   */
  void exitValue(AmixParser.ValueContext ctx);
}
