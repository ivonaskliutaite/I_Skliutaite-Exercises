/*
Sukurkite programą, kuri deklaruoja String kintamuosius, atlieka su jais įvairias operacijas,
pvz.,sujungimą, palyginimą, dalies ištraukimą ir atspausdina rezultatus.
*/

package PD3;

public class PD3_7 {
    public static void main(String[] args) {
        String firstString = "Hello,";
        String secondString = "Sun!";
        String thirdString = "You're awesome!";
        String fourthString = new String("Let's have fun with Java!");
        String fullSentence = firstString + secondString;
        String fullSecondSentence = secondString .concat(thirdString);
        String fullThirdSentence = "Hello, " + secondString;
        Boolean sentenceComparision = firstString == fourthString;
        Boolean sentenceEquality = firstString.equals(secondString);
        int stringLength = firstString.length();
        String subString = secondString.substring(0,3);
        char fourthStringChar = fourthString.charAt(0);
        String uppercaseOfFullSentence = fullSentence.toUpperCase();
        String replaceFullSecondSentence = fullSecondSentence.replace("a", "b");
        boolean containsSomeChar = fullThirdSentence.contains("Hello");

        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);
        System.out.println("Third string: " + thirdString);
        System.out.println("Fourth string: " + fourthString);
        System.out.println("Full sentence string: " + fullSentence);
        System.out.println("Full second sentence string: " + fullSecondSentence);
        System.out.println("Full third sentence string: " + fullThirdSentence);
        System.out.println("Sentence comparision: " + sentenceComparision);
        System.out.println("Sentence equality: " + sentenceEquality);
        System.out.println("String length: " + stringLength);
        System.out.println("Substring: " + subString);
        System.out.println("Fourth string char: " + fourthStringChar);
        System.out.println("Upper case of full sentence: " + uppercaseOfFullSentence);
        System.out.println("Replace 'a' to 'b' in sentence: " + replaceFullSecondSentence);
        System.out.println("If third string conatains 'Hello': " + containsSomeChar);
    }
}
