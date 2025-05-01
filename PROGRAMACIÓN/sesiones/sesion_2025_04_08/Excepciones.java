package sesiones.sesion_2025_04_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {

        //El scanner es una clase nativa de jdk que almacena el flujo del teclado en un búffer
        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Saludar\n2. Salir\n\nElige una opción: ");

        try {
            int opcion = entrada.nextInt();

            switch (opcion) {

                case 1 -> System.out.println("Hola, un saludo!");

                case 2 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción incorrecta");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debes escribir un número");

        } catch (ArithmeticException e) {
            System.out.println("División por 0");

        } finally {
            System.out.println("Fin");
        }

        entrada.close();

    }

}