import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Game {

    private Igrac igrac;
    private ArrayList<Neprijatelj> neprijatelji;
    private ArrayList<String> log;

    public Game(Igrac igrac) {
        this.igrac = igrac;
        this.neprijatelji = new ArrayList<>();
        this.log = new ArrayList<>();
        log.add("Igra pokrenuta: " + igrac.getPrikaznoIme());
    }

    public Igrac getIgrac() { return igrac; }
    public List<Neprijatelj> getNeprijatelji() { return neprijatelji; }
    public List<String> getLog() { return log; }

    public void dodajNeprijatelja(Neprijatelj n) {
        neprijatelji.add(n);
        log.add("Dodat neprijatelj: " + n);
    }

    public boolean kolizija(Igrac p, Neprijatelj n) {
        boolean x = p.sijece(n);
        if (x) log.add("Kolizija: " + p.getIme() + " sa " + n.getTip());
        return x;
    }

    public void smanjiZdravlje(Igrac p, Neprijatelj n) {
        int dmg = n.efektivnaSteta();
        int staro = p.getZdravlje();
        int novo = staro - dmg;
        if (novo < 0) novo = 0;
        p.postaviZdravlje(novo);
        log.add("Steta " + dmg + " od " + n.getTip());
    }

    public List<Neprijatelj> nadjiPoTipu(String q) {
        ArrayList<Neprijatelj> r = new ArrayList<>();
        if (q == null) return r;
        String qq = q.toLowerCase();
        for (Neprijatelj n : neprijatelji)
            if (n.getTip().toLowerCase().contains(qq)) r.add(n);
        log.add("Pretraga: " + q);
        return r;
    }

    public List<Neprijatelj> uKolizijiSaIgracem() {
        ArrayList<Neprijatelj> r = new ArrayList<>();
        for (Neprijatelj n : neprijatelji)
            if (kolizija(igrac, n)) r.add(n);
        log.add("Ukupno kolizija: " + r.size());
        return r;
    }

    public void obradiKolizije() {
        for (Neprijatelj n : neprijatelji) {
            if (igrac.getZdravlje() <= 0) break;
            if (kolizija(igrac, n)) smanjiZdravlje(igrac, n);
        }
        log.add("Završena obrada kolizija. Zdravlje: " + igrac.getZdravlje());
    }

    public static List<Neprijatelj> ucitajCSV(String putanja) throws IOException {
        ArrayList<Neprijatelj> lista = new ArrayList<>();
        BufferedReader br = Files.newBufferedReader(Paths.get("enemies.csv"));
        String linija;
        while ((linija = br.readLine()) != null) {
            if (linija.trim().isEmpty()) continue;
            String[] p = linija.split(",");

            String tip = p[0].trim();
            String klas = p[1].trim().toLowerCase();
            int x = Integer.parseInt(p[2].trim());
            int y = Integer.parseInt(p[3].trim());
            String oblik = p[4].trim().toLowerCase();
            int a = Integer.parseInt(p[5].trim());
            int b = Integer.parseInt(p[6].trim());
            int steta = Integer.parseInt(p[7].trim());
            int zdr = p.length > 8 ? Integer.parseInt(p[8].trim()) : 100;

            Kolizibilno k;
            if (oblik.equals("rect")) k = new PravougaoniKolajder(x, y, a, b);
            else if (oblik.equals("circle")) k = new KruzniKolajder(x, y, a);
            else throw new IllegalArgumentException("Nepoznat oblik");

            Neprijatelj n;
            if (klas.equals("melee"))
                n = new MeleeEnemy(tip, steta, zdr, x, y, k);
            else if (klas.equals("boss"))
                n = new BossEnemy(tip, steta, zdr, x, y, k);
            else
                throw new IllegalArgumentException("Nepoznata klasa");

            lista.add(n);
        }
        return lista;
    }
}
