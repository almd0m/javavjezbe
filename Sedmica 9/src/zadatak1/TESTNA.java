package zadatak1;
import java.util.ArrayList;
import java.util.Scanner;
public class TESTNA {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ArrayList<Vozilo> vozila = new ArrayList<>();

        vozila.add(new Bicikl("Biciklo1", 20)); 
        vozila.add(new Motor("Motor1", 60));      
        vozila.add(new Automobil("Automobil", 90)); 
        System.out.print("Unesi udaljenost : ");
        double udaljenost = sc.nextDouble();
System.out.print("-----------------------");
        System.out.println("DOSTAVE " + udaljenost + " km");

        for (Vozilo v : vozila) {
            v.info();

            double vrijeme = v.izracunajVrijemeDostave(udaljenost);
            System.out.println("Vrijeme dostave: " + vrijeme + " h");

            if (v instanceof Ekonomican) {
                Ekonomican e = (Ekonomican) v;
                System.out.println("Potrosnja na " + udaljenost + " km: " +
                        (e.potrosnjaPoKm() * udaljenost));
            }

            System.out.println("@@@@@@@@@@@@@@@@");
        }
    }
}
