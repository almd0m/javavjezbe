
public class Televizor extends EProizvodi {
private int velicinaEkTv;

public Televizor(String opis, String šifraProizvoda, double uvoznaCijena,int velicinaEkTv) {
	super(opis, šifraProizvoda, uvoznaCijena);
	this.velicinaEkTv = velicinaEkTv;
}

public int getVelicinaEkTv() {
	return velicinaEkTv;
}

public void setVelicinaEkTv(int velicinaEkTv) {
	this.velicinaEkTv = velicinaEkTv;
}
@Override
public double maloprodajnaCijena() {
    double cijena = osnovnaCijena();
    if (velicinaEkTv > 65)
        cijena *= 1.10;
    return cijena;
}

@Override
public String toString() {
    return "televizor: " + super.toString() + ", Ekran: " + velicinaEkTv + " c, Maloprodajna cijena: " + maloprodajnaCijena();
}
}


