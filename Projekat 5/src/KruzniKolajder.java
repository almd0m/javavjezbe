public class KruzniKolajder implements Kolizibilno {

    private int cx;
    private int cy;
    private int r;

    public KruzniKolajder(int cx, int cy, int r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Poluprečnik mora biti pozitivan");
        }
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public int getCx() { return cx; }
    public int getCy() { return cy; }
    public int getR() { return r; }

    public void postaviCentar(int x, int y) {
        this.cx = x;
        this.cy = y;
    }

    @Override
    public boolean sijece(Kolizibilno drugo) {
        if (drugo instanceof KruzniKolajder) {
            KruzniKolajder c = (KruzniKolajder) drugo;
            int dx = cx - c.cx;
            int dy = cy - c.cy;
            int d2 = dx * dx + dy * dy;
            int zbir = r + c.r;
            return d2 <= zbir * zbir;
        } else if (drugo instanceof PravougaoniKolajder) {
            PravougaoniKolajder r1 = (PravougaoniKolajder) drugo;
            int najbliziX = clamp(cx, r1.getX(), r1.getX() + r1.getSirina());
            int najbliziY = clamp(cy, r1.getY(), r1.getY() + r1.getVisina());
            int dx = cx - najbliziX;
            int dy = cy - najbliziY;
            int d2 = dx * dx + dy * dy;
            return d2 <= r * r;
        }
        throw new IllegalArgumentException("Nepoznat kolajder");
    }

    private int clamp(int v, int min, int max) {
        if (v < min) return min;
        if (v > max) return max;
        return v;
    }

    @Override
    public String toString() {
        return "Krug[" + cx + "," + cy + ", r=" + r + "]";
    }
}
