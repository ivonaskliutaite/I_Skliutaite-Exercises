/*
Parašykite Java metodą, kuris skaičiuoja trikampio plotą.
*/

package PD7;

public class PD7_3 {
    public static void main(String[] args) {
        System.out.println("Duoto trikampio plotis = " + givenTriangleArea(5F, 5.45F));
    }

    public static float givenTriangleArea(float a, float h) {
        System.out.println("Aukstis = " + h);
        System.out.println("Pagrindo ilgis = " + a);
        return a * h / 2;
    }
}
