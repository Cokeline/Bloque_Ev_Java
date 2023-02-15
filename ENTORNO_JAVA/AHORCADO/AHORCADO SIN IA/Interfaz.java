package AHORCADO;
import javax.swing.JFrame;

public class Interfaz extends JFrame{
    public void Ventana(){
        //Este es el constructor
        //Hay que determinar el tamaño
       setSize(10000,5000);
        //se determina con el orden ancho x largo
        //El metodo set.Size deriva de la clase window
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Pertenece a Jframe
        //Esta etiqueta sirve para lograr que al pulsar 'x' sobre la ventana, se cierre el programa
       
        setTitle("AHORCADO DE ADRIAN ARACIL");
        //set = establecer - title = titulo (DE LA VENTANA)
       
        // setLocation(100,200);
        //Para que no coja desde la esquina superior del monitor, pto 0,0
        //Al dar valores numericos establecemos la posicion, viendolo como una gráfica de x e y
        
       setLocationRelativeTo(null); 
       //para que la ventana este centrada en cualquier pc
        
        //setBounds(500,700,5000,4000);
        //hace de set size y location a la vez
        //el orden de los datos es primero el set location y luego el size
        //Trabajamos con pixeles
    }
}
