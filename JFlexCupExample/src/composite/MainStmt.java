/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import contracts.IBlock;
import java.util.LinkedList;

/**
 *
 * @author xhuni
 */
public class MainStmt implements IBlock {
    public LinkedList<RunStmt> runlist;
    public MainStmt(LinkedList<RunStmt> runlist){
        this.runlist = runlist;
    }

    @Override
    public void ejecutar() {
        for (RunStmt runStmt : runlist) {
            System.out.println("Partidas: ");
            for (String partida : runStmt.partidas) {
                System.out.println("\t Partida " + partida);
            }
        }
    }
}
