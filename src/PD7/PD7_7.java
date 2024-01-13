/*
Parašykite Java metodą, kuris apverčia skaičių (Pvz.: 45 –> 54).
*/

package PD7;

public class PD7_7 {
    public static void main(String[] args) {

        int num = 1234;
        // sukuriame dezute naujam skaiciui
        int reversed = 0;

        System.out.println("Musu pateiktas skaicius: " + num);

        // ciklas vyks kol num nelygus 0
        while (num != 0) {
            // vyksta skaiciaus padalinimas is galo - noredami gauti paskutini skaiciu
            // musu pateikta skaiciu daliname kaskart is 10
            int digit = num % 10;
            // i dezute ikeliamas skaicius
            // reversed = 0 * 10 + 1234 % 10 = 0 + 4 = 4
            // reversed = 4
            reversed = reversed * 10 + digit;

            // istryname is galo paskutini skaiciu, kuris jau yra reversed dezuteje
            // num = 1234 / 10 = 123,4
            // num = 123 / nes liekana neieis i skaiciu, tik sveikas skaicius liks
            num /= 10;
        }
        System.out.println("Apsuktas skaicius: " + reversed);
    }
}
