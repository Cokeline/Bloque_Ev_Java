package Enumerados;
public enum Day {
    MONDAY("Estoy cansado",1);
    TUESDAY("sigo cansado",2);
    FRIDAY("Viene lo nueno",3);
    SATURDAY("Estoy disfrutando",4);
    SUNDAY("NooOoOoOoOo",5);
   
    private Day(String s){
        actividad = s;
        numerodia = num;
    }

    public String getSensacio(){
        return actividad;

    }
    private String actividad;
}
