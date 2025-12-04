public class BossEnemy extends Neprijatelj {

 
    @Override
    public int efektivnaSteta() {
        return getSteta() * 2;
    }

    @Override
    public String toString() {
        return "BOS[" + getTip() + ", steta=" + getSteta() + "]";
    }

	public BossEnemy(String tip, int steta, int zdravlje, int x, int y, Kolizibilno kolajder) {
		super(tip, steta, zdravlje, x, y, kolajder);
		// TODO Auto-generated constructor stub
	}
}
