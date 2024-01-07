/*
Parašykite programą, kuri lygina du skaičius naudodama visus palyginimo operatorius
(==, !=, >,<, >=, <=) ir atspausdina kiekvieno palyginimo rezultatą.
*/

package PD4;

import java.util.Scanner;

public class PD4_2 {
    public static void main(String[] args) {
        Scanner newInt = new Scanner(System.in);

        System.out.println("Iveskite du sveikuosius skaicius: ");
        System.out.println("Pirmas skaicius: ");
        int firstInt = newInt.nextInt();

        System.out.println("Antras skaicius: ");
        int secondInt = newInt.nextInt();

        boolean equalOfTwo = firstInt == secondInt;
        boolean notEqualOfTwo = firstInt != secondInt;
        boolean firstMore = firstInt > secondInt;
        boolean secondMore = firstInt < secondInt;
        boolean equalOrMore = firstInt >= secondInt;
        boolean equalOrLess = firstInt <= secondInt;

        System.out.println("Skaicius " + firstInt + " yra lygus " + secondInt + "." + " Rezultatas: " + equalOfTwo);
        System.out.println("Skaicius " + firstInt + " yra nelygus " + secondInt + "." + " Rezultatas: " + notEqualOfTwo);
        System.out.println("Skaicius " + firstInt + " yra didesnis uz " + secondInt + "." + " Rezultatas: " + firstMore);
        System.out.println("Skaicius " + firstInt + " yra mazesnis uz " + secondInt + "." + " Rezultatas: " + secondMore);
        System.out.println("Skaicius " + firstInt + " yra didesnis arba lygus uz " + secondInt + "." + " Rezultatas: " + equalOrMore);
        System.out.println("Skaicius " + firstInt + " yra mazesnis arba lygus uz " + secondInt + "." + " Rezultatas: " + equalOrLess);
    }
}
