package ejercicios_para_practicar.excepciones;

/* Objetivo: Añadir manejo de NullPointerException
 * Instrucción: Usa try-catch para evitar que el programa se detenga si nombre es null.
 */

public class LongitudNombre {

    public static void main(String[] args) {

        String nombre = null;

        try {
            System.out.println("La longitud del nombre es: " + nombre.length());

        } catch (NullPointerException e) {
            System.out.println("Lo siento no puedo medir la longitud del String nombre porque este es null");

        } finally {
            System.out.println("Adiós :)");
        }

    }

}