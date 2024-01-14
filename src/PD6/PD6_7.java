/*
Parašykite programą sveikųjų skaičių masyvo sumai ir sandaugai apskaičiuoti.
*/

package PD6;

public class PD6_7 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, -2, -5, -6};
        int [] arrayOne = {1, 2, 3, 4, -2, -5, -6};

        int sum = 0;
        int multiply = 1;
        int sumOne = 0;
        int multiplyOne = 1;

        for (int element : array){
            sum += element;
            multiply *= element;
        }

        for (int i = 0; i < arrayOne.length; i++){
            sumOne += arrayOne[i];
            multiplyOne *= arrayOne[i];
        }
        System.out.println("Masyvo elementu suma = " + sumOne);
        System.out.println("Masyvo elementu sandauga = " + multiplyOne);
    }
}
