
public class BossEnemy extends Enemy {
	public BossEnemy(String tip, int x, int y, Collidable kolajder, int steta, int zdravlje) {
        super(tip, x, y, kolajder, steta, zdravlje);
    }

    @Override
    public int efektivnaSteta() {
        return steta * 2;
    }

    @Override
    public String toString() {
        return "BOSS[" + tip + "] " + getX() + "," + getY() +
                " DMG=" + steta + "x2 HP=" + zdravlje;
    }
}
