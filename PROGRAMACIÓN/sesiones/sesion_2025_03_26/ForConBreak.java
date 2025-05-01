package sesiones.sesion_2025_03_26;

public class ForConBreak {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 7) {
                System.out.println("Has llegado al número: " + i);
                break;
            }

            System.out.println("Número: " + i);
        }

        System.out.println("Fin");

    }

}
