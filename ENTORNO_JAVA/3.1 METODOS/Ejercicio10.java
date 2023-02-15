package Tema3.Tema4;

import java.util.Scanner;

/**
 * un método Java que obtenga el número resultante de invertir el orden de las
 * cifras de un número entero n dado.
 */
public class Ejercicio10 {

    public static int inverso(int numero) {

        int numeroInverso = 0, contCifras = 0, aux, cifra;

        // Contamos el número de cifras
        aux = numero;
        while (aux > 0) {
            aux = aux / 10;
            contCifras++;
        }

        contCifras--;
        // Generamos el número inverso, utilizando potencias de 10
        while (numero > 0) {
            cifra = numero % 10;
            numeroInverso += cifra * Math.pow(10, contCifras);
            contCifras--;
            numero = numero / 10;
        }

        return numeroInverso;
    }

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        numero = entrada.nextInt();

        System.out.println("El numero inverso es: " + inverso(numero));
    }
}
