/*
Į vieną kartoninę dėžutę telpa trys puodeliai. Pakuotojas užklijuoja dėžutę
 ir išsiunčia ją į parduotuvę, jei ji pilna. Iš viso reikia supakuoti m puodelių.
 Parašykite programą, kuri apskaičiuotų, kelios bus pilnos dėžutės ir kiek puodelių liks nesupakuota.
*/

package PD4;

import java.util.Scanner;

public class PD4_9 {
    public static void main(String[] args) {
        Scanner cupsNumber = new Scanner(System.in);

        System.out.println("Iveskite puodeliu skaiciu: ");
        int m = cupsNumber.nextInt();

        int cupLimit = 3;
        int cupBoxReminder = m % cupLimit;
        int cupBox = (m - cupBoxReminder) / cupLimit;

        System.out.println("Puodelių, kuriuos reikia supakuoti, skaičius: " + m);
        System.out.println("Pilnu dezuciu skaicius: " + cupBox);
        System.out.println("Nesupakuotu puodeliu skaicius: " + cupBoxReminder);
    }
}
