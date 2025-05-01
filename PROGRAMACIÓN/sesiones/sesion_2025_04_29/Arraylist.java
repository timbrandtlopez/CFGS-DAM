package sesiones.sesion_2025_04_29;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        // Scanner para leer datos del usuario por consola
        Scanner entrada = new Scanner(System.in);

        // Lista para guardar los nombres introducidos
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'salir' para finalizar)");
        String nombre;

        // Bucle para introducir nombres hasta que el usuario escriba "salir"
        do {
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();

            // Si no escribe "salir", se agrega a la lista
            if (!nombre.equalsIgnoreCase("salir")) {
                nombres.add(nombre);
            }

        } while (!nombre.equalsIgnoreCase("salir")); // Finaliza si se escribe "salir"

        int opcion;

        boolean continuar = true;

        // Menú de opciones que se repite hasta que se elija salir o se introduzca una opción inválida
        do {
            System.out.println("\nMENÚ DE OPCIONES");
            System.out.println("1. Mostrar todos los nombres");
            System.out.println("2. Obtener nombre por posición");
            System.out.println("0. Salir");
            System.out.print("Escoge una opción: ");

            opcion = entrada.nextInt();  // Leer opción
            entrada.nextLine();          // Limpiar el buffer del scanner

            switch (opcion) {

                // Mostrar todos los nombres de la lista
                case 1 -> {
                    if (nombres.isEmpty()) {
                        System.out.println("No hay nombres.");
                    } else {
                        for (String nom : nombres) {
                            System.out.println(" - " + nom);
                        }
                    }
                }

                // Obtener un nombre por su posición en la lista
                case 2 -> {
                    boolean posicionValida = false;

                    System.out.print("Introduce la posición: ");
                    int pos;

                    // Verificamos que la posición sea válida
                    do {
                        pos = entrada.nextInt();
                        entrada.nextLine(); // limpiar el buffer
                        pos--; // el usuario cuenta desde 1

                        if (pos >= 0 && pos < nombres.size()) {
                            System.out.println("Nombre en la posición elegida: " + nombres.get(pos));
                            posicionValida = true;

                        } else {
                            System.out.println("Introduce una posición válida: ");
                        }

                    } while (!posicionValida);
                }

                // Salir del programa
                case 0 -> {
                    System.out.println("FIN");
                    continuar = false;
                }

                // Si se introduce una opción inválida
                default -> {
                    System.out.println("Opción no válida.");
                    continuar = false; // Finaliza el programa por error
                }
            }

        } while (opcion != 0 && continuar); // Se repite si no se selecciona salir ni se fuerza fin por error

        entrada.close(); // Cerramos el scanner

    }

}
