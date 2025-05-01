package ejercicios_para_practicar.arrays_y_listas;

/* Crea una lista de tareas (ArrayList<String>), añade elementos y elimina uno por su nombre. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnadirEliminarElementos {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Manu");
        nombres.add("Rose");
        nombres.add("Alberto");

        System.out.println(nombres);

        nombres.remove("Alberto");

        System.out.println(nombres);

        //Otra forma de crear un ArrayList y ponerle nombres sin .add
        ArrayList<String> sinadd1 = new ArrayList<>(List.of("Maria", "Amador"));
        ArrayList<String> sinadd2 = new ArrayList<>(Arrays.asList("Paula", "Sara"));
        System.out.println(sinadd1);
        System.out.println(sinadd2);

        Collections.sort(sinadd1);
        System.out.println(sinadd1);

    }

}