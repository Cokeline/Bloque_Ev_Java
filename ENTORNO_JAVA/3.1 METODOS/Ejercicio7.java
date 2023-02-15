package Tema3.Tema4;

import java.util.Scanner;

/**
 * un método Java que compruebe si un año a es bisiesto, i.e. que devuelva true
 * si a es bisiesto y false sino.
 */
public class Ejercicio7 {

    public static boolean anyoBisiesto(int a) {
        if (a % 4 == 0) {
            if (a % 100 != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anyo;
        boolean bisiesto;

        System.out.println("Introduce el año");
        anyo = entrada.nextInt();

        bisiesto = anyoBisiesto(anyo);

        if (bisiesto) {
            System.out.println("El año " + anyo + " es bisiesto");
        } else {
            System.out.println("El año " + anyo + " no es bisiesto");
        }
    }
}
