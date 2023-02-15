package Tema3.Tema4;

import java.util.Scanner;

/**
 * Programa que imprime el siguiente menú con una método imprimir()
 */

public class Ejercicio4 {

    public static void imprimir(int x) {
        switch (x) {
            case 1:
                System.out.println("Error en la memoria");
                break;
            case 2:
                System.out.println("Papel atascado en la impresora");
                break;
            case 3:
                System.out.println("Disco defectuoso");
                break;
            default:
                System.out.println("Error indefinido");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo;

        System.out.println("Introduce un código del 1 al 3");
        codigo = entrada.nextInt();

        imprimir(codigo);
    }
}
