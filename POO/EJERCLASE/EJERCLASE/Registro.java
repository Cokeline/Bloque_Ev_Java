package EJERCLASE;

import java.util.Scanner;

public class Registro {
    private String nombre;
    private int permanencia;
    private int salario;

    public Registro() {
        this.nombre = "";
        this.permanencia = 0;
        this.salario = 0;
    }

    public void anotarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del trabajador: ");
        setNombre(sc.nextLine());
        System.out.println("Introduce los años que lleva de permanencia: ");
        setPermanencia(sc.nextInt());
        System.out.println("Introduce el salario de este: ");
        setSalario(sc.nextInt());
    }

    public int antiguedad(int permanencia) {
        if (permanencia < 0) {
            return 0;
        } else if (permanencia >= 0 && permanencia < 5) {
            System.out.println("Esta en el grupo junnior");
            return 1;
        } else {
            System.out.println("Esta en el grupo senior");
            return 2;
        }
    }

    public void mostrarDatos() {
        System.out.print("\n\t - NOMBRE: " + getNombre());
        System.out.print("\n\t - PERMANENCIA: " + getPermanencia()+" años "+ antiguedad(permanencia));
        System.out.print("\n\t - SALARIO: " + getSalario()+" euros");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(int permanencia) {
        if (permanencia >= 0) {
            this.permanencia = permanencia;
        } else {
            System.out.println("La permanencia no puede ser negativa");
        }
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo");
        }
    }
}
