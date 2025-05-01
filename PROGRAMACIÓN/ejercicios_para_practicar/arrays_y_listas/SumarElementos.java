package ejercicios_para_practicar.arrays_y_listas;

/* Suma todos los valores de un array de enteros y muestra el total. */

public class SumarElementos {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El elemento " + (i + 1) + " de tu lista es -> " + numeros[i]);
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos de la lista da un total de " + suma);

    }

}