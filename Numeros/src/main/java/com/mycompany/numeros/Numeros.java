/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeros;

import java.util.Scanner;

/**
 *
 * @author anggal
 */
public class Numeros {

    public static void main(String[] args) {
        int numero, soma = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.println("Quero continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("s"));
        System.out.println("A soma de todos os valores é " + soma);
    } 
}
