package sesion_2025_03_12;

public class Desbordamiento {

    public static void main(String[] args) {
        // Número mayor al rango de byte (-128 a 127)
        int numeroGrande = 150;

        // Conversión explícita a byte
        // Como 150 está fuera del rango de byte, se producirá un desbordamiento
        byte numeroPequeno = (byte) numeroGrande;

        // Mostramos los valores
        System.out.println("Número original (int): " + numeroGrande);
        System.out.println("Número convertido a byte: " + numeroPequeno);

    }

}
