/*
Parašykite Java metodą, kuris apverčia skaičių (Pvz.: 45 –> 54).
*/

package PD7;

public class PD7_7 {
    public static void main(String[] args) {
        System.out.println(backToFrontNumber(355632));
    }

    public static String backToFrontNumber(int number) {
        int reversed = 0;
        System.out.println("Musu pateiktas skaicius: " + number);

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        String result = "Reversed number = ";
        return result + reversed;
    }
}
