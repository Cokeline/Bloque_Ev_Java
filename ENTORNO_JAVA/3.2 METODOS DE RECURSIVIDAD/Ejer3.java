public class Ejer3 {
    public static int sumVector(int[] vector, int n) {
        if (n == 0) {
            return vector[n];
        } else {
            return vector[n] + sumVector(vector, n - 1);
        }
    }
    
}
