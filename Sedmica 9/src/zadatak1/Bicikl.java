package zadatak1;

public class Bicikl extends Vozilo implements Ekonomican {

    public Bicikl(String id, double maxBrzina) {
        super(id, maxBrzina);
    }

    @Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / getMaxBrzina();
    }

    @Override
    public double potrosnjaPoKm() {
        return 0;
    }
}
