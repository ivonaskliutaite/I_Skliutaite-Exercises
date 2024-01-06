/*
Parašykite programą, kuri demonstruoja autoboxing
ir unboxing duomenų konvertavimo pro-cesus.

In autoboxing, the Java compiler automatically converts primitive types
into their corresponding wrapper class objects.

In unboxing, the Java compiler automatically converts
wrapper class objects into their corresponding primitive types.
*/

package PD3;

public class PD3_9 {
    public static void main(String[] args) {
        int number = 50;
        boolean isFalse = false;
        float floatNumber = 50.435F;
        char someChar = '\u03A9';
        Integer secondNumber = 10;
        Boolean isTrue = !false;
        Double secondNumberAgain = 40.2331241;
        Character someCharAgain = '\u054A';

        Integer num = number;
        Boolean bool = isFalse;
        Float floatNum = floatNumber;
        Character someCharChange = someChar;
        int secondNumberConvert = secondNumber;
        boolean secondBoolean = isTrue;
        double secondNumberConvertDouble = secondNumberAgain;
        char charConvert = someCharAgain;

        System.out.println("AUTOBOXING: ");
        System.out.println(number + " = " + num);
        System.out.println(isFalse + " = " + bool);
        System.out.println(floatNumber + " = " + floatNum);
        System.out.println(someChar + " = " + someCharChange);
        System.out.println("----------------------");
        System.out.println("UNBOXING: ");
        System.out.println(secondNumber + " = " + secondNumberConvert);
        System.out.println(isTrue + " = " + secondBoolean);
        System.out.println(secondNumberAgain + " = " + secondNumberConvertDouble);
        System.out.println(someCharAgain + " = " + charConvert);
    }
}
