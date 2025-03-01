/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import contracts.IBlock;
import contracts.IExpr;
import enums.Action;

/**
 *
 * @author xhuni
 */
public class IfStmt  implements IBlock  {
    public IExpr expr;
    public Action act;
    public IfStmt(IExpr expr, Action act){
        this.expr = expr;
        this.act = act;
    }
    
    public IfStmt(Action act) {
        this.act = act;
    }

    @Override
    public void ejecutar() {
        if (expr != null){
            System.out.println("Condicion: " + expr.evaluar());
        } else {
            System.out.println("No condicion");
        }
        
        System.out.println("Accion: " + act);
    }
}
