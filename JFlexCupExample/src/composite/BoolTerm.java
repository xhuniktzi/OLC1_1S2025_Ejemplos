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
public class BoolTerm implements IExpr{
    public String value;
    public BoolTerm(String value){
        this.value = value;
    }
    
    @Override
    public boolean evaluar() {
        return Boolean.parseBoolean(this.value);
    }
    
}
