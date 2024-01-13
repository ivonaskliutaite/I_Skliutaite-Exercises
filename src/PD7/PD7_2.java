/*
Parašykite Java metodą, kuris konvertuoja Celsijaus laipsnius į Farenheitą
*/

package PD7;

public class PD7_2 {
    public static void main(String[] args) {
        System.out.println("Konvertacija is C i F: " + convertCelToFar(15.6));
    }

    public static double convertCelToFar(double temp) {
        System.out.println("Temperatura Celsiumi = " + temp);
        return temp * 1.8 + 32;
    }
}
