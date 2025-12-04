public class Igrac extends GameObject {

    private String ime;
    private int zdravlje;

    public Igrac(String ime, int zdravlje, int x, int y, Kolizibilno kolajder) {
        super(x, y, kolajder);
        postaviIme(ime);
        postaviZdravlje(zdravlje);
    }

    public String getIme() { return ime; }

    public void postaviIme(String ime) {
        if (ime == null || ime.trim().isEmpty())
            throw new IllegalArgumentException("Nevalidno ime");
        ime = ime.trim();
        ime = Character.toUpperCase(ime.charAt(0)) + ime.substring(1);
        this.ime = ime;
    }

    public int getZdravlje() { return zdravlje; }

    public void postaviZdravlje(int zdravlje) {
        if (zdravlje < 0 || zdravlje > 100)
            throw new IllegalArgumentException("Zdravlje van opsega");
        this.zdravlje = zdravlje;
    }

    @Override
    public String getPrikaznoIme() {
        return ime;
    }

    @Override
    public String toString() {
        return "Igrac[ime=" + ime + ", zdravlje=" + zdravlje + "]";
    }
}
