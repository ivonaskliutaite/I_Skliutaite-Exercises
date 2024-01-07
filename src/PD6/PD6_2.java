/*
Parašykite programą, kuri išveda pirmą ir paskutinį masyvo elementus.
*/

package PD6;

import java.util.Arrays;

public class PD6_2 {
    public static void main(String[] args) {
        String [] array = {"sun", "rain", "fire"};
        System.out.println("Dabartinis masyvas: " + Arrays.toString(array));

        String firstArray = array[0];
        String lastArray = array[array.length-1];

        System.out.println("Pirmas masyvo elementas: " + firstArray);
        System.out.println("Paskutinis masyvo elementas: " + lastArray);
    }
}
