package sesiones.sesion_2025_03_19;

import java.util.Scanner;

public class EstructurasControlWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número y pon 0 para salir");
        int numero = entrada.nextInt();

        while (numero != 0) {
            System.out.println("Has introducido el número " + numero +"\nIntroduce otro: ");
            numero = entrada.nextInt();
        }

        System.out.println("Programa finalizado");

        entrada.close();

    }

}