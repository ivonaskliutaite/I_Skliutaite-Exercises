/*
Parašykite Java metodą, kuris rūšiuoja pateiktos eilutės simbolius abėcėlės tvarka.
*/

package PD7;

import java.util.Arrays;
import java.util.Scanner;

public class PD7_9 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);

        System.out.println("Iveskite norima teksta: ");
        String stringToSort = inputString.nextLine();

        System.out.println(getStringSortedAlphabetically(stringToSort));
    }

    public static String getStringSortedAlphabetically(String text) {
        String result;

        // turime tekst'a pakeisti i char'a (simboliu masyva), kad galetume ji isskaidyti
        char[] characterArray = text.toCharArray();
        // nauja char'u masyva "sortiruojame" pagal abecele
        Arrays.sort(characterArray);

        // jei nepakeisime i nauja string'a, turesime tik surusiuota char'u masyva
        String alphabeticalText = new String(characterArray);
        result = "Surusiuotas tekstas: " + alphabeticalText;

        return result;
    }
}
