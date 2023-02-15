package Vehiculo;

public class UsoVehiculo {
    public static void main(String[] args) {

        Vehiculos miCoche = new Vehiculos();
        // miCoche es objecte

        miCoche.getDatosVehiculos();
        miCoche.setColor();
        miCoche.getDatosVehiculos();

        Vehiculos miNuevoCoche = new Vehiculos();
        miNuevoCoche.setColor("verde");
        miNuevoCoche.getDatosVehiculos();

        Vehiculos miNuevoCoche2 = new Vehiculos();
        miNuevoCoche2.setColor("amarillo");
        miNuevoCoche2.getDatosVehiculos();

        Vehiculos miMoto = new Vehiculos(2);
        miMoto.getDatosVehiculos();

        Vehiculos miCoche4 = new Vehiculos(2, 3, 4, 5, "fucsia");
        miCoche4.getDatosVehiculos();
    }
}

