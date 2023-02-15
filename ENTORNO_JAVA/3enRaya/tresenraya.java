import java.util.Scanner;
import java.io.IOException;
import javax.xml.transform.Source;

/**
 * 3enraya
 */
public class tresenraya {
 static char tablero[][] = new char[3][3];
 static int pc;
 static int jugador;
 static int jugador2;
 static int opcion = 0;
 static Scanner sc = new Scanner(System.in);
 public static void DibujarTablero() {

    String casilla1_1 = "";
    String casilla1_2 = "";
    String casilla1_3 = "";
    String casilla2_1 = "";
    String casilla2_2 = "";
    String casilla2_3 = "";
    String casilla3_1 = "";
    String casilla3_2 ="";
    String casilla3_3 ="";
  
    System.out.println("    1        2      3");
    System.out.println(" ╔══════╗╔══════╗╔══════╗");
    System.out.println("1║  " +casilla1_1+      "    ║║  "+casilla1_2+ "    ║║  "+casilla1_3+ "    ║");
    System.out.println(" ║      ║║      ║║      ║");
    System.out.println(" ╠══════╠╠══════╠╠══════╣");
    System.out.println("2║  "+casilla2_1+ "    ║║  "+casilla2_2+ "    ║║  "+casilla2_3+ "    ║");
    System.out.println(" ║      ║║      ║║      ║");
    System.out.println(" ╠══════╠╠══════╠╠══════╣");
    System.out.println("3║  "+casilla3_1+ "    ║║  "+casilla3_2+ "    ║║  "+casilla3_3+ "    ║");
    System.out.println(" ║      ║║      ║║      ║");
    System.out.println(" ╚══════╝╚══════╝╚══════╝");
  
   
}



    public static void MostrarMenu(int opcion) {
       do {
        System.out.println("╔════════════════════════╗");
        System.out.println("║ 1.    Modo 2 jugadores ║");
        System.out.println("║ 2.    Modo 1 jugador   ║");
        System.out.println("║ 3.    Salir            ║");
        System.out.println("╚════════════════════════╝");
        System.out.print("Selecciona una opción: ");
        opcion  = sc.nextInt();
        switch (opcion) {
            case 1:
           jugadores();
                break;
            case 2:
            jugador1(filas, columnas);
            coordenadasAleatorias();
            DibujarTablero(filas, columnas);
            break;
        
            default:
            System.out.println("Elemento introducido incorrecto");
                break;
        }
       } while (opcion!= 3);
      

       }
    
    public boolean comprobacionPosicion(int[][] matriz, int fila, int columna) {
        if(fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length){
            throw new ArrayIndexOutOfBoundsException("Indice fuera de rango");
        }
        if (matriz[fila][columna] == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void jugadores(int filas, int columnas) {
        boolean turno = true; // true = jugador1, false = jugador2
        boolean empate;
        boolean ganador;
        while (ganador == false && empate == false) {
            if (turno) {
                System.out.println("Turno del jugador 1. Introduce en que posición quieres la ficha 'X'.");
                System.out.println("Deberás introducir su cordenada, primero las filas, y luego las columnas (0,2).");
                filas = sc.nextInt();
                columnas = sc.nextInt();
                if (comprobarMovimiento(filas, columnas) == false) {
                    System.out.println("La casilla esta ocupada, no puedes poner la ficha ahi.");
                } else {
                    tablero[filas][columnas] = 88;
                    turno = false;
                }
            } else {
                System.out.println("Turno del jugador 2. Introduce en que posición quieres la ficha 'O'.");
                System.out.println("Deberás introducir su cordenada, primero las filas, y luego las columnas (0,2).");
                filas = src.nextInt();
                columnas = src.nextInt();
                if (comprobarMovimiento(filas, columnas) == false) {
                    System.out.println("La casilla esta ocupada, no puedes poner la ficha ahi.");
                } else {
                    tablero[filas][columnas] = 79;
                    turno = true;
                }
            }
           
        }
    }
    
    
    public static void LimpiarPantalla() {
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("");
        }
    }

    public static void LimpiarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0x0;
            }
        }
    }
    public String comprobarGanador(char[][] tablero) {
        // Comprobar las filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != ' ') {
                return tablero[i][0] + " ha ganado";
            }
        }

        // Comprobar las columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != ' ') {
                return tablero[0][i] + " ha ganado";
            }
        }

        // Comprobar las diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
            return tablero[0][0] + " ha ganado";
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
            return tablero[0][2] + " ha ganado";
        }

        // Comprobar si hay un empate
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(tablero[i][j] == ' '){
                    return "No hay ganador";
                }
            }
        }
        return "Empate";
    }
    /**
     * @param args
     */
    public static void main(String[] args) {     
      
        MostrarMenu(opcion);
      
        
    }
}