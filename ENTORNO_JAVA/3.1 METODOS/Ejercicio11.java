package Tema3.Tema4;

import java.util.Scanner;

/**
 * un método Java que escriba en la salida estándar una línea de texto dada con 
 * todas sus minúsculas convertidas en mayúsculas y viceversa, 
 * sin cambiar ningún otro carácter; además, el método debe devolver 
 * como resultado el número de cambios realizados. 
 */



public class Ejercicio11 {

    public static String cadenaCambiada(String cadena) {
        String resultado = "";

        for (int i = 0; i <= cadena.length() - 1; i++) {
            char car = cadena.charAt(i);
            char car2;
            if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
                car2 = (char)(car - 32);
                resultado += car2;
            }
            else if( cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z'){
                resultado += cadena.charAt(i)+ 32;
            }

        }
        return resultado;

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la cadena a cambiar: ");
        String cadena = entrada.next();
        System.out.println(cadenaCambiada(cadena));
    }
}
