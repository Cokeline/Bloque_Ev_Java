public class Ejer4 {
    
    public static int multiplyVector(int[] vector, int n) {
        if (n == 0) {
            return vector[n];
        } else {
            return vector[n] * multiplyVector(vector, n - 1);
        }
    }
    
}
