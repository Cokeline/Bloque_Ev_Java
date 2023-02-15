package A;

import java.util.Scanner;

/**
 * A1
 */
public class Aestructura {

    public void Punto(int x,int y){
      Scanner sc = new Scanner(System.in);

      System.out.print("\n\t - Introduce la coordenada X: ");
      x = sc.nextInt();
      System.out.print("\n\t - Introduce la coordenada Y: ");
      y = sc.nextInt();

      System.out.println("\n Tus cordenadas son: \n("+x+" , "+y+")");
     
    }

    public void Persona(){
      int dni,edad;
       String nom, cognom;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("\n\t - Introduce el nombre: ");
      nom = sc.nextLine();
      System.out.print("\n\t - Introduce el apellido: ");
      cognom = sc.nextLine();
      System.out.print("\n\t - Introduce un numero de Dni: ");
      dni = sc.nextInt();
      System.out.print("\n\t - Introduce la edad: ");
      edad = sc.nextInt();


      char tabla[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
  System.out.print(nom+" "+cognom);     
     
  if (dni < 1){
  
    System.out.print(" tiene valores introducidos en el dni incorrectos");
  
    } else {
       
  
        System.out.print(", tiene el "+dni+" "+ tabla[dni % 23]);
  
        }
  if (edad < 18) {
  
    System.out.print(" es menor de edad.");
  
  } else {
    
    System.out.print(" es mayor de edad");

  }
  
  }

  public void Rectangulo(int x, int y, int xx, int yy) {
   Scanner sc = new Scanner(System.in);

    System.out.print("\n\t - Introduce la cordenada X1: ");
    x = sc.nextInt();
    System.out.print("\n\t - Introduce la cordenada Y1: ");
    y = sc.nextInt();
    System.out.print("\n\t - Introduce la cordenada X2: ");
    xx = sc.nextInt();
    System.out.print("\n\t - Introduce la cordenada Y2: ");
    yy = sc.nextInt();

    System.out.println("\n Las cordenadas de tu cuadrado son: "+"\n\t ("+x+" , "+y+") y ("+xx+" , "+yy+")");
    

  }

  public void Articulo(String product, int price, int canti, double pvp) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\n\t - Introduce el nombre del producto: ");
    product = sc.nextLine();
    System.out.print("\n\t - Introduce la cantidad restante en el almacen: ");
    canti = sc.nextInt();
    System.out.print("\n\t - Introduce el precio del producto en $: ");
    price = sc.nextInt();
    
    pvp = (price * (IVA / 100)) + price;
    
    System.out.println("\n\t"+product+" con la cantidad de "+canti+"  \n\t precio: "+price+"$ - IVA: "+IVA+" % - PVP: "+pvp+"$");
  
  }
  
  public static final double IVA = 21;

  

}