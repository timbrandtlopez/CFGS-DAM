package sesiones.sesion_2025_03_19;

import java.util.Scanner;

public class EstructurasControlIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero>0) {
            System.out.println("El numero es positivo");

        } else if (numero<0) {
            System.out.println("El numero es negativo");

        } else {
            System.out.println("El numero es cero");

        }

        entrada.close();

    }

}