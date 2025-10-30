
public class Vozilo {
  
	public String proizvođač;
    public int godinaProizvodnje;
    public int kubikaža;
    public String boja;
    
    public Vozilo(String proizvođač, int godinaProizvodnje, int kubikaža, String boja) {
  		super();
  		this.proizvođač = proizvođač;
  		this.godinaProizvodnje = godinaProizvodnje;
  		this.kubikaža = kubikaža;
  		this.boja = boja;
  	}

	public String getProizvođač() {
		return proizvođač;
	}

	public void setProizvođač(String proizvođač) {
		this.proizvođač = proizvođač;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public int getKubikaža() {
		return kubikaža;
	}

	public void setKubikaža(int kubikaža) {
		this.kubikaža = kubikaža;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
    
	
	public double izracunajCijenu() {
		double cijena = 100;
		
		if (kubikaža>2000)
			cijena += 50;
		
	    if (godinaProizvodnje> 2010)
	    	cijena+=30;
	    
	    return cijena;
	}
	 public void prikaziInformacije() {
	        System.out.println("Proizvođač: " + proizvođač);
	        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
	        System.out.println("Kubikaža: " + kubikaža);
	        System.out.println("Boja: " + boja);
	        
}
}

