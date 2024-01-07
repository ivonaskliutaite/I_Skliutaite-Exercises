/*
Parašykite programą, kuri parodo Java operatorių eiliškumą.
*/

package PD4;

import java.util.Scanner;

public class PD4_6 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Iveskite du sveikuosius skaicius: ");
        System.out.println("Iveskite pirma skaiciu: ");
        int firstNumber = newScanner.nextInt();

        System.out.println("Iveskite antra skaiciu: ");
        int secondNumber = newScanner.nextInt();

        int thirdNumber = firstNumber++;
        int fourthNumber = secondNumber--;
        int mathExercise = ((firstNumber * secondNumber) / (firstNumber % secondNumber)) * (--firstNumber + secondNumber++);
        int secondMathExercise = thirdNumber * secondNumber - fourthNumber + firstNumber / 2;

        System.out.println("Atsakymas = " + mathExercise);
        System.out.println("Atsakymas = " + secondMathExercise);
    }
}
