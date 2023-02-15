/**
 * ClienteEnums
 */
public class ClienteEnums {

    enum Genero {HOMBRE,MUJER}//Definicion tipo enumerada
    Genero genero;
    String nombre;
    String dni;

    ClienteEnums(String nombre, String dni, String genereo){
        this.nombre = nombre;
        this.dni = dni;
        this.genero = genero.valueOf(genereo);
        //Obligamos al usuario a definir su genero
    }
}