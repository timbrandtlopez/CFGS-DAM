package sesion_2025_03_12;

public class IntegerToDecimalDivision {

    public static void main(String[] args) {

        int a = 5, b = 2;

        // División sin conversión (se pierde el decimal)
        System.out.println("División entera: " + (a / b)); // Da 2

        // Conversión a double para obtener decimales
        double resultado = (double) a / b;
        System.out.println("División con casting: " + resultado); // Da 2.5

    }

}
