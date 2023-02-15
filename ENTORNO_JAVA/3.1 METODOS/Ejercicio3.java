package Tema3.Tema4;

import java.util.Scanner;

/**
 * Programa que te pida un número que será la base hasta que le metas un número
 * menor que 50. Una vez tengas la base pedirá un exponente hasta que sea menor
 * de 10. Una vez tengas la base y el exponente llamar a un método que te haga
 * el cálculo
 */

public class Ejercicio3 {

    public static int potencia(int x, int y) {
        int potencia = 1;
        for (int i = 0; i < y; i++) {
            potencia *= x;
        }
        return potencia;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base, exponente, potencia;

        do {
            System.out.println("Introduce la base");
            base = entrada.nextInt();
            if (base >= 50) {
                System.out.println("El valor introducido no es correcto, debe ser menor a 50");
            }
        } while (base >= 50);

        do {
            System.out.println("Introduce el exponente");
            exponente = entrada.nextInt();
            if (exponente >= 10) {
                System.out.println("El valor introducido no es correcto, debe ser menor a 10");
            }
        } while (exponente >= 10);

        potencia = potencia(base, exponente);

        System.out.println(base + " elevado a " + exponente + " es igual a " + potencia);
    }
}
