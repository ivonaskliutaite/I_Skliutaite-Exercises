/*
Parašykite Java metodą, kuris skaičiuoja skaičiaus faktorialą.
*/

package PD7;

public class PD7_5 {
    public static void main(String[] args) {
        System.out.println("Skaiciaus faktorialas = " + getFactorialNumber(5));
    }

    public static int getFactorialNumber(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
