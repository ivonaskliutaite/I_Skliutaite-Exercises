/*
Parašykite programą, kuri atspausdintų daugybos lentelę nuo 1 iki 10.
*/

package PD5;

public class PD5_2 {
    public static void main(String[] args) {
        // i bus skaiciai nuo 1 iki 10, kuriuos dauginsime
        for(int i = 1; i <= 10; i++){
            // j bus skaiciai, kuriais bus dauginamas i is praeito loop'o
            for(int j = 0; j <= 10; j++){
                // dauginimas
                int multiply = i * j;
                // spausdinimas
                System.out.println(i + " * " + j + " = " + multiply);
            }
            System.out.println();

        }
    }
}
