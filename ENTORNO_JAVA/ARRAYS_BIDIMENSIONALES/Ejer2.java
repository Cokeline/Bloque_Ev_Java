import java.util.Random;

public class Ejer2 {
    //Clase Matriz para manipular matrices cuadradas
    //Hay que clasificarlo en metodos
    //pasar parametros en dimension n(numeros reales)
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        llenarMatrizAleatoriamente(3, 3);
        mostrarMatriz(matriz);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz4 = new int[3][3];

        sumarMatrices(matriz1, matriz2);
        crearMatrizIdentidad(3);
        esMatrizSimetrica(matriz4);
        invertirHorizontalmente(matriz4);
        obtenerMatrizTraspuesta(matriz4);
     
        }
        
    //Apartado A: Metodo para llenar la matriz de datos aleatorios
    
    public static void llenarMatrizAleatoriamente(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();
        System.out.println("\n\t - APARTADO A");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
     
    }
    
    //Apartado B: Metodo para visualizar una matriz 
    
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("\n\t - APARTADO B");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    //Apartado C: Metodo que suma dos matrices dadas como parametros y devuelve la matriz suma
    public static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] matrizSuma = new int[filas][columnas];
        System.out.println("\n\t - APARTADO C");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Apartado D: Metodo que crea la matriz identidad
    public static void crearMatrizIdentidad(int n) {
        int[][] matrizIdentidad = new int[n][n];
        System.out.println("\n\t - APARTADO D");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1;
                } else {
                    matrizIdentidad[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }
    }

/*
una matriz identidad es una matriz cuadrada en la cual todos sus elementos son 0 excepto 
los elementos de la diagonal principal que son 1, y su simbolo matematico es la letra "I".
*/  
    //Apartado E
    public static void esMatrizSimetrica(int[][] matriz) {
        boolean esSimetrica = true;
        System.out.println("\n\t - APARTADO E");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j && matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
        }
        if (esSimetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
    }

    //Apartado F: Metodo para que una matriz se invierta horizontalmente
    public static void invertirHorizontalmente(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        System.out.println("\n\t - APARTADO F");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][columnas - j - 1];
                matriz[i][columnas - j - 1] = temp;
           
             System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }       
    }
    
    //Apartado G: Metodo para obtener la matriz traspuesta
    public static void obtenerMatrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTraspuesta = new int[columnas][filas];
        System.out.println("\n\t - APARTADO G");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
                System.out.print(matrizTraspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}   

