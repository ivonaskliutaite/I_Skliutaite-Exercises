package PD2;

import java.util.Scanner;

public class PD2_4 {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner nameInput = new Scanner(System.in);
        // Text for input
        System.out.println("Please enter your name:");

        // Read user input
        String userName = nameInput.nextLine();
        // Text, which will be shown as output
        System.out.println("Sveiki, " + userName + "!");
    }
}
