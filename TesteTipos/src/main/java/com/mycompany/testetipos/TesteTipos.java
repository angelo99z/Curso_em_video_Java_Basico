/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testetipos;

/**
 *
 * @author anggal
 */
public class TesteTipos {

    public static void main(String[] args) {
        int idade1 = 30;
        String valor1 = Integer.toString(idade1);
        System.out.print("Conversão INT > STRING: ");
        System.out.println(valor1);
        
        String valor2 = "20";
        int idade2 = Integer.parseInt(valor2);
        System.out.print("Conversão STRING > INT: ");
        System.out.println(valor2);;
        
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.print("Conversão STRING > FLOAT: ");
        System.out.println(idade3);
        
    }
}
