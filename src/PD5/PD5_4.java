/*
Parašykite programą, kuri skaičiuoja visų pateiktų iš klaviatūros skaičių sumą, kol
nebus įvestas0. Programoje reikia panaudoti do-while ciklą
*/

package PD5;

import java.util.Scanner;

public class PD5_4 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        // deklaruojame kintamuosius, kurie kolkas neturi vertes (tik 0)
        int sum = 0;
        int input = 0;

        do {
            System.out.println("Iveskite skaiciu: ");
            // toks scanner uzrasymas - galesime vesti skaicius kike norime, kol salyga galios
            input = newScanner.nextInt();
            // pridedame musu ivestus skaicius prie sum kintamojo
            sum += input;
            // salyga galios kol bus ivestas skaicius didesnis negu 0
        } while (input > 0);
        System.out.println("Ivestu skaiciu suma: " + sum);
    }
}
