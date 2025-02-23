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
public class AndExpr implements IExpr{
    public IExpr left;
    public IExpr right;
    public AndExpr(IExpr left, IExpr right){
        this.left = left;
        this.right = right;
    }
    
    @Override
    public boolean evaluar() {
        return left.evaluar() && right.evaluar();
    }
    
}
