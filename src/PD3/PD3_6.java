/*
Parašykite programą, kuri demonstruoja klasių kėvalų (angl. wrapper classes) naudojimą.
*/

package PD3;

public class PD3_6 {
    public static void main(String[] args) {
        Short shortWrapper = 50;
        Byte byteWrapper = 50;
        Integer intWrapper = 50;
        Long longWrapper = 50L;
        Float floatWrapper = 50F;
        Double doubleWrapper = 50.0;
        Boolean booleanWrapper = true;
        Character charWrapper = 'd';

        System.out.println("Short wrapper: " + shortWrapper);
        System.out.println("Byte wrapper: " + byteWrapper);
        System.out.println("Int wrapper: " + intWrapper);
        System.out.println("Long wrapper: " + longWrapper);
        System.out.println("Float wrapper: " + floatWrapper);
        System.out.println("Double wrapper: " + doubleWrapper);
        System.out.println("Boolean wrapper: " + booleanWrapper);
        System.out.println("Char wrapper: " + charWrapper);
    }
}
