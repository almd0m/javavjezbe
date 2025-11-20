public class Player extends ApstraktniLik {

    private String ime;

    public Player(String ime, int x, int y, int sirina, int visina, int zdravlje) {
        super(x, y, new PravougaoniKolajder(x, y, sirina, visina), zdravlje);
        setIme(ime);
    }

    public void setIme(String ime) {
        if (ime == null) ime = "";
        ime = ime.trim().replaceAll("\\s+", " ");
        if (ime.isEmpty()) {
            throw new IllegalArgumentException("Ime igraca ne smije biti prazno.");
        }
        this.ime = ime;
    }

    @Override
    public String prikaznoIme() {
        return ime;
    }

    @Override
    public String toString() {
        return "Igrač[" + ime + "] " + getX() + "," + getY() + " HP=" + zdravlje;
    }
}
