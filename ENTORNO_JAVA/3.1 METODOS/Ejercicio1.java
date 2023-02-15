import java.util.Scanner;

/**
 * Dados dos números y diga si están ordenados ascendentemente o
 * descendentemente
 */

public class Ejercicio1 {

    public static boolean ordenAscendente(int x, int y) {
        if (x < y) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        boolean ascendente = true;

        System.out.println("Introduce un número");
        num1 = entrada.nextInt();

        System.out.println("Introduce otro número");
        num2 = entrada.nextInt();

        ascendente = ordenAscendente(num1, num2);

        if (ascendente) {
            System.out.println("Orden ascendente");
        } else {
            System.out.println("Orden descendente");
        }
    }
}
