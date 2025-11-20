public class KruzniKolajder implements Collidable {

    private int cx;
    private int cy;
    private int r;

    public KruzniKolajder(int cx, int cy, int r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Poluprecnik mora biti veci od nule.");
        }
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    @Override
    public boolean sudaraSe(Collidable drugi) {

        if (drugi instanceof KruzniKolajder) {
            KruzniKolajder k = (KruzniKolajder) drugi;

            int dx = this.cx - k.cx;
            int dy = this.cy - k.cy;
            int zbir = this.r + k.r;

            return dx * dx + dy * dy <= zbir * zbir;
        }

        if (drugi instanceof PravougaoniKolajder) {
            PravougaoniKolajder p = (PravougaoniKolajder) drugi;

            int najbliziX = clamp(cx, p.getX(), p.getX() + p.getSirina());
            int najbliziY = clamp(cy, p.getY(), p.getY() + p.getVisina());

            int dx = cx - najbliziX;
            int dy = cy - najbliziY;

            return dx * dx + dy * dy <= r * r;
        }

        return false;
    }

    private int clamp(int val, int min, int max) {
        if (val < min) return min;
        if (val > max) return max;
        return val;
    }

    @Override
    public String toString() {
        return "Krug(r=" + r + ")";
    }
}

