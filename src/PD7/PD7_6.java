/*
Parašykite Java metodą, kuris skaičiuoja kiek yra raidžių pateiktoje eilutėje.
*/

package PD7;

public class PD7_6 {
    public static void main(String[] args) {
        System.out.println(getStringLength("Myliu programavima!"));
    }

    public static int getStringLength(String stringToCount) {
        int count = 0;
        int stringLength = stringToCount.length();
        int stringLengthWithoutChars = stringLength - count;

        for (char character : stringToCount.toCharArray()) {
            if (character == ' ' || character == '!' || character == ',' || character == '-') {
                count += 1;
            }
        }

        return stringLengthWithoutChars;
    }
}
