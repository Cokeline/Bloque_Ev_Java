package B;

import java.util.Scanner;

public class B1 {
  private Scanner sc;
  private int x;
  private int y;

  public B1(int x,int y)
    {
    
      this.x = x;
      this.y = y;
    
          
    }
    public void pedirDatos() {
      sc = new Scanner(System.in);
  
      System.out.print("\n \t - Introduce la coordenada X: ");
      setX(sc.nextInt());
      System.out.print("\n\t - Introduce la coordenada Y: ");
      setY(sc.nextInt());
    }
  /*
  "%d" y "%d" son placeholders para variables de tipo entero en una cadena de formato en Java. La función String.format utiliza estos placeholders para reemplazarlos con los valores específicos.

En este caso, se utiliza la siguiente cadena de formato: "(%d, %d)". Al llamar a String.format con dos argumentos, los valores de getX() y getY() se reemplazan en los placeholders %d y %d, respectivamente.

La salida final es una cadena que muestra las coordenadas X e Y entre paréntesis, por ejemplo: "(5, 10)"
   */
    public void mostrarDatos() {
      System.out.println(String.format("\n\t (%d, %d)", getX(), getY()));
    }
  
    public int getX() {
      return x;
    }
  
    public void setX(int x) {
      this.x = x;
    }
  
    public int getY() {
      return y;
    }
  
    public void setY(int y) {
      this.y = y;
    }
}
