public class Test {

	public static void main(String[] args) {

		Player igrac = new Player("Zlatan Ibrahimovic ", 10, 5, 32, 32, 100);

		Game igra = new Game(igrac);

		Enemy goblin = new MeleeEnemy("Goblin", 12, 5, new PravougaoniKolajder(12, 5, 16, 16), 20, 60);
		igra.dodajNeprijatelja(goblin);

		Enemy ork = Game.parseEnemy("Ork:15,7:16x16:25:boss");
		igra.dodajNeprijatelja(ork);

		System.out.println("Svi neprijatelji:");
		for (Enemy e : igra.getNeprijatelji()) {
			System.out.println(e);
		}

		System.out.println("\nNeprijatelji sa 'gob' u tipu:");
		for (Enemy e : igra.getNeprijatelji()) {
			if (e.prikaznoIme().toLowerCase().contains("gob")) {
				System.out.println(e);
			}
		}

		System.out.println("\nStanje igraca prije kolizija: HP = " + igrac.getZdravlje());

		igra.riješiKolizije();

		System.out.println("Stanje igraca poslije kolizija: HP = " + igrac.getZdravlje());

		System.out.println("\nDnevnik dogadjaja:");
		for (String s : igra.getDnevnik()) {
			System.out.println(s);
		}
	}
}
