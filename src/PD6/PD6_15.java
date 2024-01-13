package PD6;

public class PD6_15 {
    public static void main(String[] args) {
        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 10};
        // tikriname, ar masyvas susideda is bent 2 elementu
        if (array.length < 1){
            System.out.printf("Vidurkiui reikia bent 2 skaiciu!");
        } else {
            // sukuriame nauja kintamaji sum
            double sum = 0;
            // su forEach'u pereiname per masyvo kiekviena elementa
            for (double el : array) {
                // ir pereidami per kiekviena masyvo elementa, pridedama ta elementa prie sum
                // sum - viso masyvo elementu suma
                sum += el;
            }
            // su kintamuoju avg apskaiciuojame masyvo elementu vidurki
            double avg = sum / array.length;
            System.out.println("Masyvo elementu vidurkis: " + avg);

            // ieskome elemento, kuris yra arciausiai apskaiciuoto anksciau vidurkio
            // closest bus atspirties taskas
            double closest = array[0];
            // Math.abs grazins teigiama ir absoliutuju skaiciu
            // su minDif ieskosime skirtumo
            double minDif = Math.abs(closest - avg);

            // iteruojame per masyva
            for (int i = 0; i < array.length; i++){
                // iteruodami ir su dif skaiciuosime kiekvieno elemento skirtuma ir dedame i dezute
                double dif = Math.abs(array[i] - avg);
                if (dif < minDif){
                    closest = array[i];
                    minDif = dif;
                }
            }
            System.out.println("Artimiausias vidurkiui skaicius yra: " + closest);
        }
    }
}
