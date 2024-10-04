// Generated from GUI.g4 by ANTLR 4.13.2
package org.robok.antlr4.gui;

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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GUIParser}.
 */
public interface GUIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GUIParser#guiFile}.
	 * @param ctx the parse tree
	 */
	void enterGuiFile(GUIParser.GuiFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUIParser#guiFile}.
	 * @param ctx the parse tree
	 */
	void exitGuiFile(GUIParser.GuiFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUIParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(GUIParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUIParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(GUIParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUIParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(GUIParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUIParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(GUIParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUIParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GUIParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUIParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GUIParser.ArgumentContext ctx);
}