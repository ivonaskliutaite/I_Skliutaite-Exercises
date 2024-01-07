/*
Parašykite programą, kuri kopijuoja masyvą.
*/

package PD6;

import java.util.Arrays;

public class PD6_1 {
    public static void main(String[] args) {
        String [] array = {"sun", "rain", "fire"};
        System.out.println("Esamas masyvas: " + Arrays.toString(array));

        String [] arrayCopy = Arrays.copyOf(array, 3);
        System.out.println("Nukopijuotas masyvas: " + Arrays.toString(arrayCopy));
    }
}
