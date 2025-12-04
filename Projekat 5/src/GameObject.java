public abstract class GameObject {

    private int x;
    private int y;
    private Kolizibilno kolajder;

    public GameObject(int x, int y, Kolizibilno kolajder) {
        this.x = x;
        this.y = y;
        if (kolajder == null) throw new IllegalArgumentException("Kolajder null");
        this.kolajder = kolajder;
        azurirajPozicijuKolajdera();
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        this.x = x;
        azurirajPozicijuKolajdera();
    }

    public void setY(int y) {
        this.y = y;
        azurirajPozicijuKolajdera();
    }

    public Kolizibilno getKolajder() { return kolajder; }

    public void setKolajder(Kolizibilno k) {
        if (k == null) throw new IllegalArgumentException("Kolajder null");
        this.kolajder = k;
        azurirajPozicijuKolajdera();
    }

    public boolean sijece(GameObject drugi) {
        return this.kolajder.sijece(drugi.kolajder);
    }

    private void azurirajPozicijuKolajdera() {
        if (kolajder instanceof PravougaoniKolajder) {
            ((PravougaoniKolajder) kolajder).postaviPoziciju(x, y);
        } else if (kolajder instanceof KruzniKolajder) {
            ((KruzniKolajder) kolajder).postaviCentar(x, y);
        }
    }

    public abstract String getPrikaznoIme();

    @Override
    public String toString() {
        return getPrikaznoIme() + " (" + x + ", " + y + ")";
    }
}
