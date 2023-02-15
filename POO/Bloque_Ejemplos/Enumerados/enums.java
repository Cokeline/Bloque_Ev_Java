import java.util.Scanner;

public class enums {
    //utiliza la clase enum y no class
    public enum DiasdelaSemana{
        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO, DOMINGO
    }
    public static void main(String[] args) {
        System.out.println(DiasdelaSemana.LUNES);
        DiasdelaSemana primerDiadelaSemana = DiasdelaSemana.MARTES;
        System.out.println("Primer dia de la semana "+primerDiadelaSemana);
        Scanner sc = new Scanner(System.in);
        System.out.println("Que dia es?");
        String diaNuevo = sc.nextLine();
        DiasdelaSemana dia = DiasdelaSemana.valueOf(diaNuevo);
        switch (dia) {
            case LUNES:
                
            System.out.println("Los lunes al sol");
            break;
            case VIERNES:
            System.out.println("Ya empieza el finde");    
            break;
            default:
                break;
        }
    }
}
