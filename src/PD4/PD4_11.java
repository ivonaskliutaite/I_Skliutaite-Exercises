/*
Akvariume gyvena a žuvų. Kiekvieną dieną Akvilė į akvariumą įdeda b žuvų.
 Parašykite progra-mą, kuri suskaičiuotų kiek iš viso bus žuvų po n dienų.
 Rezultatą reikia išvesti su paaiškinamaisiais žodžiais.
*/

package PD4;

import java.util.Scanner;

public class PD4_11 {
    public static void main(String[] args) {
        Scanner fishCount = new Scanner(System.in);

        System.out.println("Kiek zuvu gyvena akvariume?");
        int a = fishCount.nextInt();

        System.out.println("Kiek zuvu i akvariuma idedama kiekviena diena?");
        int b = fishCount.nextInt();

        System.out.println("Kiek dienu praejo?");
        int n = fishCount.nextInt();

        int dayCount = b * n;
        int wholeCount = a + dayCount;

        System.out.println("Po " + n + " dienu akvariume gyvens " + wholeCount + " zuvu.");
    }
}
