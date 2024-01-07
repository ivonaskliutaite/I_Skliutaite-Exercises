/*
Parašykite programą, kuri randa kiek kartu pasikartoja pasirinktas masyvo elementas.
*/

package PD6;

public class PD6_4 {
    public static void main(String[] args) {
        String [] array = {"saule", "sniegas", "lietus", "plykledis", "saule"};

        String word = "sniegas";
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] == word){
                count++;
            }
        }
        System.out.println("Zodis " + word + " pasikartoja " + count + " kartu/ -us/ -a).");
    }
}
