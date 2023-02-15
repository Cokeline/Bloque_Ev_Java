public class Ejer6 {

    public static boolean isAlphabeticallySorted(String word) {
        if (word.length() <= 1) {
            return true;
        } else {
            if (word.charAt(0) <= word.charAt(1)) {
                return isAlphabeticallySorted(word.substring(1));
            } else {
                return false;
            }
        }
    }
    /*
     String word = "abc";
boolean sorted = isAlphabeticallySorted(word);
System.out.println("La palabra " + word + (sorted ? " esta " : " no esta ") + " ordenada alfabeticamente");

     */
    //Para obviar si son mayusculas o minusculas:

    public static boolean isAlphabeticallySortedIgnoreCase(String word) {
        if (word.length() <= 1) {
            return true;
        } else {
            if (word.substring(0,1).compareToIgnoreCase(word.substring(1,2)) <= 0) {
                return isAlphabeticallySortedIgnoreCase(word.substring(1));
            } else {
                return false;
            }
        }
    }
   /*
     
String word = "AbC";
boolean sorted = isAlphabeticallySortedIgnoreCase(word);
System.out.println("La palabra " + word + (sorted ? " esta " : " no esta ") + " ordenada alfabeticamente");


    */
}