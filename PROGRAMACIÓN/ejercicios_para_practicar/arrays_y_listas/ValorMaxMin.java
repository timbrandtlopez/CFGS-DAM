package ejercicios_para_practicar.arrays_y_listas;

/* Dado un array de enteros, muestra el valor más alto y el más bajo. */

public class ValorMaxMin {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        int max = numeros[0];
        int min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > max) {
                max = numeros[i];

            } else if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("El màximo de la lista es: " + max + "\nEl mínimo de la lista es: " + min);

    }

}