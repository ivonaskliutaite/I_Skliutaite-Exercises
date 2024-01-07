/*
Parašykite programą, kuri naudoja && ir || loginius operatorius
su būlio kintamaisiais ir atspausdina rezultatus.
*/

package PD4;

import java.util.Scanner;

public class PD4_3 {
    public static void main(String[] args) {
        int firstValue = 2;
        int secondValue = 1;

        if ((firstValue == 1 && secondValue == 1) || (firstValue == 0 && secondValue == 0)) {
                System.out.println("Two values are equal: " + firstValue + " and " + secondValue);
        } else if (firstValue >= 2 && secondValue >= 2) {
            System.out.println("Two values are more than 2 and are not valid: " + firstValue + " and " + secondValue);
        } else {
            System.out.println("All good, numbers are not equal or are more than 2.");
        }
    }
}
