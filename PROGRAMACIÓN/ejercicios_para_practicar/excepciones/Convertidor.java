package ejercicios_para_practicar.excepciones;

/* Objetivo: Añadir manejo de NumberFormatException
 * Instrucción: Añade un bloque try-catch para evitar que el programa se rompa si el usuario escribe letras.
 */

import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Escribe un número (en texto): ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);

            System.out.println(numero + " x 10: " + (numero * 10));

        } catch (NumberFormatException e) {
            System.out.println("Lo siento, te pedí letras pero no puedo operar matemáticamente con ellas...");

        } finally {
            sc.close();
        }

    }

}