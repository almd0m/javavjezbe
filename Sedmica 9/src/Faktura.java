
public class Faktura implements Trosak {
	private String brojFakture;
	private String opis;
	private float iznosBezPdv;
	private float pdvStopa;

	public Faktura() {
		this(null,null,0,0);
	}
	
	public Faktura(String brojFakture, String opis, float iznosBezPdv, float pdvStopa) {
		this.brojFakture = brojFakture;
		this.opis = opis;
		this.iznosBezPdv = iznosBezPdv;
		this.pdvStopa = pdvStopa;
	}

	public String getBrojFakture() {
		return brojFakture;
	}

	public void setBrojFakture(String brojFakture) {
		this.brojFakture = brojFakture;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public float getIznosBezPdv() {
		return iznosBezPdv;
	}

	public void setIznosBezPdv(float iznosBezPdv) {
		this.iznosBezPdv = iznosBezPdv;
	}

	public float getPdvStopa() {
		return pdvStopa;
	}

	public void setPdvStopa(float pdvStopa) {
		this.pdvStopa = pdvStopa;
	}

	@Override
	public float obracunajTrosak() {
		// TODO Auto-generated method stub
		return 0;
	}

}
