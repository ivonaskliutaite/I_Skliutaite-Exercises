/*
Parašykite programą sveikųjų skaičių masyvo sumai ir sandaugai apskaičiuoti.
*/

package PD6;

public class PD6_7 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, -2, -5, -6};
        int sum = 0;
        int multiply = 1;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
            multiply *= array[i];
        }
        System.out.println("Masyvo elementu suma = " + sum);
        System.out.println("Masyvo elementu sandauga = " + multiply);
    }
}
