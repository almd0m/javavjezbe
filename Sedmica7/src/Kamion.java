public class Kamion extends Vozilo {
public double kapacitetTereta;
public boolean prikolica;

public Kamion(String proizvođač, int godinaProizvodnje, int kubikaža, String boja,double kapacitetTereta,boolean prikolica) {
	super(proizvođač, godinaProizvodnje, kubikaža, boja);
	this.kapacitetTereta= kapacitetTereta;
	this.prikolica= prikolica;
}


public double getKapacitetTereta() {
    return kapacitetTereta;
}

public void setKapacitetTereta(double kapacitetTereta) {
    this.kapacitetTereta = kapacitetTereta;
}

public boolean isPrikolica() {
    return prikolica;
}

public void setPrikolica(boolean prikolica) {
    this.prikolica = prikolica;
}

@Override
public double izracunajCijenu() {
    double cijena = super.izracunajCijenu();
    if (prikolica) cijena += 50;
    return cijena;
}

@Override
public void prikaziInformacije() {
    super.prikaziInformacije();
    System.out.println("Kapacitet tereta: " + kapacitetTereta + " t");
    System.out.println("Prikolica: " + (prikolica ? "da" : "ne"));
    System.out.println("Cijena registracije: " + izracunajCijenu() + " EUR");
    System.out.println("-----------"); 
}
}

