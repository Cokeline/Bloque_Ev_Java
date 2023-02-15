import java.util.Random;
import java.util.Scanner;
public class Ejer3 {
 
    //APARTADO 1 y 2
    public static int[][] crearMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];
        return matriz;
    }

    //APARTADO 3
    public static void generarValoresAleatorios(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(91);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    //APARTADO 4 - 5 -6
    public static int[][] eliminarFilaColumna(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero de fila a eliminar: ");
        int fila = scanner.nextInt();
        System.out.print("Ingresa el numero de columna a eliminar: ");
        int columna = scanner.nextInt();

        if (fila < 0 || fila >= matriz.length) {
            System.out.println("La fila especificada no existe en la matriz");
            return matriz;
        }

        if (columna < 0 || columna >= matriz[0].length) {
            System.out.println("La columna especificada no existe en la matriz");
            return matriz;
        }
        int[][] nuevaMatriz = new int[matriz.length-1][matriz[0].length-1];
        for (int i = 0, ii = 0; i < matriz.length; i++, ii++) {
            if (i == fila) {
                ii--;
                continue;
            }
            for (int j = 0, jj = 0; j < matriz[i].length; j++, jj++) {
                if (j == columna) {
                    jj--;
                    continue;
                }
                nuevaMatriz[ii][jj] = matriz[i][j];
            }
        }
        System.out.println("Nueva matriz: ");
        for (int i = 0; i < nuevaMatriz.length; i++) {
            for (int j = 0; j < nuevaMatriz[i].length; j++) {
                System.out.print(nuevaMatriz[i][j] + " ");
            }
            System.out.println();
        }
        return nuevaMatriz;
    }



    public static void main(String[] args) {
        int[][] matriz = crearMatriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        generarValoresAleatorios(matriz);
         //APARTADO 7
        int[][] nuevaMatriz = eliminarFilaColumna(matriz);
          
           System.out.println("Matriz original: ");
           for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz[i].length; j++) {
                   System.out.print(matriz[i][j] + " ");
               }
               System.out.println();
           }
       
       
    }
}