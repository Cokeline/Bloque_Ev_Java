package Ejemplo3;

import javax.print.Doc;


public class Doctor {
    static int id = 0;

    int idNoStatic = 0;

    // Encapsulamiento
    private static int CodigoNomina = 1000;

    int edad;
    String genero;
    String nombre;
    String especialidad;
    String poblacion;

    // Constructor
    Doctor() {
    
        System.out.println("Constructor del objeto doctor.");
        idNoStatic++;

    }

    Doctor(String nombre) {
    
        this.nombre = nombre;
        System.out.println("El nombre del doctor es: " + nombre);
        id++;
        CodigoNomina += 2;
    
    }

    // Sobrecarga de constructores

    Doctor(String nombre, int edad, String genero) {
    
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    
    }

    Doctor(String nombre, int edad, String genero, String especialidad) {
    
        this(nombre, edad, genero); // Obligatorio en la primera linea
        this.especialidad = especialidad;
        this.poblacion = "Valencia";
    
    }

    Doctor(String nombre, String poblacion) {
    
        this(nombre);
        this.poblacion = poblacion;
    
    }

    // Metodos o Comportamientos
    public void MostrarNombre() {
    
        System.out.println("El nombre del doctor es: " + this.nombre);
    
    }

    // Static
    public static void getMostrarId() {// Variables de instacian tienen que ser estaticas (static)
    
        System.out.println("ID doctor es " + id);
    
        System.out.println("El doctor tiene el numero " + CodigoNomina + " de codigo de nomina");
    
    }

    public void MostrarIdNo() {
    
        System.out.println("ID doctor NO static es " + idNoStatic);
    
    }

    public static int getCodigoNomina() {
    
        return CodigoNomina;
    
    }

    public void mostrarDatosThis() {
    
        System.out.println(
    
        "El nombre del doctor es " + nombre + " tiene una edad de " + edad + " es de genero " + genero
    
        + " y su especialidad es " + especialidad + " y su poblacion es " + poblacion);
    
    }

    public void mostrarDatosThis(String poblacion) {
            
        System.out.println(
        
        "El nombre del doctor es " + nombre + " tiene una edad de " + edad + " es de genero " + genero
        
        + " y su especialidad es " + especialidad + " y su poblacion es " + poblacion);
    
    }

     void accesoStatic() {
        System.out.println(edad);// no static
        System.out.println(id);//static
    }

    static void accesoPubli(){
        //System.out.println(edad); no static
        System.out.println(id);//static
    }

    public void setedad(int edad){
        if (edad < 18) {
            
            System.out.println("Eres menor para ser medico");

        } else {
            
            System.out.println("Tienes la edad necesaria para ser Doctor!");
        }
    }

}