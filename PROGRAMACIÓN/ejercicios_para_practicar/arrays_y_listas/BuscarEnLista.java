package ejercicios_para_practicar.arrays_y_listas;

/* Pregunta al usuario un nombre, y busca si está en la lista. Si está, muestra su posición. */

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarEnLista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Manu");
        nombres.add("Rose");
        nombres.add("Alberto");

        System.out.println("Introduce un nombre y te digo si está en la lista y en qué posición: ");
        String nombre = sc.nextLine();

        //Haciéndolo con .indexOf()
        int posicion = nombres.indexOf(nombre);

        if (posicion != -1) {
            System.out.println("¡Está en la lista! Posición " + (posicion + 1));

        } else {
            System.out.println("No está en la lista");
        }

        /* Haciéndolo de una manera extendida pero lógica

        boolean encontrado = false;

        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equalsIgnoreCase(nombre)) {
                System.out.println("Está en la lista! Posición " + (i + 1));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No está en la lista");
        }

         */

        sc.close();

    }

}