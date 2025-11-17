public class Racunar extends EProizvodi {
private String procesor;
private int memorija;
public Racunar(String opis, String šifraProizvoda, double uvoznaCijena,String procesor,int memorija) {
	super(opis, šifraProizvoda, uvoznaCijena);
	this.procesor = procesor;
    this.memorija = memorija;
}

public String getProcesor() {
	return procesor;
}

public void setProcesor(String procesor) {
	this.procesor = procesor;
}

public int getMemorija() {
	return memorija;
}

public void setMemorija(int memorija) {
	this.memorija = memorija;
}

@Override
public double maloprodajnaCijena() {
    return osnovnaCijena() * 1.05;
}


@Override
public String toString() {
    return "racunar " + super.toString() + ", Procesor: " + procesor + ", Memorija " + memorija + "GB, Maloprodajna cijena:" + maloprodajnaCijena();
}
}

