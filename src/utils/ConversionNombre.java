package utils;

public class ConversionNombre {
    public static void main(String[] args) {

        String chaine = "10";

        int nombre = Integer.parseInt(chaine);

        int a = 5;
        int b = 8;

        int max = Integer.max(a, b);

        System.out.println("The maximum value between " + a + " and " + b + " is: " + max);
    }
}