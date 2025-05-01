package sesiones.sesion_2025_02_26;

public class TiposDeDatos {

    public static void main(String[] args) {

        byte numeroByte = 127;  // Número pequeño (-128 a 127)
        System.out.println("byte (8 bits): " + numeroByte);

        short numeroShort = 32000; // Número mediano (-32,768 a 32,767)
        System.out.println("short (16 bits): " + numeroShort);

        int numeroInt = 1000000; // Número grande (-2,147,483,648 a 2,147,483,647)
        System.out.println("int (32 bits): " + numeroInt);

        long numeroLong = 900000000000L; // Número muy grande (requiere 'L' al final) (-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
        System.out.println("long (64 bits): " + numeroLong);

        float numeroFloat = 3.14f; // Número decimal (requiere 'f' al final)
        System.out.println("float (32 bits, precisión de 6-7 decimales): " + numeroFloat);

        double numeroDouble = 2.7182818284; // Número decimal de mayor precisión
        System.out.println("double (64 bits, precisión de 15-16 decimales): " + numeroDouble);

        boolean esVerdadero = true;
        boolean esFalso = false;
        System.out.println("boolean (1 bit, valores: true o false): " + esVerdadero + " / " + esFalso);

        char letra = 'A'; //Caracteres Unicode
        char simbolo = '#';
        char corazon = '❤';
        System.out.println("char (16 bits, caracteres Unicode): " + letra + " " + simbolo + " " + corazon);

        String texto = "Esto es una cadena en Java";
        System.out.println("String (almacena texto y caracteres): " + texto);

        int[] numeros = {10, 20, 30, 40, 50}; // Array de enteros
        System.out.println("Array de enteros (posición 0): " + numeros[0]);
        System.out.println("Array de enteros (posición 1): " + numeros[1]);

    }

}