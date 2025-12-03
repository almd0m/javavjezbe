package zadatak1;

public abstract class Vozilo {
 private String id;
 private double maxBrzina;
 public Vozilo(String Id, double maxBrzina) {
	id = Id;
	this.maxBrzina = maxBrzina;
 }
 public String getId() {
	return id;
 }
 public void setId(String id) {
	id = id;
 }
 public double getMaxBrzina() {
	return maxBrzina;
 }
 public void setMaxBrzina(double maxBrzina) {
	this.maxBrzina = maxBrzina;
 }
 public void info() {
     System.out.println("Vozilo ID: " + id + ", max brzina: " + maxBrzina + " km/h");
 }

 public abstract double izracunajVrijemeDostave(double udaljenostKm);
}

