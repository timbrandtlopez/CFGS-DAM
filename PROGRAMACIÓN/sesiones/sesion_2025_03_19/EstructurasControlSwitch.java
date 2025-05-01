package sesiones.sesion_2025_03_19;

import java.util.Scanner;

public class EstructurasControlSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Menú de opciones\n1. Saludar\n2. Mostrar fecha\n3. Despedir\nSelecciona una opción: ");
        int opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Hola!");
                break;

            case 2:
                System.out.println("19/03/2025");
                break;

            case 3:
                System.out.println("Adiós!");
                break;

            default:
                System.out.println("No has elegido ninguna de las opciones posibles");

        }

        entrada.close();

    }

}