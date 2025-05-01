package ejercicios_para_practicar.arrays_y_listas;

/* Declara un array de 5 números enteros, asígnales valores y muéstralos por pantalla. */

import java.util.Scanner;

public class DeclararMostrar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + " de tu lista: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        sc.close();

    }

}
