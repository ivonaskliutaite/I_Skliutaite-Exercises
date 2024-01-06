/*
Parašykite programą, kuri demonstruoja skirtingų primityvių duomenų
tipų konvertavimą (cas-ting), pvz., int į double, long į int, ir pan.
*/

package PD3;

public class PD3_5 {
    public static void main(String[] args) {
        int firstInt = 453335;
        long firstLong = 40325224L;
        float firstFloat = 335332.24242F;
        double firstDouble = 135141.3251515;

        double intToDouble = (double) firstInt;
        int longToInt = (int) firstLong;
        int doubleToInt = (int) firstDouble;
        long floatToLong = (long) firstFloat;

        System.out.println("Int to double: " + intToDouble);
        System.out.println("Long to int: " + longToInt);
        System.out.println("Double to int: " + doubleToInt);
        System.out.println("Float to long: " + floatToLong);
    }
}
