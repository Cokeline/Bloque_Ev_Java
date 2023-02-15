package Ejercicio_Circulo;

public class AplicacionCirculo {
    
public static void main(String[] args) {
    Circulo c1 = new Circulo();
    c1.mostrarDatos();

    c1.setRadio( 20);
    c1.mostrarDatos();

    Circulo c2 = new Circulo();
    c2.setRadio(0);
    c2.mostrarDatos();

    c2.setRadio(-10);

    /*
    Metodes - constructors

     * getters -> consulta el valor de los atributos de la clase
     * setters -> modificador de los atrib
        (No es obligatorio gastar sus sufijos, pero es recomendable)
     */
}    
}
