package sesiones.sesion_2025_03_19;

import java.util.Scanner;

public class EstructurasControlDoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String password;

        do {
            System.out.println("Introduce tu contraseña: ");
            password = entrada.nextLine();

        } while (!password.equals("java123"));

        System.out.println("Acceso concedido");

        entrada.close();

    }

}