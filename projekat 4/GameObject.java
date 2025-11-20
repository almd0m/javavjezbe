public abstract class GameObject {

    private int x;
    private int y;
    private Collidable kolajder;

    public GameObject(int x, int y, Collidable kolajder) {
        if (kolajder == null) {
            throw new IllegalArgumentException("Kolajder ne smije biti null.");
        }
        this.x = x;
        this.y = y;
        this.kolajder = kolajder;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public boolean sudaraSe(GameObject drugi) {
        return this.kolajder.sudaraSe(drugi.kolajder);
    }

    public Collidable getKolajder() {
        return kolajder;
    }

    public abstract String prikaznoIme();

    @Override
    public String toString() {
        return "Objekat " + x + "," + y;
    }
}
