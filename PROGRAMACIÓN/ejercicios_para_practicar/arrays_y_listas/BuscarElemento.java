package ejercicios_para_practicar.arrays_y_listas;

/* Pide al usuario un número y muestra si está presente en un array, y en qué posición. */

import java.util.Scanner;

public class BuscarElemento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + " de tu vector: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Introduce un número entero y te digo si está en tu vector: ");
        int numeroBuscado = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == numeroBuscado) {
                System.out.println("El numero " + numeroBuscado + " está en tu vector, en la posición " + (i + 1));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no está en tu vector");
        }

        sc.close();

    }

}