package AHORCADO;

import java.util.Scanner;

/**
 * Juego con JFRAME PARA EMPEZAR CON LAS INTERFACES
 */
public class Juego {
    public static void main(String[] args) {
       
           Interfaz i1 = new Interfaz();
        i1.setVisible(true);
        //Para que se vea la ventana
        
        String carac[]= {"-"};
        String palabra = "";
        int menu;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("////////Selecciona una de las siguientes opciones!!::///////");

        System.out.println("__________________________________________");
        System.out.println("|                                        |");
        System.out.println("|           1.Introducir palabra         |");
        System.out.println("|           2.Adivinar palabra           |");
        System.out.println("|           3.Salir                      |");
        System.out.println("|________________________________________|");
        System.out.print("\n\t - Introduce una decision: ");
        menu = sc.nextInt();

        while (menu!=1) {
            System.out.println("Te has equivocado de opcion, ¡¡empieza por la primera opcion!!");
            menu = sc.nextInt();
        }

       do {
       
        if(menu == 1) { 
            
                System.out.print("\n - Tu palabra es: ");
                palabra = sc.nextLine();
                sc.nextLine();     
        }

        System.out.print("\n\t - Introduce la siguiente decision: ");
        menu = sc.nextInt();
      
       } while (menu!=3);

    

   
   
    System.out.println("/////////////////////////////////////////////////////////////////");

        

     
  
           

       

    }          
}