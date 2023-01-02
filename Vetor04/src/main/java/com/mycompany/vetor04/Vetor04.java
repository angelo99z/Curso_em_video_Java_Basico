/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetor04;

import java.util.Arrays;

/**
 *
 * @author anggal
 */
public class Vetor04 {

    public static void main(String[] args) {
        int vet [ ] = {3 , 7 , 6 , 1 , 9 , 4 , 2};
        
        for (int v:vet) {
            System.out.print(v);
            System.out.print(" ");
        }
        
        int p = Arrays.binarySearch(vet, 10); //procura a posição do valor digitado (ex: 10) no vetor, caso o valor não existir, será retornado uma posição negativa.
        System.out.println("\nEncontrei o valor na posição " + p);
    }
}
