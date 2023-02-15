

import java.util.Scanner;

public class ppt {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int i = 0;
        //int menu;
        int pc = 0;
        String herramienta[] = {"Piedra","Papel","Tijera"};
        String resultado[] = {"Empate","Pierdes","Ganas"};
        int jugador = 0;
        System.out.println("****************************************************");
            System.out.println("\n\t - Introduce el nombre del jugador: ");
            java.lang.String jug = sc.nextLine();

        do {
            /*
             * System.out.println("Elige: \n Piedra (1), Papel (2) o Tijera (3)");
            menu = sc.nextInt();
            switch (menu) {
                case 1->{
                    if (pc == 1) {
                        System.out.println("Habeis empatado con el ordenador");
                    }else if (pc == 2) {
                        System.out.println("Perdiste contra la PC!");
                    }else if (pc == 3){
                        System.out.println("ganaste al ordenador!");
                    }
                }
                case 2->{
                    if (pc == 1) {
                        System.out.println("ganaste al ordenador!");
                    }else if (pc == 2) {
                        System.out.println("Has empatado con el ordenador!");
                    }else if (pc == 3){
                        System.out.println("Perdiste contra la PC!");
                    }
                }
                case 3->{  if (pc == 1) {
                    System.out.println("Perdiste contra la PC!");
                }else if (pc == 2) {
                    System.out.println("ganaste al ordenador");
                }else if (pc == 3){
                    System.out.println("Habeis empatado con el ordenador");
                }

                }
                    
             */
            System.out.println("******"+jug+"*******");
            pc =(int)(Math.random()*3);
           
            System.out.println("Selecciona un numero, siendo: \n - Piedra (0) \n - Papel (1) \n - Tijeras (2)");
            jugador =sc.nextInt();

           int respuesta = jugador - pc;

            System.out.println(herramienta[jugador]+"\n  vs "+"\n"+herramienta[pc]);
            
            if (jugador == 2 && pc == 0) {
             
                System.out.println("Ha perdido el jugador");
            
            } else if(jugador == 2 && pc == 1){
             
                System.out.println("Has ganado al PC!");
          
            }else {
             
                System.out.println("Siendo el resultado "+resultado[respuesta]);
            
            }
            


          //System.out.println(pc);
            i++;
           
        } while (i!= 6);
        System.out.println("****************************************************");

    }

    
 
}
