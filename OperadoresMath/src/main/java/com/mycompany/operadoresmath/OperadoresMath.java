/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoresmath;

/**
 *
 * @author angel
 */
public class OperadoresMath {

    public static void main(String[] args) {
        System.out.println("ABS (ex= -10): ");
        //Pega o valor bruto do número (no caso de ser um número negativo ou quebrado)
        int x = -10;
        x = Math.abs(x);
        System.out.println(x);
        
        System.out.println("FLOOR (ex = 3.7):");
        //Arredonda o valor para baixo para virar um número inteiro
        double y = 3.7;
        y = Math.floor(y);
        System.out.println(y);
        
        System.out.println("CEIL (ex = 4.2):");
        //Aredonda o valor pra cima para virar um número inteiro
        double z = 4.2;
        z = Math.ceil(z);
        System.out.println(z);
        
        System.out.println("ROUND (ex = 5.6)");
        //Aredonda o valor para baixo ou para cima, ex 5.5, 5.6, 5.7 etc > 6.0 já 5.4, 5.3 etc > 5.0
        double n = 5.6;
        n = Math.round(n);
        System.out.println(n);
        
        System.out.println("RANDOM: ");
        //Método 1
        //Gera um número aleatório entre 0 e 1
        double aleatorio = Math.random();
        System.out.println(aleatorio);
        //Método 2
        //Gera um número aleatório entre dois números da sua preferência (neste caso 0 a 10)
        int  f = (int) (0 + aleatorio * (10-0));
        System.out.println(f);
    }
}
