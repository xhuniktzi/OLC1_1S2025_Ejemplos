/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jflexcupexample;

import contracts.IBlock;
import java.io.StringReader;
import java.util.LinkedList;
import jflexcupexample.analyzers.Lexer;
import jflexcupexample.analyzers.Parser;

/**
 *
 * @author xhuni
 */
public class JFlexCupExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Lexer scanner = new Lexer(new StringReader("""
                                                   
strategy Downing {
  initial: C
  rules: [
      if True && !False then C,                                                   
      if False then D,
      else C
  ]
}                                             
main { 
    run [S1,S2,S3, S54] 
    run [S4]  
}
"""));
        Parser parser = new Parser(scanner);
        parser.parse();
        
        LinkedList<IBlock> AST = parser.AST;
        for (IBlock iBlock : AST) {
            iBlock.ejecutar();
        }
    }
    
}
