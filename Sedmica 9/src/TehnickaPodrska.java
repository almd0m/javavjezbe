
public class TehnickaPodrska extends Zaposleni implements Trosak {
	private int brojRijesenihTiketa;
	private float koeficjentUcinka;
	public TehnickaPodrska() {
		this(null,null,0,0,0);
	}
	
	public TehnickaPodrska(String imePrezime, String idRadnika, float osnovnaPlata, int brojRijesenihTiketa,
			float koeficjentUcinka) {
		super(imePrezime, idRadnika, osnovnaPlata);
		this.brojRijesenihTiketa = brojRijesenihTiketa;
		this.koeficjentUcinka = koeficjentUcinka;
	}

	@Override
	public float obracunajTrosak() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float izracunajPlatu() {
		// TODO Auto-generated method stub
		return 0;
	}

}
