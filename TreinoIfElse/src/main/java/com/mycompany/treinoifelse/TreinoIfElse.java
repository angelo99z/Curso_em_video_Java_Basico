/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.treinoifelse;

import java.util.Scanner;

/**
 *
 * @author anggal
 */
public class TreinoIfElse {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Par ou impar? ");
        System.out.println("digite para escolher \n[ 1 ] IMPAR \n[ 2 ] PAR");
        System.out.print("\nOpção: ");
        int escolha = teclado.nextInt();
        if (escolha == 1 || escolha == 2) {
            
            if (escolha == 1) {
                System.out.println("Você escolheu IMPAR");
                System.out.print("Seu número: ");
                int num = teclado.nextInt();
                double aleatorio = Math.random();
                int  f = (int) (0 + aleatorio * (10-0));
                System.out.println("Número do adversário: " + f);
                
                if ((num + f)%2 == 0){
                    System.out.println("Você perdeu");
                } else {
                    System.out.println("Você ganhou");
                }
            
            } else {
                        System.out.println("Você escolheu PAR");
                        System.out.print("Seu número: ");
                        int n = teclado.nextInt();
                        double aleatorio = Math.random();
                        int a = (int) (0 + aleatorio * (10-0));
                        System.out.println("Número do adversário: " + a);
                        
                        if ((n + a) % 2 == 0) {
                            System.out.println("Você ganhou");
                        } else {
                            System.out.println("Você perdeu");
                        }
                        } 
        } else {
            System.out.println("Escolha uma opção válida");
            
            }
            }
            }
