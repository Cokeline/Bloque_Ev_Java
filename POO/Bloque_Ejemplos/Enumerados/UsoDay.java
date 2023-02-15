public class UsoDay {
    public static void main(String[] args) {
        for (Day recorridoDias : Day.values()) {

            System.out.println(recorridoDias.getSensacio());
        }
        System.out.println("Day monfay imprime"+Day.MONDAY);
        System.out.println("Metodo get "+Day.SATURDAY.getSensacio());
        System.out.println("Metodo get numero"+Day.SATURDAY.getNumeroDia());

    }
}
