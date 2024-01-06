/*
* Parašykite programą, kuri deklaruoja byte ir short kintamuosius,
* priskiria jiems reikšmes, atlieka keletą matematinių operacijų ir atspausdina rezultatus.
*/

package PD3;

public class PD3_2 {
    public static void main(String[] args) {
        byte byteOne = 30;
        byte byteTwo = 10;
        short shortOne = 10;
        short shortTwo = 20;

        byte byteSum = (byte) (byteOne + byteTwo);
        byte byteMinus = (byte) (byteOne - byteTwo);
        short shortMultiply = (short) (shortOne * shortTwo);
        short shortDivision = (short) (shortTwo / shortOne);

        System.out.println("Byte sum: " + byteSum);
        System.out.println("Byte minus: " + byteMinus);
        System.out.println("Short multiply: " + shortMultiply);
        System.out.println("Short division: " + shortDivision);
    }
}
