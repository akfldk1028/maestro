/* Generated By:JJTree: Do not edit this line. ASTAssignment.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.netflix.sel.ast;

import com.netflix.sel.visitor.SelBaseNode;

public class ASTAssignment extends SelBaseNode {
  public ASTAssignment(int id) {
    super(id);
  }

  public ASTAssignment(SelParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. * */
  public Object jjtAccept(SelParserVisitor visitor, Object data) {

    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=22e00186f038076f729fab1509f71cfe (do not edit this line) */
