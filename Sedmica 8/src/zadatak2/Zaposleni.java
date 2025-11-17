package zadatak2;

	public class Zaposleni {
		private int id;
		private String ime;
		private String prezime;
		private double plataPoSatu;
		private int ukupanBrojSati;
		private String tipZaposlenog;
		private int prekovremeniSati;
		private double bonus;

		public Zaposleni(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati,
				String tipZaposlenog) {
			this.id = id;
			this.ime = ime;
			this.prezime = prezime;
			this.plataPoSatu = plataPoSatu;
			this.ukupanBrojSati = ukupanBrojSati;
			this.tipZaposlenog = tipZaposlenog;
			this.prekovremeniSati = prekovremeniSati;
			this.bonus = bonus;
		}

		public int getId() {return id;}

		public String getIme() {return ime;}

		public String getPrezime() {
			return prezime;
		}

		public double getPlataPoSatu() {
			return plataPoSatu;
		}

		public int getUkupanBrojSati() {
			return ukupanBrojSati;
		}

		public String getTipZaposlenog() {
			return tipZaposlenog;
		}

		public int getPrekovremeniSati() {
			return prekovremeniSati;
		}

		public double getBonus() {
			return bonus;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}

		public void setPrezime(String prezime) {
			this.prezime = prezime;
		}

		public void setPlataPoSatu(double plataPoSatu) {
			this.plataPoSatu = plataPoSatu;
		}

		public void setUkupanBrojSati(int ukupanBrojSati) {
			this.ukupanBrojSati = ukupanBrojSati;
		}

		public void setTipZaposlenog(String tipZaposlenog) {
			this.tipZaposlenog = tipZaposlenog;
		}

		public void setPrekovremeniSati(int prekovremeniSati) {
			this.prekovremeniSati = prekovremeniSati;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
public double izracunajPlatu() {
	double plata = 0;
	if (tipZaposlenog.equalsIgnoreCase("Konobar")) {
		double redovnaPlata = 4 * ukupanBrojSati * plataPoSatu;
		double prekovremenaPlata = 4 * prekovremeniSati * (plataPoSatu * 1.2);
		plata = redovnaPlata + prekovremenaPlata;
	}else if(tipZaposlenog.equalsIgnoreCase("Kuvar")){
		plata = 1500 + 4 * ukupanBrojSati * plataPoSatu;
	}else if(tipZaposlenog.equalsIgnoreCase("Menadzer")){
		plata = 1300 + 4 * ukupanBrojSati * plataPoSatu + bonus;
	}
	return plata;	
	}
@Override
public String toString() {
    return String.format("%-5d %-12s %-12s %-10s %-10d %-12d %-10.2f",
            id, ime, prezime, tipZaposlenog, ukupanBrojSati, prekovremeniSati, izracunajPlatu());
}
}	

	
