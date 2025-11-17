package zadatak2;
import java.util.ArrayList;

class Restoran {
    private String naziv;
    private String adresa;
    private String PIB;
    private ArrayList<Zaposleni> listaZaposlenih = new ArrayList<>();

    public Restoran(String naziv, String adresa, String PIB) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.PIB = PIB;
    }

    public void dodajZaposlenog(Zaposleni z) {
        listaZaposlenih.add(z);
    }

    public void ukloniZaposlenog(int id) {
        listaZaposlenih.removeIf(z -> z.getId() == id);
    }

    public Zaposleni pretraziPoID(int id) {
        for (Zaposleni z : listaZaposlenih) {
            if (z.getId() == id) return z;
        }
        return null;
    }

    public void generisiObracun(String mjesec, int godina) {
        double ukupno = 0;
        System.out.println("\nObracun plata za mjesec " + mjesec + " " + godina);
        System.out.printf("%-5s %-12s %-12s %-10s %-10s %-12s %-12s %-20s\n",
                "ID", "Ime", "Prezime", "Tip", "Sati", "Prekovr.", "Plata(EUR)", "Napomena");

        for (Zaposleni z : listaZaposlenih) {
            obracunPlata o = new obracunPlata(mjesec, godina, z);
            o.prikaziObracun();
            ukupno += o.getIznos();
        }

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("UKUPNI TROŠAK PLATA: %.2f EUR\n", ukupno);
    }
}