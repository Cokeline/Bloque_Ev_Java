package Tema3.Tema4;

import java.util.Scanner;

/**
 * una aplicación que genere una contraseña al azar que incluirá números,
 * mayúsculas y minúsculas. El programa pedirá la longitud de la contraseña,
 */
public class Ejercicio12 {

    public static String generaContrasenya(int longitud) {
        String contrasenya = "";

        while (contrasenya.length() < longitud) {

            switch ((int) (Math.random() * (3 - 0 + 1) + 0)) {

                case 0:

                    contrasenya += generaNumero();

                    break;

                case 1:

                    contrasenya += generaMinuscula();

                    break;

                case 2:

                    contrasenya += generaMayuscula();

                    break;
                default:

            }

        }

        return contrasenya;

    }

    public static int generaNumero() {

        int aleatorio = (int) Math.floor(Math.random() * 9);

        return aleatorio;

    }

    // a=97, z=122
    public static char generaMinuscula() {

        char aleatorio = (char) Math.floor(Math.random() * (122 - 97 + 1) + 97);

        return aleatorio;

    }

    // A=65, Z=90
    public static char generaMayuscula() {

        char aleatorio = (char) Math.floor(Math.random() * (90 - 65 + 1) + 65);

        return aleatorio;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int longitud;

        System.out.println("Introduce la longitud de la contraseña: ");
        longitud = entrada.nextInt();

        System.out.println(generaContrasenya(longitud));
    }
}
