/*
* Parašykite programą, kuri demonstruoja float aritmetikos
* specifiką (pvz., apvalinimo klaidas),naudodami float ir double kintamuosius.
*/

package PD3;

public class PD3_3 {
    public static void main(String[] args) {
        float floatOne = 3.5555555678F;
        float floatTwo = 4.753232523F;

        float floatReminder = floatOne % floatTwo;
        double doubleReminder = floatOne % floatTwo;
        float floatDivideTwo = floatOne / floatTwo;
        double doubleDivideTwo = floatOne / floatTwo;

        System.out.println("Float reminder: " + floatReminder);
        System.out.println("Double reminder: " + doubleReminder);
        System.out.println("Float divide second number: " + floatDivideTwo);
        System.out.println("Double divide second number: " + doubleDivideTwo);
    }
}
