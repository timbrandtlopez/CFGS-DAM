package ejercicios_para_practicar.arrays_y_listas;

/* Crea una ArrayList de tipo String, añade 5 nombres y muéstralos por pantalla. */

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaNombres = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el nombre " + (i + 1) + " de tu lista de nombres: ");
            String nombre = sc.nextLine();
            listaNombres.add(nombre);
        }

        //Mostrar elementos con for, como en Arrays
        System.out.println("\nTu lista de nombres es:");

        for (String nom : listaNombres) {
            System.out.println(nom);
        }

        //Haciendo un simple print para mostrar el ArrayList: en Arrays no se puede
        System.out.println(listaNombres);

        sc.close();

    }

}