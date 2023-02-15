package ClaseMatrices;



public class GenerarMatriz2 {

     // generamos matriz
  
     public static int[][] generarMatrizIrregular(int anchoMin, int anchoMax, int altoMin, int altoMax, int numMax) {
   
     int[][] matriz = new int[(int) (Math.random() * (altoMax+1 -altoMin)+altoMin)][];
     
     for (int i = 0; i < matriz.length; i++) {
    
         matriz[i] = new int[(int) (Math.random() * (anchoMax + 1 - anchoMin) + anchoMin)];

         for (int j = 0; j < matriz[i].length; j++) {
             matriz[i][j] = (int) (Math.random()*numMax+1);
         }
     }
     return matriz;
 }

 public static int[][] generarMatriz2(int lado, int numMax) {
    return generarMatrizIrregular(lado, lado, lado, lado, numMax);
}
    
}
