package zadatak1;

public class EProizvodi {
private String opis;
private String šifraProizvoda;
private double uvoznaCijena;
public EProizvodi(String opis, String šifraProizvoda, double uvoznaCijena) {
	this.opis = opis;
	this.šifraProizvoda = šifraProizvoda;
	this.uvoznaCijena = uvoznaCijena;
}
public String getOpis() {
	return opis;
}
public void setOpis(String opis) {
	this.opis = opis;
}
public String getŠifraProizvoda() {
	return šifraProizvoda;
}
public void setŠifraProizvoda(String šifraProizvoda) {
	this.šifraProizvoda = šifraProizvoda;
}
public double getUvoznaCijena() {
	return uvoznaCijena * 1.05;
}
public double osnovnaCijena() {
	return uvoznaCijena * 1.05;
}
public double maloprodajnaCijena() {
	return osnovnaCijena();
}
public void setUvoznaCijena(double uvoznaCijena) {
	this.uvoznaCijena = uvoznaCijena;
}
@Override
public String toString() {
	return "\nEProizvodi:opis=" + opis + ", šifraProizvoda=" + šifraProizvoda + ", uvoznaCijena=" + uvoznaCijena + ";";
}


	
}
