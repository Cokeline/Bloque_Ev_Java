package Tema6.EjercicioE3;

import static java.lang.Math.abs;
import static java.lang.Math.min;

import java.util.Random;

public class Rectangulo {
    private int x1, y1, x2, y2;
    private final static int MIN = 0;
    private final static int MAX = 100;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        // Comprobamos si es un rectángulo válido
        if ((x1 < x2) && (y1 < y2) && (x1 >= Rectangulo.MIN && x1 <= Rectangulo.MAX) && (x2 >= Rectangulo.MIN && x2 <= Rectangulo.MAX) && (y1 >= Rectangulo.MIN && y1 <= Rectangulo.MAX) && (y2 >= Rectangulo.MIN && y2 <= Rectangulo.MAX)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;

        } else {
            System.out.println("ERROR al intanciar el Rectángulo (" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")");
        }
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        if (x1 > this.x2) {
            System.err.println("ERROR el valor de x1 no puede ser mayor que el valor de x2");
        } else {
            this.x1 = x1;
        }

    }

    public void setY1(int y1) {
        if (y1 > this.y2) {
            System.err.println("ERROR el valor de y1 no puede ser mayor que el valor de y2");
        } else {
            this.y1 = y1;
        }
    }

    public void setX2(int x2) {
        if (x2 < this.x1) {
            System.err.println("ERROR el valor de x2 no puede ser menor que el valor de x1");
        } else {
            this.x2 = x2;
        }

    }

    public void setY2(int y2) {
        if (y2 < this.y1) {
            System.err.println("ERROR el valor de y2 no puede ser menor que el valor de y1");
        } else {
            this.y2 = y2;
        }

    }

     // Setter X1Y1
     public void setX1Y1(int x1, int y1) {
        this.setX1(x1);
        this.setY1(y1);
    }

    // Setter X2Y2
    public void setX2Y2(int x2, int y2) {
        this.setX2(x2);
        this.setY2(y2);
    }

    // Setter X1Y1 X2Y2 (todos)
    public void setAll(int x1, int y1, int x2, int y2) {
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
    }

    // Obtener el perimetro
    public int getPerimetro() {;
        return abs(this.x1 - this.x2) * 2 + abs(this.y1 - this.y2) * 2;
    }

    // Obtener el area
    public int getArea() {
        return abs(this.x1 - this.x2) * abs(this.y1 - this.y2);
    }

    // imprime informacion rectangulo
    public void imprime() {
        System.out.println("Coordenadas: (" + this.x1 + "," + this.y1 + ")-(" + this.x2 + "," + this.y2 + ")");
        System.out.println("Perimetro: " + this.getPerimetro());
        System.out.println("Area: " + this.getArea());
    }

    public static Rectangulo generarRectangulo() {
        Random r = new Random();
        int a, b, c, d;
        a = r.nextInt(Rectangulo.MAX);
        b = r.nextInt(Rectangulo.MAX);
        c = min(100, a + r.nextInt(Rectangulo.MAX));
        d = min(100, b + r.nextInt(Rectangulo.MAX));
        Rectangulo tmp = new Rectangulo(a, b, c, d);
        return tmp;
    }
}
