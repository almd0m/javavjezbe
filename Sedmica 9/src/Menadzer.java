
public class Menadzer extends Zaposleni implements Trosak {
	private float koeficjentOdgovornosti;
	public Menadzer() {
		this(null,null,0,0);
		
	}

	public Menadzer(String imePrezime, String idRadnika, float osnovnaPlata, float koeficjentOdgovornosti) {
		super(imePrezime, idRadnika, osnovnaPlata);
		this.koeficjentOdgovornosti = koeficjentOdgovornosti;
	}

	public float getKoeficjentOdgovornosti() {
		return koeficjentOdgovornosti;
	}

	public void setKoeficjentOdgovornosti(float koeficjentOdgovornosti) {
		this.koeficjentOdgovornosti = koeficjentOdgovornosti;
	}

	@Override
	public float obracunajTrosak() {
		// TODO Auto-generated method stub
		return this.izracunajPlatu();
	}

	@Override
	public float izracunajPlatu() {
		return this.getOsnovnaPlata();
	}

}
