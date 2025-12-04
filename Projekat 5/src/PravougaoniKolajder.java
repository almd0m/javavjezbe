public class PravougaoniKolajder implements Kolizibilno {

    private int x;
    private int y;
    private int sirina;
    private int visina;

    public PravougaoniKolajder(int x, int y, int sirina, int visina) {
        if (sirina <= 0 || visina <= 0) {
            throw new IllegalArgumentException("Dimenzije moraju biti pozitivne");
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

    public void postaviPoziciju(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean sijece(Kolizibilno drugo) {
        if (drugo instanceof PravougaoniKolajder) {
            PravougaoniKolajder r = (PravougaoniKolajder) drugo;
            return this.x < r.x + r.sirina &&
                   this.x + this.sirina > r.x &&
                   this.y < r.y + r.visina &&
                   this.y + this.visina > r.y;
        } else if (drugo instanceof KruzniKolajder) {
            KruzniKolajder c = (KruzniKolajder) drugo;
            return c.sijece(this);
        }
        throw new IllegalArgumentException("Nepoznat kolajder");
    }

    @Override
    public String toString() {
        return "Pravougaoni[" + x + "," + y + "," + sirina + "," + visina + "]";
    }
}
