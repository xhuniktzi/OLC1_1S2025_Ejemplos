/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jflexcupexample;

import java.io.StringReader;
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
        Lexer scanner = new Lexer(new StringReader("3+4*2"));
        Parser parser = new Parser(scanner);
        parser.parse();
    }
    
}
