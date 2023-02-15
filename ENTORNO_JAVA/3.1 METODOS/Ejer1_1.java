import java.util.Scanner;
public class Ejer1_1 {
    //Dados dos números y diga si están ordenados ascendentemente o descendentemente
  
    public static boolean ascendente(int x , int y){
        if (x < y) {
            return true;
        } else {

            return false;

        }
    }
    public static void main(String[] args) {
        int num1;
        int num2;
        boolean ascendentes = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        num1 = sc.nextInt();
        System.out.println("Introducir otro numero: ");
        num2 = sc.nextInt();
        ascendentes = ascendente(num1, num2);

        if (ascendentes) {
            System.out.println("El orden es ascendente");
        } else {
            System.out.println("El orden es descendente");
        }

    }
}
