/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.voto;

import java.util.Scanner;

public class Voto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        System.out.println("Idade: " + idade);
        if (idade<16) {
            System.out.println("Não vota! ");
            
        } else {
            if((idade>=16 && idade<18) || (idade>70) ) {
                System.out.println("Voto opcional! ");
                
            } else {
                System.out.println("Voto obrigatório! ");
                
/* Maneira alternativa de usar o IF e ELSE nesta situação:
         if (idade < 16) {
             System.out.println("Não vota");
         } else if((idade>=16 && idade<18) || (idade>70) ) {
                System.out.println("Voto opcional");
         } else if (idade <=70) {
             System.out.println("Voto obrigatório");*/
         }
        }
    }
    }
