/*
Parašykite Java metodą, kuris grąžina pateikto masyvo elementus, didesnius už nurodytą skaičių.
*/

package PD7;

import java.util.Scanner;

public class PD7_17 {
    public static void main(String[] args) {

        System.out.println(getBiggerNumberInArray());
    }

    public static String getBiggerNumberInArray() {
        Scanner getNumber = new Scanner(System.in);
        String result = "";
        float[] array = {1.5f, 6, 9, 2, 7.2f};

        System.out.println("Iveskite skaiciu, kuri noresite sulyginti: ");
        float number = getNumber.nextFloat();

        for (float el : array) {
            if (el > number) {
                System.out.println(el);
            }
        }
        return result;
    }
}
