package ejercicios_para_practicar.arrays_y_listas;

/* Dado un array de enteros, conviértelo a una ArrayList<Integer> y muestra su contenido. */

import java.util.ArrayList;

public class ConversionArrayALista {

    public static void main(String[] args) {

        int[] arrayEnteros = {1, 2, 3, 4, 5};

        ArrayList<Integer> listaEnteros = new ArrayList<>();

        for (int entero : arrayEnteros) {
            listaEnteros.add(entero);
        }

        System.out.println("Contenido de la lista: " + listaEnteros);

    }

}