public class Vehiculos {
    // Fabrica de vehiculos
    // Variables de instancia

    private int ruedas;
    private int largo;
    private int ancho;
    private int peso;
    private String color;

    // Constructor

    public Vehiculos(int ruedas, int largo, int ancho, int peso, String color) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
        this.color = color;
    }
    public Vehiculos() {
        this.ruedas = 4;
        this.largo = 2;
        this.ancho = 1;
        this.peso = 2;
        this.color = "sin color";
    }

    public Vehiculos(int ruedas){
        this.ruedas = ruedas;
    }

    // metodo de acceso --> Setter
    public void setColor() {
        this.color = "azul";
    }

    public void setColor(String colorVehiculo) {
        this.color = colorVehiculo;
    }

    // metodo devolucion propiedad --> Getter
    public String getColor() {
        return color;
    }

    public void getDatosVehiculos() {
        System.out.println("Tu vehículo tiene " + ruedas + " ruedas y además tiene " + largo
                + " m de largo. Es de color " + color);
    }

    public String getDatosVehiculos2() {
        return "Tu vehículo tiene " + ruedas + " ruedas y además tiene " + largo + " m de largo";
    }

}