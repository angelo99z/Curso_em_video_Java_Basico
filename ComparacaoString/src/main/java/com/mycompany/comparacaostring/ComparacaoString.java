/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author angel
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Angelo";
        String nome2 = "Angelo";
        String nome3 = new String("Angelo");
        String resultado1;
        String resultado2;
        String resultado3;
        //Compara as variáveis nome1 e nome2
        resultado1 = (nome1==nome2)? "Igual":"diferente";
        
        //Compara as variáveis nome1 e nome3, pela váriavel nome3 ser criada de forma diferente, o resultado da diferente
        resultado2 = (nome1==nome3)? "igual":"diferente";
        
        //Compara o RESULTADO das variáveis nome1 e nome3, agora sim dando igual
        resultado3 = (nome1.equals(nome3))? "igual":"diferente";
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        
    }
}
