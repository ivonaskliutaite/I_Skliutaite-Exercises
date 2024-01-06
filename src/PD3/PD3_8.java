/*
Parašykite programą, kuri atspausdina pateiktos išraiškos rezultatą:
7.5×6.5−4.5×347.5−5.5=12.7815.4−2.75;
Result: false;
*/

package PD3;

public class PD3_8 {
    public static void main(String[] args) {
        float firstMultiply = 7.5F * 6.5F;
        float secondMultiply = 4.5F * 3;
        float leftTopPart = firstMultiply - secondMultiply;
        float leftBottomPart = 47.5F - 5.5F;
        float leftSide = leftTopPart / leftBottomPart;
        float rightBottomPart = 12.4F - 2.75F;
        float rightSide = 12.78F / rightBottomPart;
        boolean isEqual = leftSide == rightSide;

        System.out.println("First step 7.5 * 6.5: " + firstMultiply);
        System.out.println("Second step 4.5 * 3: " + secondMultiply);
        System.out.println("Third step 48.75 - 13.5: " + leftTopPart);
        System.out.println("Fourth step 47.5 - 5.5: " + leftBottomPart);
        System.out.println("Fifth step 35.25 : 42.0: " + leftSide);
        System.out.println("Sixth step 12.4 - 2.75: " + rightBottomPart);
        System.out.println("Seventh step: 12.78 : 9.65" + rightSide);
        System.out.println("Are the sides equal? " + isEqual);
    }
}
