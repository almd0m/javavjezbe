public class Neprijatelj extends GameObject implements Napadac {

    private String tip;
    private int steta;
    private int zdravlje;

    public Neprijatelj(String tip, int steta, int zdravlje, int x, int y, Kolizibilno kolajder) {
        super(x, y, kolajder);
        postaviTip(tip);
        postaviStetu(steta);
        postaviZdravlje(zdravlje);
    }

    public String getTip() { return tip; }

    public void postaviTip(String tip) {
        if (tip == null || tip.trim().isEmpty())
            throw new IllegalArgumentException("Nevalidan tip");
        this.tip = tip.trim();
    }

    public int getSteta() { return steta; }

    public void postaviStetu(int s) {
        if (s < 0 || s > 100)
            throw new IllegalArgumentException("Steta van opsega");
        this.steta = s;
    }

    public int getZdravlje() { return zdravlje; }

    public void postaviZdravlje(int z) {
        if (z < 0 || z > 100)
            throw new IllegalArgumentException("Zdravlje van opsega");
        this.zdravlje = z;
    }

    @Override
    public int efektivnaSteta() {
        return steta;
    }

    @Override
    public String getPrikaznoIme() {
        return tip;
    }

    @Override
    public String toString() {
        return "Neprijatelj[" + tip + ", steta=" + steta + ", zdravlje=" + zdravlje + "]";
    }
}
