package zadatak2;

class obracunPlata {
private String mjesec;
private int godina;
private Zaposleni zaposleni;
private double iznos;
private String napomena;
public obracunPlata(String mjesec, int godina, Zaposleni zaposleni) {
	this.mjesec = mjesec;
	this.godina = godina;
	this.zaposleni = zaposleni;
	this.iznos = zaposleni.izracunajPlatu();
	 if (zaposleni.getTipZaposlenog().equalsIgnoreCase("Konobar") && zaposleni.getPrekovremeniSati() > 0)
         this.napomena = "Uračunat prekovremeni rad";
     else if (zaposleni.getTipZaposlenog().equalsIgnoreCase("Menadzer") && zaposleni.getBonus() > 0)
         this.napomena = "Bonus: " + zaposleni.getBonus() + " EUR";
     else
         this.napomena = "Bez dodataka";
 }
public void prikaziObracun() {
    System.out.printf("%-5d %-12s %-12s %-10s %-10d %-12d %-12.2f %-20s\n",
            zaposleni.getId(), zaposleni.getIme(), zaposleni.getPrezime(),
            zaposleni.getTipZaposlenog(), zaposleni.getUkupanBrojSati(),
            zaposleni.getPrekovremeniSati(), iznos, napomena);
}

public double getIznos() { return iznos; }




}
