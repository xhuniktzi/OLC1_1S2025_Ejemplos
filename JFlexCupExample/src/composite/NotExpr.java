/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import contracts.IExpr;

/**
 *
 * @author xhuni
 */
public class NotExpr implements IExpr{
    public IExpr expr;
    public NotExpr(IExpr expr){
        this.expr = expr;
    }
    
    @Override
    public boolean evaluar() {
        return !expr.evaluar();
    }
    
}
