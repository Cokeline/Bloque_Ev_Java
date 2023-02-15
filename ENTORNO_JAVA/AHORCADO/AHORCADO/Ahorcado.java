package AHORCADO;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        String hiddenWord = "";
        int remainingAttempts = 10;
        String usedLetters = "";
        int option = 0;
        while (option != 3) {
            System.out.println("________________________________");
            System.out.println("|   Juego del ahorcado         |");
            System.out.println("|       1. Introducir palabra: |");
            System.out.println("|       2. Adivinar palabra:   |");
            System.out.println("|       3. Salir:              |");
            System.out.println("|______________________________|");
            System.out.print("   Seleccione una opción: ");
            option = sc.nextInt();

            sc.nextLine();
            if (option == 1) {
                System.out.print("Introduce la palabra a adivinar: ");
                word = sc.nextLine();
                hiddenWord = "-".repeat(word.length());
            } else if (option == 2) {
                if (word.isEmpty()) {
                    System.out.println("Error: No has introducido una palabra");
                } else {
                    boolean won = false;
                    while (remainingAttempts > 0 && !won) {
                        System.out.print("Adivina la palabra: " + hiddenWord + " | ");
                        System.out.print("Intentos restantes: " + remainingAttempts + " | ");
                        System.out.print("Letras utilizadas: " + usedLetters);
                        System.out.print("Introduce una letra: ");
                        char letter = sc.nextLine().charAt(0);
                        if (usedLetters.indexOf(letter) == -1) {
                            usedLetters += letter;
                            if (word.indexOf(letter) != -1) {
                                hiddenWord = hiddenWord.replace(letter, '-');
                                if (!hiddenWord.contains("-")) {
                                    won = true;
                                    System.out.println("¡Felicidades, has adivinado la palabra!");
                                }
                            } else {
                                remainingAttempts--;
                            }
                        } else {
                            System.out.println("Error: Ya has utilizado esa letra");
                        }
                    }
                    if (!won) {
                        System.out.println("Lo siento, has agotado tus intentos. La palabra era " + word);
                    }
                }
            } else if (option != 3) {
                System.out.println("Error: Opción no válida");
            }
        }
        sc.close();
    }
}
