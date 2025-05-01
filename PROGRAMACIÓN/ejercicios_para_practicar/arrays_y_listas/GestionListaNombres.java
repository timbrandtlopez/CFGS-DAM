package ejercicios_para_practicar.arrays_y_listas;

/* Haz un pequeño programa que permita al usuario gestionar una lista de nombres:

1. Añadir nombres
2. Mostrar todos los nombres
3. Obtener nombre por posición
4. Reemplazar nombre (set)
5. Eliminar nombre por posición (remove)
6. Verificar si existe un nombre (contains)
7. Obtener índice de un nombre (indexOf)
8. Vaciar lista de nombres (clear)
9. Ordenar lista alfabéticamente (Collections.sort)  */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GestionListaNombres {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        int opcion;

        boolean continuar = true;

        // Menú con más opciones
        do {
            System.out.println("\nMENÚ DE OPCIONES");
            System.out.println("1. Añadir nombres");
            System.out.println("2. Mostrar todos los nombres");
            System.out.println("3. Obtener nombre por posición");
            System.out.println("4. Reemplazar nombre (set)");
            System.out.println("5. Eliminar nombre por posición (remove)");
            System.out.println("6. Verificar si existe un nombre (contains)");
            System.out.println("7. Obtener índice de un nombre (indexOf)");
            System.out.println("8. Vaciar lista de nombres (clear)");
            System.out.println("9. Ordenar lista alfabéticamente (Collections.sort)");
            System.out.println("0. Salir");
            System.out.print("Escoge una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce nombres (escribe 'salir' para finalizar).");
                    String nombre;

                    // Introducción de nombres
                    do {
                        System.out.print("Nombre: ");
                        nombre = entrada.nextLine();
                        if (!nombre.equalsIgnoreCase("salir")) {
                            nombres.add(nombre);
                        }

                    } while (!nombre.equalsIgnoreCase("salir"));
                }

                case 2 -> {
                    if (nombres.isEmpty()) {
                        System.out.println("No hay nombres.");

                    } else {
                        System.out.println("Lista de nombres:");

                        for (String nom : nombres) {
                            System.out.println(" - " + nom);
                        }
                    }
                }

                case 3 -> {
                    boolean posicionValida = false;

                    System.out.print("Introduce la posición: ");
                    int pos;

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

                case 4 -> {
                    System.out.print("Introduce la posición a reemplazar: ");
                    int pos = entrada.nextInt();
                    entrada.nextLine();
                    pos--;

                    if (pos >= 0 && pos < nombres.size()) {
                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = entrada.nextLine();
                        nombres.set(pos, nuevoNombre);
                        System.out.println("Nombre reemplazado correctamente.");

                    } else {
                        System.out.println("Posición no válida.");
                    }
                }

                case 5 -> {
                    System.out.print("Introduce la posición a eliminar: ");
                    int pos = entrada.nextInt();
                    entrada.nextLine();
                    pos--;

                    if (pos >= 0 && pos < nombres.size()) {
                        nombres.remove(pos);
                        System.out.println("Nombre eliminado.");

                    } else {
                        System.out.println("Posición no válida.");
                    }
                }

                case 6 -> {
                    System.out.print("Introduce el nombre a buscar: ");
                    String buscar = entrada.nextLine();

                    if (nombres.contains(buscar)) {
                        System.out.println("El nombre está en la lista.");

                    } else {
                        System.out.println("El nombre NO está en la lista.");
                    }
                }

                case 7 -> {
                    System.out.print("Introduce el nombre para saber su índice: ");
                    String buscar = entrada.nextLine();
                    int indice = nombres.indexOf(buscar);

                    if (indice != -1) {
                        System.out.println("El nombre está en la posición: " + (indice + 1));

                    } else {
                        System.out.println("El nombre no está en la lista.");
                    }
                }

                case 8 -> {
                    nombres.clear();
                    System.out.println("La lista ha sido vaciada.");
                }

                case 9 -> {
                    if (nombres.isEmpty()) {
                        System.out.println("No hay nombres para ordenar.");

                    } else {
                        Collections.sort(nombres);
                        System.out.println("Lista ordenada alfabéticamente.");
                    }
                }

                case 0 -> {
                    System.out.println("FIN");
                    continuar = false;
                }

                default -> {
                    System.out.println("Opción no válida.");
                }
            }

        } while (opcion != 0 && continuar);

        entrada.close();

    }

}