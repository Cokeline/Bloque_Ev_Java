public class Ejer8 {
   
    public static int sumNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumNaturalNumbers(n - 1);
        }
    }
    
}
