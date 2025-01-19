import java.util.Random;

public class LoterijosBilietas {

    // Funkcija tikrina, ar bilietas yra laimingas
    public static boolean arLaimingasBilietas(int bilietoNumeris) {
        String bilietas = String.format("%06d", bilietoNumeris); // Užtikriname, kad bilietas yra 6 skaitmenų
        int pirmuTryjuSuma = bilietas.charAt(0) - '0' + bilietas.charAt(1) - '0' + bilietas.charAt(2) - '0';
        int paskutiniuTryjuSuma = bilietas.charAt(3) - '0' + bilietas.charAt(4) - '0' + bilietas.charAt(5) - '0';

        // Tikriname, ar visi skaitmenys yra unikalūs
        boolean visiUnikalus = bilietas.chars().distinct().count() == 6;

        return pirmuTryjuSuma == paskutiniuTryjuSuma && visiUnikalus;
    }

    public static void generuotiLaimingaBilieta() {
        // Generuojame bilietus, kol randame pirmą laimingą bilietą
        Random atsitiktinis = new Random();
        int bandymai = 0;
        int laimingasBilietas = 0;

        do {
            laimingasBilietas = atsitiktinis.nextInt(1_000_000); // Generuojame skaičių nuo 0 iki 999999
            bandymai++;
        } while (!arLaimingasBilietas(laimingasBilietas));

        System.out.println("Pirmas laimingas bilietas: " + String.format("%06d", laimingasBilietas));
        System.out.println("Bandymų prireikė: " + bandymai);
    }
}
