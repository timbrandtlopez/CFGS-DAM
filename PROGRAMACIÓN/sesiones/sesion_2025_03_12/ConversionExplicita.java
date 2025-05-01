package sesiones.sesion_2025_03_12;

public class ConversionExplicita {

    public static void main(String[] args) {

        // Declaramos una variable double con un valor decimal
        double valorDecimal = 8.75;

        // Conversión explícita (casting) de double a int
        // Se usa (int) antes de la variable para forzar la conversión
        int valorEntero = (int) valorDecimal; // Los decimales se eliminarán

        // Imprimimos los valores originales y convertidos
        System.out.println("Valor original (double): " + valorDecimal);
        System.out.println("Valor convertido (int): " + valorEntero);

    }

}