/*
Parašykite programą, kuri išveda į komandinę eilutę skaičius nuo 1 iki 100,
išskyrus skaičius,kurie dalijasi iš 5. Jei skaičius dalijasi iš 88 skaičių išvedimo ciklas
turi būti nutrauktas.
*/

package PD5;

public class PD5_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 5 != 0){
                System.out.println(i);
            }
            if (i % 88 == 0){
                break;
            }
        }
    }
}
