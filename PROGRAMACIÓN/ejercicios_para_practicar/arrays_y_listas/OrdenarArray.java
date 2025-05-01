package ejercicios_para_practicar.arrays_y_listas;

/* Declara un array con números desordenados y ordénalo de menor a mayor utilizando
Arrays.sort(). */

import java.util.Arrays;

public class OrdenarArray {

    public static void main(String[] args) {

        int[] numeros = {2, 5, 7, 6, 3};

        Arrays.sort(numeros);

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }

}