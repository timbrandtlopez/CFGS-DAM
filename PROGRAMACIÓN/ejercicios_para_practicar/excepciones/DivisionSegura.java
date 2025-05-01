package ejercicios_para_practicar.excepciones;

/* Objetivo: Añadir manejo de ArithmeticException y InputMismatchException
 * Instrucción: Añade try-catch-finally para evitar que el programa falle si el divisor es cero o si se introduce texto.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el dividendo: ");
            int a = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número entero.");

        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir entre cero.");

        } finally {
            System.out.println("FIN");
            sc.close(); //Aquí cerramos el Scanner manualmente, aunque podemos usar un try-with-resources
        }

    }

}