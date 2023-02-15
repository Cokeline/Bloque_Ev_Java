/**
 * Ejer1
 */
public class Ejer1 {

 public static int reverseNumber(int num) {
        if (num < 10) {
            return num;
        }
        else {
            return (num % 10) * (int) Math.pow(10, (int) (Math.log10(num))) + reverseNumber(num / 10);
        }
    }
}
