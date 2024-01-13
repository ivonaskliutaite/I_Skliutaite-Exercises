/*
Parašykite Java metodą, kuris patikrina ar teksto eilutė yra palindromas, ar ne?
*/

package PD7;

public class PD7_8 {
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("JaAaJ"));
    }

    public static String isStringPalindrome(String text) {
        // teksta sulyginam - padarom lowercase'a
        String textLowerCase = text.toLowerCase();

        // tuscia string'o dezute, i kuria desim apversta teksta
        String reverseText = "";
        boolean isPalindrome = false;
        int textLength = text.length();

        // zodzio iteracija is galo
        for (int i = textLength - 1; i >= 0; i--) {

            // idedame po viena raide i dezute
            reverseText = reverseText + textLowerCase.charAt(i);

            // lyginame, ar duotas zodis ir tekstas dezuteje yra vienodi
            if (textLowerCase.equals(reverseText)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        System.out.println("Duotas zodis: " + text);
        return "Ar zodis yra palindromas? " + isPalindrome;
    }
}
