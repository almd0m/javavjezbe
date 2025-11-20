import java.util.ArrayList;
//Daris Velovic 24/016
//Almedin Mekic 24/078
//Ajla Catovic 24/007
public class Game {
	
    private Player igrac;
    private ArrayList<Enemy> neprijatelji = new ArrayList<>();
    private ArrayList<String> dnevnik = new ArrayList<>();

    public Game(Player p) {
        if (p == null) throw new IllegalArgumentException("Igrac ne smije biti null.");
        this.igrac = p;
    }

    public void dodajNeprijatelja(Enemy e) {
        if (e == null) throw new IllegalArgumentException("Neprijatelj null.");
        neprijatelji.add(e);
        dnevnik.add("Dodat neprijatelj: " + e);
    }

    public boolean provjeriKoliziju(Player p, Enemy e) {
        return p.sudaraSe(e);
    }

    public void smanjiZdravlje(Player p, Enemy e) {
        int stara = p.getZdravlje();
        int dmg = e.efektivnaSteta();
        int nova = stara - dmg;
        if (nova < 0) nova = 0;
        p.setZdravlje(nova);
        dnevnik.add("Pogodak: " + e.prikaznoIme() + " za " + dmg +
                " -> " + stara + " -> " + nova);
    }

    public void riješiKolizije() {
        for (Enemy e : neprijatelji) {
            if (provjeriKoliziju(igrac, e)) {
                smanjiZdravlje(igrac, e);
            }
        }
    }

    public static Enemy parseEnemy(String s) {
        String[] dijelovi = s.split(":");
        String tip = dijelovi[0];

        String[] koord = dijelovi[1].split(",");
        int x = Integer.parseInt(koord[0]);
        int y = Integer.parseInt(koord[1]);

        String[] vel = dijelovi[2].split("x");
        int w = Integer.parseInt(vel[0]);
        int h = Integer.parseInt(vel[1]);

        int šteta = Integer.parseInt(dijelovi[3]);
        String vrsta = dijelovi[4];

        Collidable kol = new PravougaoniKolajder(x, y, w, h);

        if (vrsta.equalsIgnoreCase("boss")) {
            return new BossEnemy(tip, x, y, kol, šteta, 100);
        }
        return new MeleeEnemy(tip, x, y, kol, šteta, 70);
    }
    public ArrayList<Enemy> getNeprijatelji() {
        return neprijatelji;
    }

    public ArrayList<String> getDnevnik() {
        return dnevnik;
    }

    public Player getIgrac() {
        return igrac;
    }
}


