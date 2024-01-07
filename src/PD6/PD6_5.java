/*
Parašykite programą, kuri randą mažiausią ir didžiausią skaičių integer tipo masyve.
*/

package PD6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PD6_5 {
    public static void main(String[] args) {
        int [] array = {1, 6, 8, 3, 9, 0, -10};
        System.out.println("Duotas masyvas: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Isrusiuotas archyvas: " + Arrays.toString(array));

        int minValue = array[0];
        int maxValue = array[array.length-1];

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }
}
