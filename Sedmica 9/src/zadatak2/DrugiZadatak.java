package zadatak2;
import java.util.Scanner;

public class DrugiZadatak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double cijena = 0;
        boolean validno = false;

        while (!validno) {
            System.out.print("Unesite cijenu proizvoda: ");

            try {
                String unos = sc.nextLine();
                cijena = Double.parseDouble(unos);

                if (cijena <= 0) {
                    throw new IllegalArgumentException("Cijena mora biti pozitivan broj!");
                }

                validno = true;

            } catch (NumberFormatException e) {
                System.out.println("morate unieti tekst ne broj");

            } catch (IllegalArgumentException e) {
                System.out.println("Greska " + e.getMessage());
            }
        }

        System.out.println("Uspjesno unesena cijena: " + cijena + " €");
    }
}
