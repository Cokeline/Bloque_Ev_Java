package Tema3.Tema4;

import java.util.Scanner;

/**
 * Programa que imprima el carácter tantas veces como te diga el número
 */

public class Ejercicio2 {

    public static void imprimeCaracteres(int n, char c) {
        System.out.println("Imprime caracter: ");
        for (int i = 0; i < n; i++) {
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        char letra;

        System.out.println("Introduce un número: ");
        num = entrada.nextInt();

        System.out.println("Introduce una letra: ");
        letra = entrada.next().charAt(0);

        imprimeCaracteres(num, letra); 
    }
}
