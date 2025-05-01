package ejercicios_para_practicar.excepciones;

/* Objetivo: Añadir manejo de ArrayIndexOutOfBoundsException
 * Instrucción: Usa try-catch para evitar error si se ingresa una posición incorrecta (como 5 o -1).
 */

import java.util.Scanner;

public class ArrayAcceso {

    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Banana", "Naranja"};

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce una posición entre 0 y 2: ");
            int posicion = sc.nextInt();

            System.out.println("Fruta seleccionada: " + frutas[posicion]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición incorrecta");

        } finally {
            sc.close();
        }

    }

}