package ejercicios_para_practicar.arrays_y_listas;

/* Crea una ArrayList con elementos repetidos (por ejemplo: [1, 2, 2, 3, 4, 4, 5])
Elimina los duplicados y muestra la lista final sin repetir. */

import java.util.ArrayList;
import java.util.List;

public class EliminarDuplicadosLista {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumerosOriginal = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        System.out.println("La lista de números original es: " + listaNumerosOriginal);

        ArrayList<Integer> listaNumerosSinDuplicados = new ArrayList<>();

        for (int numero : listaNumerosOriginal) {

            if (!listaNumerosSinDuplicados.contains(numero)) {
                listaNumerosSinDuplicados.add(numero);
            }
        }

        System.out.println("La lista de números sin duplicados es: " + listaNumerosSinDuplicados);

    }

}