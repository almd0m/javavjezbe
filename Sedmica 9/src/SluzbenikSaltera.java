
public class SluzbenikSaltera extends Zaposleni implements Trosak {
	private int brojObradjenihZahtjeva;
	private float bonusPozahtjevu;

	public SluzbenikSaltera() {
		this.brojObradjenihZahtjeva = 0;
		this.bonusPozahtjevu = 0;
	}

	public int getBrojObradjenihZahtjeva() {
		return brojObradjenihZahtjeva;
	}

	public void setBrojObradjenihZahtjeva(int brojObradjenihZahtjeva) {
		this.brojObradjenihZahtjeva = brojObradjenihZahtjeva;
	}

	public float getBonusPozahtjevu() {
		return bonusPozahtjevu;
	}

	public void setBonusPozahtjevu(float bonusPozahtjevu) {
		this.bonusPozahtjevu = bonusPozahtjevu;
	}
	

	public SluzbenikSaltera(String imePrezime, String idRadnika, float osnovnaPlata, int brojObradjenihZahtjeva,
			float bonusPozahtjevu) {
		super(imePrezime, idRadnika, osnovnaPlata);
		this.brojObradjenihZahtjeva = brojObradjenihZahtjeva;
		this.bonusPozahtjevu = bonusPozahtjevu;
	}

	@Override
	public float obracunajTrosak() {
		// TODO Auto-generated method stub
		return this.izracunajPlatu();
	}

	@Override
	public float izracunajPlatu() {
		// TODO Auto-generated method stub
		return this.getOsnovnaPlata();
	}

}
