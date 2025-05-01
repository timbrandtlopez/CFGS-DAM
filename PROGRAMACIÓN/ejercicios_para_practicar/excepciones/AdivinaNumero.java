package ejercicios_para_practicar.excepciones;

/* Objetivo: Añadir manejo de NumberFormatException al convertir texto a número 
 * Instrucción: Añade manejo de NumberFormatException y un finally que diga: "Juego finalizado."
*/

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        Random random = new Random();
        int secreto = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);

        /* Usar un try-with-resources solo cambia que en caso de saltar una excepción el sc, en este caso, se cierra
        * solo sin seguir usando recursos. Ponemos entre paréntesis en el try, pero podemos poner la línea entera 17
        * también. Además, si hay más utilidades se ponen dentro del mismo paréntesis separadas por punto y coma ";". */
        try (sc) {
            System.out.print("Adivina el número (1-10): ");
            String intentoTexto = sc.nextLine();

            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");

            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }

        } catch (NumberFormatException e) {
            System.out.println("No me has dado un número!!");

        } finally {
            System.out.println("Juego finalizado.");
        }

    }

}