package zadatak1;
public class Telefon extends EProizvodi {
private String operativniSistem;
private int velicinaEkrana;
public Telefon(String opis, String šifraProizvoda, double uvoznaCijena,String operativniSistem, int velicinaErana) {
	super(opis, šifraProizvoda, uvoznaCijena);
    this.operativniSistem = operativniSistem;
    this.velicinaEkrana = velicinaEkrana;
    
}

public String getOperativniSistem() {
	return operativniSistem;
}

public void setOperativniSistem(String operativniSistem) {
	this.operativniSistem = operativniSistem;
}

public int getVelicinaEkrana() {
	return velicinaEkrana;
}

public void setVelicinaEkrana(int velicinaEkrana) {
	this.velicinaEkrana = velicinaEkrana;
}

@Override
public double maloprodajnaCijena() {
    double cijena = osnovnaCijena();
    if (velicinaEkrana > 6)
        cijena = cijena * 1.03; 
    return cijena;
}
@Override
public String toString() {
    return "Telefoni: " + super.toString() + ", operativni sis: " + operativniSistem + ", vlicna ekrana : " + velicinaEkrana + "cm, Maloprodajna cijena: " + maloprodajnaCijena();
}
}

