package zadatak1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TestnaKlasaProizvodi {
	
public static ArrayList<EProizvodi> nadjitip(ArrayList<EProizvodi> lista, String tip) {
	   ArrayList<EProizvodi> rezultat = new ArrayList<>();
	   for (EProizvodi p : lista) {
	    if (tip.equalsIgnoreCase("RA") && p instanceof Racunar)
	    rezultat.add(p);
	    else if (tip.equalsIgnoreCase("TE") && p instanceof Telefon)
	     rezultat.add(p);
	     else if (tip.equalsIgnoreCase("TV") && p instanceof Televizor)
 rezultat.add(p);
	        
	   }
	   return rezultat;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<EProizvodi> proizvodi = new ArrayList<>();

        while (true) {
            System.out.println("1. Unos uređaja");
            System.out.println("2. Pregled svih uređaja");
            System.out.println("3. Pregled uređaja određenog tipa");
            System.out.print("Odaberi opciju: ");

            int izbor = sc.nextInt();
            sc.nextLine();
            
            if (izbor == 1) {
                System.out.print("Unesite šifru uređaja");
                String sifra = sc.nextLine();

                System.out.print("Unesite opis uređaja: ");
                String opis = sc.nextLine();

                System.out.print("Unesite uvoznu cijenu: ");
                double cijena = sc.nextDouble();
                sc.nextLine(); 

              
            if (sifra.startsWith("RA")) {
                System.out.print("Unesite procesor: ");
                String procesor = sc.nextLine();

                System.out.print("Unesite memoriju: ");
                int memorija = sc.nextInt();

                proizvodi.add(new Racunar(opis, sifra, cijena, procesor, memorija));

            } else if (sifra.startsWith("TE")) {
                System.out.println("Unesite operativni sistem: ");
                String os = sc.nextLine();

                System.out.print("Unesite veličinu ekrana: ");
                int ekran = sc.nextInt();

                proizvodi.add(new Telefon(opis, sifra, cijena, os, ekran));
           

            } else if (sifra.startsWith("TV")) {
                System.out.print("Unesite veličinu ekrana: ");
                int ekran = sc.nextInt();

                proizvodi.add(new Televizor(opis, sifra, cijena, ekran));
               

            } 
	}else if (izbor == 2) {
	    if (proizvodi.isEmpty()) {
	        System.out.println("Nema unesenih uređaja");
	    } else {
	        System.out.println("\spisak uređaja koji sadrzi maloprodajnu cijenu");
	        for (EProizvodi n : proizvodi)
	            System.out.println(n);
	    }
	}

	else if (izbor == 3) {
	    System.out.print("Unesite tip uređaja: ");
	    String tip = sc.nextLine();

	    ArrayList<EProizvodi> rezultat = nadjitip(proizvodi, tip);
	    if (rezultat.isEmpty()) {
	        System.out.println("Nema tog uredjaja");
	    } else {
	        System.out.println("\nUređaji koje ste trazili" + tip.toUpperCase());
	        for (EProizvodi a : rezultat)
	            System.out.println(a);
	    }
	}

}
}
}