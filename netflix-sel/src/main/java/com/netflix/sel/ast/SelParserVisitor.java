/* Generated By:JavaCC: Do not edit this line. SelParserVisitor.java Version 6.0_1 */
package com.netflix.sel.ast;

public interface SelParserVisitor {
  public Object visit(SimpleNode node, Object data);

  public Object visit(ASTExecute node, Object data);

  public Object visit(ASTImportDeclaration node, Object data);

  public Object visit(ASTVariableDeclarator node, Object data);

  public Object visit(ASTVariableDeclaratorId node, Object data);

  public Object visit(ASTArrayInitializer node, Object data);

  public Object visit(ASTType node, Object data);

  public Object visit(ASTPrimitiveType node, Object data);

  public Object visit(ASTClassType node, Object data);

  public Object visit(ASTName node, Object data);

  public Object visit(ASTExpression node, Object data);

  public Object visit(ASTAssignment node, Object data);

  public Object visit(ASTAssignmentOperator node, Object data);

  public Object visit(ASTTernary node, Object data);

  public Object visit(ASTBinaryExpr node, Object data);

  public Object visit(ASTUnary node, Object data);

  public Object visit(ASTPrimaryExpression node, Object data);

  public Object visit(ASTPrimarySuffix node, Object data);

  public Object visit(ASTArrayIdx node, Object data);

  public Object visit(ASTMethod node, Object data);

  public Object visit(ASTParams node, Object data);

  public Object visit(ASTLiteral node, Object data);

  public Object visit(ASTAllocationExpression node, Object data);

  public Object visit(ASTArgs node, Object data);

  public Object visit(ASTArrayDims node, Object data);

  public Object visit(ASTStatement node, Object data);

  public Object visit(ASTBlock node, Object data);

  public Object visit(ASTLocalVariableDeclaration node, Object data);

  public Object visit(ASTIfStatement node, Object data);

  public Object visit(ASTWhileStatement node, Object data);

  public Object visit(ASTForStatement node, Object data);

  public Object visit(ASTForInit node, Object data);

  public Object visit(ASTForUpdate node, Object data);

  public Object visit(ASTBreakStatement node, Object data);

  public Object visit(ASTContinueStatement node, Object data);

  public Object visit(ASTReturnStatement node, Object data);

  public Object visit(ASTThrowStatement node, Object data);
}
/* JavaCC - OriginalChecksum=17d31d9e9e267b5ec5c1ac571c598cbb (do not edit this line) */
