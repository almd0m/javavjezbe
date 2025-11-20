public abstract class ApstraktniLik extends GameObject {

    protected int zdravlje; 
    public ApstraktniLik(int x, int y, Collidable kolajder, int zdravlje) {
        super(x, y, kolajder);
        if (zdravlje < 0 || zdravlje > 100) {
            throw new IllegalArgumentException("Zdravlje mora biti 0-100.");
        }
        this.zdravlje = zdravlje;
    }

    public int getZdravlje() {
        return zdravlje;
    }

    public void setZdravlje(int z) {
        if (z < 0 || z > 100) {
            throw new IllegalArgumentException("Neispravna vrijednost zdravlja.");
        }
        this.zdravlje = z;
    }
}

