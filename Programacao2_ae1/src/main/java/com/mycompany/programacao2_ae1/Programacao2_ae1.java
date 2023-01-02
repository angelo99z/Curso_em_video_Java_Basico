package com.mycompany.programacao2_ae1;

public class Programacao2_ae1 {

    public static void main(String[] args) {
        int soma = 0, contador_impar = 0;
        int c = 1;
        
        while (c <=1000) {
            if (c % 2 == 1) {
                contador_impar++;
                soma += c;
                c++;
                
            } else {
                c++;
            }    
        }
        int media = soma / contador_impar;
        System.out.println("Total de números impares entre 1 e 1000: " + contador_impar);
        System.out.println("Soma dos números impares entre 1 e 1000: " + soma);
        System.out.println("Média dos números impares entre 1 e 1000: " + media);
    }
}