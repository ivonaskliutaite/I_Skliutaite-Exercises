/*
Parašykite programą, kuri padėtų studentui suskaičiuoti, kiek paskaitų jis turi per savaitę ir kiektai sudarys minučių.
Klaviatūra įvedami 5 skaičiai, reiškiantys kiekvienos dienos paskaitų skaičių.
*/

package PD4;

import java.util.Scanner;

public class PD4_7 {
    public static void main(String[] args) {
        Scanner newInputScanner = new Scanner(System.in);

        System.out.println("Kiek paskaitu yra pirmadieni?");
        int mondayLessons = newInputScanner.nextInt();

        System.out.println("Kiek paskaitu yra antradieni?");
        int tuesdayLessons = newInputScanner.nextInt();

        System.out.println("Kiek paskaitu yra treciadieni?");
        int wednesdayLessons = newInputScanner.nextInt();

        System.out.println("Kiek paskaitu yra ketvirtadieni?");
        int thursdayLessons = newInputScanner.nextInt();

        System.out.println("Kiek paskaitu yra penktadieni?");
        int fridayLessons = newInputScanner.nextInt();

        int weekLessonsNumber = mondayLessons + tuesdayLessons + wednesdayLessons + thursdayLessons + fridayLessons;
        // viena pamoka - 45 minuciu
        int weekLessonsNumberInMin = weekLessonsNumber * 45;

        System.out.println("Paskaitu skaicius per savaite - " + weekLessonsNumber);
        System.out.println("Tai sudaro " + weekLessonsNumberInMin + " minuciu");
    }
}
