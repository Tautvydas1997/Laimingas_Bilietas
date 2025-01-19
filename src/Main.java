import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite savo bilieto numerį (6 skaitmenys): ");
        int bilietoNumeris;
        try {
            bilietoNumeris = scanner.nextInt(); // Skaitome vartotojo įvestą numerį
            if (LoterijosBilietas.arLaimingasBilietas(bilietoNumeris)) {
                System.out.println("Bilietas yra laimingas!");
                return; // Jei bilietas laimingas, baigiame programą
            } else {
                System.out.println("Bilietas nėra laimingas. Generuojame laimingą bilietą...");
            }
        } catch (Exception e) {
            System.out.println("Įvestis neteisinga. Generuojame laimingą bilietą...");
        }

        // Jei bilietas nėra laimingas arba įvestis neteisinga, generuojame laimingą bilietą
        LoterijosBilietas.generuotiLaimingaBilieta();
    }
}
