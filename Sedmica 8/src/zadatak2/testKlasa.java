package zadatak2;

public class testKlasa {

	public static void main(String[] args) {
	Restoran r = new Restoran("Pod Volat","Stara Varos","098765"); 
	Zaposleni z1 = new Zaposleni(1, "Marko", "Marković", 7.5, 40, "Konobar");
    z1.setPrekovremeniSati(5);
    Zaposleni z2 = new Zaposleni(2, "Jelena", "Jovanović", 8.0, 42, "Kuvar");
    Zaposleni z3 = new Zaposleni(3, "Milan", "Popović", 10.0, 38, "Menadzer");
    z3.setBonus(200);

    Zaposleni z4 = new Zaposleni(4, "Ana", "Nikolić", 7.0, 35, "Konobar");
    z4.setPrekovremeniSati(0);

    Zaposleni z5 = new Zaposleni(5, "Ivana", "Petrović", 9.0, 40, "Kuvar");

    r.dodajZaposlenog(z1);
    r.dodajZaposlenog(z2);
    r.dodajZaposlenog(z3);
    r.dodajZaposlenog(z4);
    r.dodajZaposlenog(z5);

    r.generisiObracun("Novembar", 2025);
}

	}


