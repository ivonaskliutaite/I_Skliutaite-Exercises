/*
Parašykite Java metodą, kuris grąžina skaičiaus kvadratą.
*/

package PD7;

public class PD7_1 {
    public static void main(String[] args) {
        System.out.println(getNumPov(10));
    }

    public static double getNumPov(int  number){
        // return number * number
        return Math.pow(number, 2.0);
    }
}
