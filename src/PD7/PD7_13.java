/*
Parašykite Java metodą, kuris priima argumentą ir grąžina jo tipą.
*/

package PD7;

import java.util.Scanner;

public class PD7_13 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Pateikite koki nors teksta: ");
        String stringInput = inputScanner.nextLine();

        System.out.println("Pateikite true arba false: ");
        boolean booleanInput = inputScanner.nextBoolean();

        System.out.println("Pateikite koki nors sveikaji skaiciu: ");
        int intInput = inputScanner.nextInt();

        System.out.println("Pateikite koki nors skaiciu su skaiciais po kablelio: ");
        float floatInput = inputScanner.nextFloat();

        System.out.println("Pateikite koki nors zenkla/ simboli: ");
        char charInput = inputScanner.next().charAt(0);

        System.out.println(getTypeOfArgument(stringInput, booleanInput, intInput, floatInput, charInput));
    }

    public static String getTypeOfArgument(String stringInput, boolean booleanInput, int intInput, float floatInput, char charInput) {
        String result = "";

        // galima butu su if else prideti tikrinima
        System.out.println(stringInput + " yra " + ((Object) stringInput).getClass().getSimpleName());
        System.out.println(booleanInput + " yra " + ((Object) booleanInput).getClass().getSimpleName());
        System.out.println(intInput + " yra " + ((Object) intInput).getClass().getSimpleName());
        System.out.println(floatInput + " yra " + ((Object) floatInput).getClass().getSimpleName());
        System.out.println(charInput + " yra " + ((Object) charInput).getClass().getSimpleName());

        return result;
    }
}

