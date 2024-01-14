/*
Naudojant Java metodus, parašykite paprasčiausią Java programą ”Kūno masės indeksas”.
*/

package PD7;

import java.util.Scanner;

public class PD7_19 {
    public static void main(String[] args) {
        Scanner getMeasurments = new Scanner(System.in);

        System.out.println("Pateikite savo ugi (m): ");
        double heightInput = getMeasurments.nextDouble();

        System.out.println("Pateikite savo svori (kg): ");
        double weightInput = getMeasurments.nextDouble();

        System.out.println(getBMI(heightInput, weightInput));
    }

    public static String getBMI(double height, double weight) {
        double BMI = weight / Math.pow(height, 2);
        String result;

        // switch'as neveikia su float ir double
        if (BMI < 18.5) {
            result = "Nepakankamai valgote, valgykite daugiau! KMI: " + BMI;
        } else if (BMI >= 18.5 && BMI < 25.0) {
            result = "Viskas gerai, svoris normalus! KMI: " + BMI;
        } else if (BMI >= 25.0 && BMI < 30.0) {
            result = "Sunerimk! Jau virsvoris. KMI: " + BMI;
        } else if (BMI >= 30.0 && BMI < 35.0) {
            result = "Blogai. I laipsnio nutukimas. Maziau valgyk! KMI: " + BMI;
        } else if (BMI >= 35.0 && BMI < 40.0) {
            result = "Visai negerai. II laipsnio nutukimas! KMI: " + BMI;
        } else {
            result = "Jau net neskaiciuosim.... Sesk ant dietos! KMI: " + BMI;
        }
        return result;
    }
}
