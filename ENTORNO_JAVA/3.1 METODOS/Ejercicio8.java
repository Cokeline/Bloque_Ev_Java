package Tema3.Tema4;

import java.util.Scanner;

/** EXPLICAR L'ÚS DE PATRONS I EXPRESIONS REGULARS
 * un método Java que valide la hora representada en un String h con formato
 * HH:MM. Se considera que una hora es válida cuando su longitud es 5, si
 * contiene dos dígitos correctos seguidos de ’: ’ y dos dígitos correctos más,
 * por lo que el método devuelve true en este caso.
 */
public class Ejercicio8 {

    public static boolean validaFormatoHora(String hora) {
        String patron = "^[0-2][0-9]\\:[0-5][0-9]$";
        return hora.matches(patron);
        

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String hora;

        System.out.println("Introduce la hora: ");
        hora = entrada.next();

        if (validaFormatoHora(hora)) {
            System.out.println("Formato válido");

        } else {
            System.out.println("Formato no válido");
        }
    }
}
