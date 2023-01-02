/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoreslogicos;

/**
 *
 * @author angel
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        Boolean x, y, resultado;
        x = true;
        y = false;
        //Todos os sinais &&(e) , ||(ou) , ^(ou exclusivo) , !(não)
        resultado = (x || y)?true:false;
        System.out.printf("X: %b \nY: %b", x, y);
        System.out.println("\nResultado: "+ resultado);
        
    }
}
