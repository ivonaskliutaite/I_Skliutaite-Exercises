/*
Statybininkui reikia pastatyti sieną, kurios ilgis yra a metrų, o aukštis h metrų
(a ir h yra sveikiejiskaičiai). Kiek reikės plytų, kurių ilgis 20 cm, o aukštis 10 cm ir
kiek kainuos plytos, jeiguvienos plytos kaina k Eur. Pinigų sumą pateikti
šimtųjų tikslumu. Parametrai a, h ir k įvedami išklaviatūros.
*/

package PD4;

import java.util.Scanner;

public class PD4_8 {
    public static void main(String[] args) {
        float brickWidth = 0.2f;
        float brickHeight = 0.1f;

        Scanner newDimensions = new Scanner(System.in);

        System.out.println("Iveskite sienos ilgi (metrais, tik sveikasis skaicius: )");
        int a = newDimensions.nextInt();

        System.out.println("Iveskite sienos auksti (metrais, tik sveikasis skaicius: )");
        int h = newDimensions.nextInt();

        System.out.println("Iveskite plytos kaina (eurais): ");
        float k = newDimensions.nextFloat();

        System.out.println("Sienos ilgis metrais: " + a);
        System.out.println("Sienos aukstis metrais: " + h);
        System.out.println("Plytos kaina eurais: " + k);

        float wallH = h / brickHeight;
        float wallW = a / brickWidth;
        // plotis = ilgis * aukstis
        int wallBricks = Math.round(wallW * wallH);
        float brickPrice = wallBricks * k;

        System.out.println("Plytu kiekis: " + wallBricks);
        System.out.printf("Plytos kainuos %.2f Euru", brickPrice);
    }
}
