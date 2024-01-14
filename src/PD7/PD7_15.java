/*
Parašykite Java metodą, kuris skaičių masyve suranda antrąjį mažiausią ir
antrąjį didžiausius skaičius.
 */

package PD7;

import java.util.Arrays;

public class PD7_15 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 9, 10};
        System.out.println(getSecondMinAndMaxIntInArr(array));
    }

    public static String getSecondMinAndMaxIntInArr(int[] array) {
        String result = "";

        int secondSmallest = 0;
        int secondBiggest = 0;

        // dvigubas (nested for'as), kad galetume lyginti du skaicius is masyvo
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // lyginame pirma ir antra skaiciu
                if (array[i] < array[j]) {
                    //dedame i dezute (temporary)
                    int temp = array[i];
                    // suekeiciame vietomis, kad galetume testi lyginima (pirma skaiciu su antru)
                    array[i] = array[j];
                    // idedame antra skaiciu i dezute
                    array[j] = temp;
                }
            }
            secondBiggest = array[1];
            secondSmallest = array[array.length - 2];
        }
        System.out.println("Masyvas: " + Arrays.toString(array));
        System.out.println("Antras maziausias skaicius: " + secondSmallest);
        System.out.println("Antras didziausias skaicius: " + secondBiggest);
        return result;
    }
}
 