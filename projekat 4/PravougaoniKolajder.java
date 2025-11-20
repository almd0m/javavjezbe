public class PravougaoniKolajder implements Collidable {

    private int x;
    private int y;
    private int sirina;
    private int visina;

    public PravougaoniKolajder(int x, int y, int sirina, int visina) {
        if (sirina <= 0 || visina <= 0) {
            throw new IllegalArgumentException("Sirina i visina moraju biti preko nule.");
        }
        this.x = x;
        this.y = y;
        this.sirina = sirina;
        this.visina = visina;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getSirina() { return sirina; }
    public int getVisina() { return visina; }

    @Override
    public boolean sudaraSe(Collidable drugi) {

        if (drugi instanceof PravougaoniKolajder) {
            PravougaoniKolajder p = (PravougaoniKolajder) drugi;

            boolean nemaPreklapanja =
                    this.x + this.sirina <= p.x ||
                    p.x + p.sirina <= this.x ||
                    this.y + this.visina <= p.y ||
                    p.y + p.visina <= this.y;

            return !nemaPreklapanja;
        }

        if (drugi instanceof KruzniKolajder) {
            return drugi.sudaraSe(this); // 
        }

        return false;
    }

    @Override
    public String toString() {
        return "Pravougaonik[" + sirina + "x" + visina + "]";
    }
}

