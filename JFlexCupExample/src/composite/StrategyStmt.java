/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import contracts.IBlock;
import enums.Action;
import java.util.LinkedList;

/**
 *
 * @author xhuni
 */
public class StrategyStmt implements IBlock {
    public Action init;
    public LinkedList<IfStmt> rules;
    public StrategyStmt(Action i, LinkedList<IfStmt> rules){
        this.init = i;
        this.rules = rules;
    }

    @Override
    public void ejecutar() {
        System.out.println("Accion inicial: " + init);
        System.out.println("Lista de reglas");
        for (IfStmt rule : rules) {
            System.out.println("Regla: ");
            rule.ejecutar();
        }
    }
}
