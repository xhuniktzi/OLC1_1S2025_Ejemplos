/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jflexcupexample;

import enums.Action;

/**
 *
 * @author xhuni
 */
public class Utils {
    public static Action parseAction(String act) throws Exception{
        switch (act) {
            case "C" -> {
                return Action.COOP;
            }
            case "D" -> {
                return Action.DEFECT;
            }
            default -> throw new Exception("Accion invalida");
        }
    }
    
    public static double parseNum(String num) {
        return Double.parseDouble(num);
    }
    
    public static String valueBoolean(boolean bool){
        return String.valueOf(bool);
    }
}
