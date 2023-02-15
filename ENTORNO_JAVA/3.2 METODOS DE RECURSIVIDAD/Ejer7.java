public class Ejer7 {
//Sin excepcion de division entre 0
    public static int divide(int n, int m) {
        if (n < m) {
            return 0;
        } else {
            return 1 + divide(n - m, m);
        }
    }

    //Con excepcion de division entre 0
    public static int dividecon0(int n, int m) {
        if (m == 0) {
            System.out.println("Error: division by zero");
            return 0;
        }
        if (n < m) {
            return 0;
        } else {
            return 1 + divide(n - m, m);
        }
    }
    

}
