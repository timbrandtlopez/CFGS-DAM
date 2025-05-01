package sesiones.sesion_2025_03_26;

import java.util.Scanner;

public class WhileConBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.println("Introduce un número (0 para finalizar): ");
            numero = entrada.nextInt();

            if (numero == 0) {
                break;
            }

            System.out.println("Has introducido: " + numero);
        }

        System.out.println("Programa finalizado");

        entrada.close();

    }

}