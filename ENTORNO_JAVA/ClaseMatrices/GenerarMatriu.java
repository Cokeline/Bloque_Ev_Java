package ClaseMatrices;

import java.util.Random;

public class GenerarMatriu {

    //IRREGULAR
    public static int[][] generarMatrizIrregular(int anchoMin, int anchoMax, int altoMin, int altoMax, int numMax) {
        /* 
        // si hay negativos los convertimos a 0
        if (anchoMin < 0)
            anchoMin = 0;
        if (anchoMax < 0)
            anchoMax = 0;
        if (altoMin < 0)
            altoMin = 0;
        if (altoMax < 0)
            altoMax = 0;

        // si los mínimos son mayores, los igualamos
        if (anchoMin > anchoMax)
            anchoMin = anchoMax;
        if (altoMin > altoMax)
            altoMin = altoMax;
        */
        // generamos matriz
        Random r = new Random();
        //int filas = r.nextInt(altoMin, altoMax+1);  int[][] matriz = new int[filas][];
        int[][] matriz = new int[r.nextInt(altoMin, altoMax+1)][];
        for (int i = 0; i < matriz.length; i++) {
            //int columnas = r.nextInt(anchoMin, anchoMax+1);  int[][] matriz = new int[columnas];
            matriz[i] = new int[r.nextInt(anchoMin, anchoMax+1)];
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(numMax + 1);
            }
        }
        return matriz;
    }

    //REGULAR

    public static int[][] generarMatriz(int lado, int numMax) {
        return generarMatrizIrregular(lado, lado, lado, lado, numMax);
    }
}
