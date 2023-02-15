import java.util.Scanner;
public class Ejer1 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matriz [][] = new int[4][5];
    cargarMatriz(matriz, sc);
    mostrarMatriz(matriz);
    System.out.print("\n\t - Ingrese el numero de columna para calcular la media (0-4): ");
    int columna = sc.nextInt();
    double media = mediaColumna(matriz, columna);
    System.out.println("Media de la columna " + columna + ": " + media);
    
}

public static void mostrarMatriz(int[][] matriz) {

    System.out.println("Matriz: ");

    for (int i = 0; i < matriz.length; i++) {

        for (int j = 0; j < matriz[i].length; j++) {//Para las columnas

            System.out.print(matriz[i][j] + " ");

        }

        System.out.println();

    }

}

public static double mediaColumna(int[][] matriz, int columna) {

    int sum = 0;

    for (int i = 0; i < matriz.length; i++) {

        sum += matriz[i][columna];

    }

    return (double) sum / matriz.length;

}

  
public static void cargarMatriz(int[][] matriz, Scanner scanner) {
   
    for (int i = 0; i < matriz.length; i++) {
   
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("Ingrese el valor para la posicion [" + i + "][" + j + "]: ");
            matriz[i][j] = scanner.nextInt();
   
        }
   
    }

}


}
