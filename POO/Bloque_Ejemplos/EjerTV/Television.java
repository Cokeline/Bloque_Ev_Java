package EjerTV;

/**
 * Television
 */
public class Television {
private int canal;

    public Television(){
        canal = 10;
    }

    //methods
    public void subirCanal() {
        canal++;
    }
    public void bajarCanal() {
        canal--;
    }

    public int getCanal() {
        return canal;        
    }
    
}