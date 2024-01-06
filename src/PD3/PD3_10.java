/*
Parašykite programą, kuri nuskaito tekstinę eilutę, sudarytą iš skaičių,
atskirtų tarpais, konver-tuoja šiuos skaičius iš teksto į sveikuosius skaičius
naudojantInteger.parseInt()metodą, ir apskai-čiuoja bei atspausdina jų sumą.
*/

package PD3;

import java.util.Scanner;

public class PD3_10 {
    public static void main(String[] args) {
        // Creates scanner object
        Scanner twoDigitInput = new Scanner(System.in);

        System.out.println("Iveskite du skaicius, atskirdami juos tarpais:");

        int firstNumber = Integer.parseInt(twoDigitInput.next());
        int secondNumber = Integer.parseInt(twoDigitInput.next());
        int sum = firstNumber + secondNumber;

        System.out.println("Pirmas skaicius: " + firstNumber + ", antras skaicius: " + secondNumber);
        System.out.println("Suma: "+ sum);
    }
}
