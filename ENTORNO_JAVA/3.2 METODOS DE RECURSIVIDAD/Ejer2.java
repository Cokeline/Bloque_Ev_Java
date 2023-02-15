public class Ejer2 {
    
    public static int sumDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + sumDigits(num / 10);
        }
    }
    
}
