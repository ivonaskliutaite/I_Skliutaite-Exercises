/*
Naudojant Java metodus, parašykite paprasčiausią Java programą ”Atspėk skaičių”.
*/

package PD7;

import java.util.Scanner;

public class PD7_20 {
    public static void main(String[] args) {
        System.out.println("Atspek skaiciu nuo 1 iki 100 :)");
        System.out.println("Spejimas: ");
        System.out.println(guessNumber());
    }

    public static int guessNumber() {
        int randomNum = (int) (Math.random() * 100 + 1);
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts != maxAttempts) {
            Scanner inputScanner = new Scanner(System.in);
            int guessTry = inputScanner.nextInt();

            if (guessTry > randomNum) {
                System.out.println("Per didelis skaicius!");
                attempts++;
            } else if (guessTry < randomNum) {
                System.out.println("Per mazas skaicius!");
                attempts++;
            } else {
                System.out.println("Laimeeejai!");
                break;
            }

            if (attempts == maxAttempts) {
                System.out.println("Deja, pralaimejai.");
            }
        }
        System.out.println("Atsakymas: ");
        return randomNum;
    }
}