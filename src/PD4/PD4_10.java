/*
Automobilių tunelio po Nepriklausomybės aikšte Vilniuje ilgis lygus 264 m.
Parašykite programą,kuri apskaičiuotų, kelias sekundes s automobilis važiuoja šiuo tuneliu, jei jo
greitis yra v km/h? Rezultatus pateikite šimtųjų tikslumu.
*/

package PD4;

import java.util.Scanner;

public class PD4_10 {
    public static void main(String[] args) {
        int tunelLengthInM = 264;
        float tunelLengthInKm = tunelLengthInM / 1000f;

        Scanner carSpeed = new Scanner(System.in);

        System.out.println("Iveskite automobilio greiti km/h: ");
        int v = carSpeed.nextInt();

        float s = v * tunelLengthInKm;

        System.out.println("Koks automobilio greitis?: " + v + "km/ h.");
        System.out.println("Automobilis tuneli pravaziuos per: " + s + " sekundziu.");
    }
}
