package sesiones.sesion_2025_04_22;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        entrada.close();

        System.out.println("Contenido: ");

        //Con un for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        //Con un forEach
        for (int num : numeros) {
            System.out.println("Número: " + num);
        }

        //Con un forEach con índice
        int i = 0;

        for (int num : numeros) {
            System.out.println("Número " + (i + 1) + ": " + num);
            i++;
        }

        //Con un while
        int indice = 0;

        while (indice < numeros.length) {
            System.out.println("Número " + (indice + 1) + ": " + numeros[indice]);
            indice++;
        }

        //Con un array stream forEach
        java.util.Arrays.stream(numeros).forEach(num -> System.out.println("Número: " + num));

    }

}