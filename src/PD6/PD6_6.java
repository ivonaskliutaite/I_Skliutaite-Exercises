/*
Parašykite programą, kuri atspausdina pateikto masyvo elementus.
*/

package PD6;

public class PD6_6 {
    public static void main(String[] args) {
        String [] array = {"lietus", "saule", "zeme", "sniegas"};

        System.out.println("Masyvo elementai: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "; ");
        }

        int doWhileCounterIndex = 0;
        do{
            System.out.println(array[doWhileCounterIndex] + " ");
            doWhileCounterIndex++;
        } while (doWhileCounterIndex < array.length);
    }
}
