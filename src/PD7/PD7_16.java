/*
Parašykite Java metodą, kuris patikrina ar skaičius yra tobulasis.
*/

package PD7;

import java.util.Scanner;

public class PD7_16 {
    public static void main(String[] args) {
        System.out.println("Ar ivestas skaicius yra tobulasis skaicius?");
        System.out.println(isNumberPerfect());
    }

    public static boolean isNumberPerfect() {
        Scanner inputNumber = new Scanner(System.in);
        int sum = 0;

        System.out.println("Iveskite naturaluji, teigiama skaiciu: ");
        int number = inputNumber.nextInt();

        // pagal formule --> 2^n – 1(2^n – 1) yra tobulasis
        // turime praiteruoti visa skaiciu
        for (int i = 1; i < number; i++) {
            // dalindami ir ieskodami ar neturi liekanos
            if (number % i == 0)
                // sudedame
                sum = sum + i;
        }

        if (sum == number) {
            System.out.println("Yra tobulasis skaicius: " + number);
            System.out.println(sum + " lygu " + number);
            return true;
        } else {
            System.out.println("Nera tobulasis skaicius: " + number);
            System.out.println(sum + " nelygu " + number);
            return false;
        }
    }
}
