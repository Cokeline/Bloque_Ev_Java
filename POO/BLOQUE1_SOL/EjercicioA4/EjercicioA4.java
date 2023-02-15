package Tema6.EjercicioA4;

public class EjercicioA4 {
    public static void main(String[] args) {

        Articulo a1 = new Articulo();
        a1.nombre = "Camisa de cuadros";
        a1.precio = 20;
        a1.iva = 21;
        a1.cuantosQuedan = 5;

        System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + (a1.precio + (a1.precio * a1.iva / 100)) + "€");

        a1.precio = 10;

        System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + (a1.precio + (a1.precio * a1.iva / 100)) + "€");

    }
}
