import java.util.Arrays;
import java.util.Scanner;

public class EvidencijaTemperature {
      private double temperatura[];
public EvidencijaTemperature(double temperatura[]) {
	this.temperatura = temperatura;
}
	  public double[] getTemperatura() {return temperatura;}
	  public void setTemperatura(double temperatura[]) {this.temperatura = temperatura;}
	
  public double prosjecnaTemperatura(double[]temperatura) {
     double suma = 0;
    for (double t : temperatura) {
    	suma += t;
    }		 
     return suma/ temperatura.length;
}
  
  public double maksimalnaTemperatura (double [] temperatura) {
	  double max = temperatura[0];
	for(double t : temperatura) {
		if (t > max) {
			max = t;
		}
	}
		return max;		  
  }
  
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
  
  double temperatura [] = new double [5];
  System.out.println("unesite 5 temperatura: ");
  for (int i = 0; i < temperatura.length;i++) {
	  System.out.print(i + 1 + ". temperatura: ");
	  temperatura[i] = sc.nextDouble(); 
  }
  EvidencijaTemperature e  = new EvidencijaTemperature(temperatura);
  
  System.out.println("\nDuzina niza je "+  e.getTemperatura().length);

   for (double x:temperatura) {
	System.out.print(x + ", ");
	}
   
   System.out.print("\nUnesite temperaturu koju zelite da provjerite da li se nalazi u nizu");
    double tmp =  sc.nextDouble();
    boolean imaJe = false;
    for (double x:temperatura) {
       if (x == tmp) {
    	   imaJe = true;
    	   break;
       }
	  }
    if (imaJe) {
    	System.out.println("Temperatura " + tmp + " se nalazi u nizu ");
    }else {
    	System.out.println("Temperatura " + tmp + " se  ne nalazi u nizu ");
          }
    
    double [] nizPrije = e.getTemperatura();
    int brojPonavljanja = 0;
    for (double t : nizPrije) {
        if (t == tmp)
            brojPonavljanja++;
    }
    double [] nizPosle = new double [nizPrije.length-brojPonavljanja];
    int j = 0;
    for (double x:temperatura) {
        if (x != tmp) {
     	nizPosle[j++]= x; 
       }
     }
    e.setTemperatura(nizPosle);
    
    System.out.println("\nAžurirani niz izgleda ovako: " + Arrays.toString(e.getTemperatura()));
    System.out.println("\nProsjecna temperatura je: " + e.prosjecnaTemperatura(e.getTemperatura()));
    System.out.println("\nMaksimalna temperatura je: " + e.maksimalnaTemperatura(e.getTemperatura()));
  }
}
