package Tema3.Tema4;

import java.util.Scanner;

/**
 * usando los métodos definidos en el ejercicio anterior, calcule la diferencia
 * en minutos entre dos horas dadas h1 y h2 (representas por dos String). Si
 * alguna de estas horas no estuviera expresada en el formato correcto el
 * programa debe escribir un mensaje de error en pantalla y acabar.
 */

public class Ejercicio9 {

    public static boolean validaFormatoHora(String hora) {
        String patron = "^[0-2][0-9]\\:[0-5][0-9]$";
        return hora.matches(patron);

    }

    public static int diferenciaHoras(String h1, String h2) {
        String[] horasMinutos1, horasMinutos2;
        int minutos1, minutos2, diferencia;
        // Separamos las horas y los minutos
        horasMinutos1 = h1.split(":");
        horasMinutos2 = h2.split(":");

        minutos1 = Integer.parseInt(horasMinutos1[0]) * 60 + Integer.parseInt(horasMinutos1[1]);
        minutos2 = Integer.parseInt(horasMinutos2[0]) * 60 + Integer.parseInt(horasMinutos2[1]);

        diferencia = Math.abs(minutos1 - minutos2);

        return diferencia;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String hora1, hora2;
        int diferencia;

        System.out.println("Introduce la 1a hora: ");
        hora1 = entrada.next();

        System.out.println("Introduce la 2a hora: ");
        hora2 = entrada.next();

        if (!validaFormatoHora(hora1) && !validaFormatoHora(hora2)) {
            System.out.println("Formato de las horas no válido");

        } else {
            diferencia = diferenciaHoras(hora1, hora2);
            System.out.println("La diferencia es de: " + diferencia + " minutos.");
        }
    }
}
