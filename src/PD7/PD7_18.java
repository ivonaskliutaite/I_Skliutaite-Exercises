/*
Naudojant Java metodus, parašykite paprasčiausią Java programą ”Matematinis skaičiuotuvas”.
*/

package PD7;

import java.util.Scanner;

public class PD7_18 {
    public static void main(String[] args) {
        System.out.println(mathCalc());
    }

    public static float mathCalc() {
        Scanner getNumbers = new Scanner(System.in);
        float result = 0;

        System.out.println("Iveskite pirma skaiciu: ");
        float firstNumber = getNumbers.nextFloat();

        System.out.println("Iveskite antra skaiciu: ");
        float secondNumber = getNumbers.nextFloat();

        System.out.println("Iveskite operatoriu: + arba - arba / arba *");
        char mathChar = getNumbers.next().charAt(0);

        switch (mathChar) {
            case '+':
                float sum = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
                result = sum;
                break;
            case '-':
                float subtract = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + subtract);
                result = subtract;
                break;
            case '*':
                float multiply = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
                result = multiply;
                break;
            case '/':
                float division = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + division);
                result = division;
                break;
        }
        return result;
    }
}
