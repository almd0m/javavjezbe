
public class Automobil extends Vozilo {
  public int brojVrata;
  public String tipMotora;
  
  public Automobil(String proizvođač, int godinaProizvodnje, int kubikaža, String boja, int brojVrata, String tipMotora) {
      super(proizvođač, godinaProizvodnje, kubikaža, boja);
      this.brojVrata = brojVrata;
      this.tipMotora = tipMotora;
  }

  public int getBrojVrata() {
      return brojVrata;
  }

  public void setBrojVrata(int brojVrata) {
      this.brojVrata = brojVrata;
  }

  public String getTipMotora() {
      return tipMotora;
  }

  public void setTipMotora(String tipMotora) {
      this.tipMotora = tipMotora;
  }
  
  @Override
  public double izracunajCijenu() {
      double cijena = super.izracunajCijenu();
      if (tipMotora.equalsIgnoreCase("dizel")) cijena += 20;
      return cijena;
  }

  @Override
  public void prikaziInformacije() {
      super.prikaziInformacije();
      System.out.println("Broj vrata: " + brojVrata);
      System.out.println("Tip motora: " + tipMotora);
      System.out.println("Cijena registracije: " + izracunajCijenu() + " EUR");
      System.out.println("-----------"); 
  }
}


