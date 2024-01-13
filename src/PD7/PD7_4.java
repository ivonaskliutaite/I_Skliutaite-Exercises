/*
Parašykite Java metodą, kuris skaičiuoja dviejų skaičių didžiausią bendrą daliklį.
*/

package PD7;

public class PD7_4 {
    public static void main(String[] args) {
        int number1 = 40;
        int number2 = 25;
        int gcd = findGCS(number1, number2);
        System.out.println(gcd);
    }

    public static int findGCS(double number1, double number2) {
        while (number2 != 0) {
            int tmp = (int) number2;
            System.out.println("Tarpinis tikrinimas, koks skaicius dabar yra dezuteje temp: " + tmp);

            number2 = number1 % number2;
            System.out.println("Tarpine operacija, paziureti koks yra daliklis su liekana: " + number2);
            System.out.println(" ");
            number1 = tmp;
        }
        return (int) number1;
    }
}
