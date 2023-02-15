package Ejercicio_Circulo;

public class Circulo {
    private double radio;//Como es private solo se puede usar en esta clase
    private String color;
    private int centroX, centroY;
       //CONSTRUCTOR:
       Circulo(){
        radio = 50;
        color = "negro";
        centroX = 100;
        centroY = 100;
        //no usar return
    }
    //Podemos tener varios constructores
    Circulo(double r){
        setRadio(r);
        color = blanco;
        centroX = 0;
        centroY = 0;
    }
    //Hasta aquí
    public double getRadio() {
    
        return radio;
    
    }

    public void setRadio(double nuevoRadio) {
    
        radio = nuevoRadio;
    
    }

    public void decrece() {
    
        radio = radio /1.3;
    
    }

    public double area() {
        
        return Math.PI * radio * radio;

    }
    public void mostrarDatos() {
       
        System.out.println("Circulo de radio "+ radio+" color "+color+" centro "+centroX+" , "+centroY);

    }
 
}
