package ClaseMatrices;

import java.util.Scanner;

public class LeerMAtrices {
    public static void leerMatrices(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        
    }
}
