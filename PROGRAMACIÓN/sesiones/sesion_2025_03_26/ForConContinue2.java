package sesiones.sesion_2025_03_26;

public class ForConContinue2 {

    public static void main(String[] args) {

        String palabra = "PROGRAMACION";

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                continue;
            }

            System.out.println(letra);
        }

    }

}