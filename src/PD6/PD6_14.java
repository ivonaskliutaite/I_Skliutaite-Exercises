/*
Parašykite programą, kuri nustato, ar du duoti masyvai turi bent vieną bendrą elementą.
*/

package PD6;

import java.util.Arrays;

public class PD6_14 {
    public static void main(String[] args) {
        int[] array = {1, 2, 34, 5};
        int[] arrayTwo = {11, 23, 44, 3};
        boolean hasCommonEl = false;

        // su forEach iteruojame per pirma masyva
        for (int number1 : array){
            // ir su forEach iteruojame per antra masyva
            for (int number2 : arrayTwo){
                // jeigu pirmo masyvo skaicius yra lygus antro masyvo skaiciui
                if (number1 == number2){
                    // turi pasikartojanti elementa, isveda true
                    hasCommonEl = true;
                    // ir baigia tikrinti
                    break;
                }
            }
        }

        System.out.println("Pirmas masyvas: " + Arrays.toString(array));
        System.out.println("Antras masyvas: " + Arrays.toString(arrayTwo));
        System.out.println("Ar turi pasikartojanti elementa?: " + hasCommonEl);
    }
}
