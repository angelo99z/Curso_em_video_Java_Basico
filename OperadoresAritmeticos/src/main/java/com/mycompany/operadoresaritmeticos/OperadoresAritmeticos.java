package com.mycompany.operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        System.out.println("========================================");
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) /2;
        System.out.print("A média é igual a : " + m );
        System.out.println("\n========================================");
        
        System.out.println("Caso 1: ");
        int numero1 = 5;
        numero1++;
        System.out.println(numero1);
        
        System.out.println("\nCaso 2: ");
        int numero2 = 5;
        int valor2 = 5 + numero2++;
        System.out.println(valor2);
        
        System.out.println("\nCaso 3:");
        int numero3 = 5;
        int valor3 = 5 + ++numero3;
        System.out.println(valor3);
        
        System.out.println("\nCaso 4:");
        int numero4 = 10;
        int valor4 = 4 + numero4--;
        System.out.println(valor4);
        System.out.println(numero4);
        
        System.out.println("\nCaso 5:");
        int x = 4;
        x += 2;
        System.out.println(x);
        
        System.out.println("\nCaso 6:");
        int y = 4;
        y *= 2;
        System.out.println(y);
    }
}
