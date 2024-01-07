/*
Parašykite Java programą, kuri naudoja visus priskyrimo
operatorius (=, +=, -=, *=, /=, %=) su kintamaisiais ir atspausdina rezultatus.
*/

package PD4;

public class PD4_4 {
    public static void main(String[] args) {
        int firstInt = 50;
        int secondInt = 30;

        System.out.println("Pradiniai duomenys pries operacijas: " + firstInt + " ir " + secondInt);
        firstInt += secondInt;
        System.out.println("Suma: " + firstInt);
        System.out.println("-------------------------------------------");

        System.out.println("Pirmas skaicius: " + firstInt + ", antras skaicius: " + secondInt);
        firstInt -= secondInt;
        System.out.println("Atemimas: " + firstInt);
        System.out.println("-------------------------------------------");

        System.out.println("Pirmas skaicius: " + firstInt + ", antras skaicius: " + secondInt);
        firstInt *= secondInt;
        System.out.println("Daugyba: " + firstInt);
        System.out.println("-------------------------------------------");

        System.out.println("Pirmas skaicius: " + firstInt + ", antras skaicius: " + secondInt);
        firstInt /= secondInt;
        System.out.println("Dalyba: " + firstInt);
        System.out.println("-------------------------------------------");

        System.out.println("Pirmas skaicius: " + firstInt + ", antras skaicius: " + secondInt);
        firstInt %= secondInt;
        System.out.println("Liekana: " + firstInt);
    }
}
