/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Data de nascimento: ");
        int  nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        if (idade>=18) {
            System.out.println("Maior de idade");
        }
            else {
                    System.out.println("Menor de idade");
                    }    
        }  
    }
