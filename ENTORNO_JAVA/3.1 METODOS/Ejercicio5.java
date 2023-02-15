package Unidad04;

import java.util.Scanner;

public class Ejercicio5 {

    static double mediaVector(double[] vector) {
        double media = 0, suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        media = suma / vector.length;

        return media;
    }

    static void porEncimaMedia(double[] vector, double media){
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] > media){
                System.out.println(vector[i]);
            }
        }
    }

    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        int numNumeros;
        double[] vectorNumeros;
        double media = 0;

        System.out.println("Cuantos números vas a introducir?");
        numNumeros = entrada.nextInt();
        vectorNumeros = new double[numNumeros];

        // Plenem de contingut el vector
        for (int i = 0; i < vectorNumeros.length; i++) {
            System.out.println("introduce un num:");
            vectorNumeros[i] = entrada.nextDouble();
        }

        media = mediaVector(vectorNumeros);
        System.out.println(" La media del vector es : " + media);

        porEncimaMedia(vectorNumeros, media);

    }
}
