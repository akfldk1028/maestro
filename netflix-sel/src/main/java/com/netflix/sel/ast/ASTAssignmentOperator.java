/* Generated By:JJTree: Do not edit this line. ASTAssignmentOperator.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.netflix.sel.ast;

import com.netflix.sel.visitor.SelBaseNode;

public class ASTAssignmentOperator extends SelBaseNode {
  public ASTAssignmentOperator(int id) {
    super(id);
  }

  public ASTAssignmentOperator(SelParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. * */
  public Object jjtAccept(SelParserVisitor visitor, Object data) {

    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=24ef0c40800228a0293f35906da751f0 (do not edit this line) */
