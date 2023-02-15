import java.util.ArrayList;
import java.util.Scanner;

public class Ejer4_5 {

    public static ArrayList<Integer> pedirNumeros() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Introduce un número (escribe 'fin' para terminar): ");
            String numero = sc.nextLine();
            if (numero.equals("fin")) {
                break;
            }
            numeros.add(Integer.parseInt(numero));
            numeros.sort(Integer::compareTo);
        }
        return numeros;
    }

    public static void mostrarNumeros(ArrayList<Integer> numeros) {
        System.out.println("Números introducidos: " + numeros);
    }

    public static boolean buscarNumero(ArrayList<Integer> numeros, int numero) {
        int inicio = 0;
        int fin = numeros.size() - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (numeros.get(medio) == numero) {
                return true;
            } else if (numeros.get(medio) < numero) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = pedirNumeros();
        mostrarNumeros(numeros);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Introduce el número a buscar (escribe 'fin' para terminar): ");
            String numero = sc.nextLine();
            if (numero.equals("fin")) {
                break;
            }
            int numeroBuscado = Integer.parseInt(numero);
            boolean encontrado = buscarNumero(numeros, numeroBuscado);
            if (encontrado) {
                System.out.println("El número " + numeroBuscado + " se encuentra en el array.");
            } else {
                System.out.println("El número " + numeroBuscado + " no se encuentra en el array.");
            }
        }
    }
}
