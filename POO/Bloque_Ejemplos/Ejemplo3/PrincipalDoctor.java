package Ejemplo3;

import javax.print.Doc;

public class PrincipalDoctor {
    public static void main(String[] args) {
        Doctor doctorN = new Doctor();
        doctorN.nombre = "Naiara";
        doctorN.MostrarNombre();
        doctorN.MostrarIdNo(); //No static

        Doctor doctorN1 = new Doctor();
        doctorN1.nombre = "Jordi";
        doctorN1.MostrarNombre();
        doctorN1.MostrarIdNo(); //No static

        Doctor doctorN2 = new Doctor();
        doctorN2.nombre = "Ana";
        doctorN2.MostrarNombre();
        doctorN2.MostrarIdNo(); //No static
        Doctor.getMostrarId();//metodo estatico
        System.out.println("El valor de Doctor,id es "+Doctor.id);
        System.out.println("El valor de Codigo Nomina "+Doctor.getCodigoNomina());
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

Doctor DoctorP =new Doctor("PedroPicapiedra");

    }
}
