/*
Parašykite Java metodą, kuris grąžina skaičiaus kvadratą.
*/

package PD7;

public class PD7_1 {
    public static void main(String[] args) {
        System.out.println("Skaicius kvadratu: " + getNumPov(10));
    }

    public static int getNumPov(int number) {
        return (int) Math.pow(10, 2);
    }
}
