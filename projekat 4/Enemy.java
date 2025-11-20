
public abstract class Enemy extends ApstraktniLik implements Napadac {
	protected String tip;
    protected int steta;

    public Enemy(String tip, int x, int y, Collidable kolajder, int steta, int zdravlje) {
        super(x, y, kolajder, zdravlje);
        setTip(tip);
        setSteta(steta);
    }

    public void setTip(String tip) {
        if (tip == null || tip.trim().isEmpty()) {
            throw new IllegalArgumentException("Tip neprijatelja je nevalidan.");
        }
        this.tip = tip.trim();
    }

    public void setSteta(int st) {
        if (st < 0 || st > 100) throw new IllegalArgumentException("Steta mora biti 0-100.");
        this.steta = st;
    }
    @Override
    public int efektivnaSteta() {
        return steta;
    }

    @Override
    public String prikaznoIme() {
        return tip;
    }

    @Override
    public String toString() {
        return "Neprijatelj[" + tip + "] " + getX() + "," + getY() + " DMG=" + steta + " HP=" + zdravlje;
    }
}
