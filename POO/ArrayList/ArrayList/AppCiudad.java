package ArrayList;

import java.util.ArrayList;

public class AppCiudad {
    public static void main(String[] args) {
        //ArrayList denominado Ciudades vacio

        ArrayList<Ciudad> Ciudades = new ArrayList<>();
        
        Ciudad c1 = new Ciudad("Xativa", 30000, "España");
        Ciudad c2 = new Ciudad("Palermo", 30000, "Italia");
        Ciudad c3 = new Ciudad("Miami", 100000, "USA");
        Ciudad c4 = new Ciudad("Edinburgo", 450000, "UK");

        //Añadir las instancias al ArrayList con el metodo add
        Ciudades.add(c1);

        //System.out.println(Ciudades.toString());

        Ciudades.add(c2);
        Ciudades.add(c3);

        //System.out.println(Ciudades.toString());

        //Ciudades.set(1, c1);
        //System.out.println(Ciudades.toString());

        //Recorrer ArrayList
        /*
        for (Ciudad ciudad : Ciudades) {
            System.out.println("Con el for recorremos el ArrayList " + ciudad);
        }

        for (int i = 0; i < Ciudades.size(); i++) {
            System.out.println("Recorremos " + Ciudades);
            //System.out.println("Recorremos " + Ciudades.get(i));
        }*/

        Ciudades.add(0,c4);
        //System.out.println(Ciudades.toString());

        Ciudades.remove(0);
        //System.out.println(Ciudades.toString());

        Ciudades.add(c4);

        //Metodos para obtener elemento almacenado
        System.out.println("Con el metodo get " + Ciudades.get(3));
        System.out.println("Mostrar index 0 " + Ciudades.get(0).toString());


        Ciudades.remove(new Ciudad("Edinburgo", 450000, "UK"));

        System.out.println(Ciudades.toString());

        Ciudades.remove(new Ciudad("Xativa", 30000, "España"));
    }
}
