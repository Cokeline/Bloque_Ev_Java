package Tema3.Tema4;

import java.util.Scanner;

/**
 * Escribe un programa en Java que se comporte como un reloj digital, mostrando
 * en pantalla el siguiente mensaje: día hora minutos segundos. El programa
 * pedirá al usuario que introduzca el día de la semana y la hora; por ejemplo:
 * Sábado 11 59 58
 * 
 */
public class Ejercicio13 {

    static String[] dias = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };

    public static boolean validaFecha(String diaDeLaSemana, int h, int m, int s) {

        boolean diaValido = false, horaValida = false, minutoValido = false, segundoValido = false;

        // Valida dia
        for (String dia : dias) {
            if (diaDeLaSemana.toLowerCase().equals(dia)) {
                diaValido = true;
                break;
            }
        }

        // Valida hora
        if (h >= 0 && h <= 23) {
            horaValida = true;
        }

        // Valida minutos
        if (m >= 0 && m <= 59) {
            minutoValido = true;
        }

        // Valida segundos
        if (s >= 0 && s <= 59) {
            segundoValido = true;
        }

        if (diaValido && horaValida && minutoValido && segundoValido) {
            return true;
        }
        return false;

    }

    public static int deFechaASegundos(String diaDeLaSemana, int h, int m, int s) {
        int segundos, posDia = 0;

        // Vemos la posición del dia en el array
        for (int pos = 0; pos < dias.length; pos++) {
            if (diaDeLaSemana.toLowerCase().equals(dias[pos])) {
                posDia = pos;
                break;
            }
        }

        segundos = (posDia * 86400) + (h * 3600 + m * 60 + s); // Los dias que han pasado, más las horas, minutos,
                                                               // segundos

        return segundos;

    }

    public static void deSegundosAFecha(int s) {
        int dia, hora, minuto, segundo, resto;

        dia = s / 86400;
        resto = s % 86400;
        hora = resto / 3600;
        resto = resto % 3600;
        minuto = resto / 60;
        segundo = resto % 60;

        System.out.println(dias[dia] + " " + hora + " " + minuto + " " + segundo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fecha, dia;
        int horas, minutos, segundos, posDia = 0;
        String[] fechaFormatada;

        System.out.println("Introduce la fecha (dia hora minutos segundos): ");
        fecha = entrada.nextLine();
        fechaFormatada = fecha.split(" ");
        dia = fechaFormatada[0];
        horas = Integer.parseInt(fechaFormatada[1]);
        minutos = Integer.parseInt(fechaFormatada[2]);
        segundos = Integer.parseInt(fechaFormatada[3]);

        // Nos aseguramos de que el formato de la fecha sea válido
        while (!validaFecha(dia, horas, minutos, segundos)) {
            System.out.println("Fecha no válida.");
            System.out.println("Introduce la fecha en formato (dia hora minutos segundos): ");
            fecha = entrada.nextLine();
            fechaFormatada = fecha.split(" ");
            dia = fechaFormatada[0];
            horas = Integer.parseInt(fechaFormatada[1]);
            minutos = Integer.parseInt(fechaFormatada[2]);
            segundos = Integer.parseInt(fechaFormatada[3]);
        }

        // Vemos la posición del dia en el array, lo necesitamos para hacer bien el
        // cambio
        for (int pos = 0; pos < dias.length; pos++) {
            if (dia.toLowerCase().equals(dias[pos])) {
                posDia = pos;
                break;
            }
        }

        // Generamos las 100 fechas pasados los 100 segundos
        for (int i = 0; i < 100; i++) {
            // Nos asguramos de hacer bien el cambio
            segundos++;
            if (segundos > 59) {
                segundos = 0;
                minutos++;
                if (minutos > 59) {
                    minutos = 0;
                    horas++;
                    if (horas > 23) {
                        horas = 0;
                        posDia++;
                        dia = dias[posDia];
                    }
                }
            }

            deSegundosAFecha(deFechaASegundos(dia, horas, minutos, segundos));
        }

    }
}
