/*
Parašykite programą, kuri naudoja visus Java aritmetinius operatorius
(+, -, *, /, %) su dviem įvesties kintamaisiais ir atspausdina rezultatus.
*/

package PD4;

import java.util.Scanner;

public class PD4_1 {
    public static void main(String[] args) {
        Scanner newInt = new Scanner(System.in);

        System.out.println("Iveskite pirma skaiciu: ");
        int firstInt = newInt.nextInt();

        System.out.println("Iveskite antra skaiciu: ");
        int secondInt = newInt.nextInt();

        int sum = firstInt + secondInt;
        int minus = firstInt - secondInt;
        int multiply = firstInt * secondInt;
        int divide = firstInt / secondInt;
        int reminder = firstInt % secondInt;

        System.out.println("Pirmas skaicius: " + firstInt + ", antras skaicius: " + secondInt);
        System.out.println("Dvieju skaiciu suma yra lygi: " + sum);
        System.out.println("Dvieju skaiciu atimtis yra lygi: " + minus);
        System.out.println("Dvieju skaiciu daugyba yra lygi: " + multiply);
        System.out.println("Dvieju skaiciu dalyba yra lygi: " + divide);
        System.out.println("Dvieju skaiciu dalybos liekana yra lygi: " + reminder);
    }
}
