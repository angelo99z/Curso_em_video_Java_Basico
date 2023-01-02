/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programapernas;

import java.util.Scanner;

/**
 *
 * @author anggal
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas?  ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            
            case 1:
                tipo = "Saci";
                break;
            
            case 2: 
                tipo = "Bipede";
                break;
                
            case 4:
                tipo = "quadrupede";
                break;
                
            case 6, 8:
                tipo = "aranha";
                break;
                        
            default:
                tipo = "ET";
        }                   
         System.out.println(tipo);               
        }
    }
