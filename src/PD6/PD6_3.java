/*
Parašykite programą, kuri paverčia masyvą simbolių eilute (String).
*/

package PD6;

import java.util.Arrays;

public class PD6_3 {
    public static void main(String[] args) {
        int [] array = {1, 3, 5, 7};
        System.out.println("Masyvas: " + Arrays.toString(array));

        System.out.print("Masyvas: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
