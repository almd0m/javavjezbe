package zadatak1;

public class Automobil extends Vozilo  {

	public Automobil(String Id, double maxBrzina) {
		super(Id, maxBrzina);
	}


	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		// TODO Auto-generated method stub
		return udaljenostKm/getMaxBrzina();
	}

}
