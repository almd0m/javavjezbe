
public abstract class Zaposleni {
private String imePrezime;
private String id;
private float osnovnaPlata;
public String getImePrezime() {
	return imePrezime;
}
public Zaposleni(String imePrezime, String idRadnika, float osnovnaPlata) {
	super();
	this.setImePrezime (imePrezime);
	this.setId(id);
	this.setOsnovnaPlata(osnovnaPlata);
	
}
public Zaposleni() {
    this.imePrezime = "";
    this.id = "";
    this.osnovnaPlata = 0;
}


public void setImePrezime(String imePrezime) {
	this.imePrezime = imePrezime;
}
public String getIdRadnika() {
	return id;
}
public void setId(String idRadnika) {
	this.id = idRadnika;
}
public float getOsnovnaPlata() {
	return osnovnaPlata;
}
public void setOsnovnaPlata(float osnovnaPlata) {
	this.osnovnaPlata = osnovnaPlata;
}
@Override
public String toString() {
	return "{ 'klasa' : Zaposleni [imePrezime=" + imePrezime + ", id=" + id + ", osnovnaPlata=" + getOsnovnaPlata() + "]";
}

public abstract float izracunajPlatu();

}
