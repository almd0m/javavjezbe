public class Kombi extends Vozilo {
public int kapacitetPutnika;

public Kombi(String proizvođač, int godinaProizvodnje, int kubikaža, String boja, int kapacitetPutnika) {
    super(proizvođač, godinaProizvodnje, kubikaža, boja);
    this.kapacitetPutnika = kapacitetPutnika;
}

public int getKapacitetPutnika() {
    return kapacitetPutnika;
}

public void setKapacitetPutnika(int kapacitetPutnika) {
    this.kapacitetPutnika = kapacitetPutnika;
}

@Override
public double izracunajCijenu() {
    double cijena = super.izracunajCijenu();
    if (kapacitetPutnika > 8) cijena += 30;
    return cijena;
}

@Override
public void prikaziInformacije() {
    super.prikaziInformacije();
    System.out.println("Kapacitet putnika: " + kapacitetPutnika);
    System.out.println("Cijena registracije: " + izracunajCijenu() + " EUR");
    System.out.println("----------------------------");
}
}

