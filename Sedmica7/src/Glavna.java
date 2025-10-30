
public class Glavna {
	public static void main(String[] args) {
        Automobil a1 = new Automobil("Audi", 2008, 2200, "Siva", 5, "dizel");
        Kamion    k1 = new Kamion ("Scania",2010,3000,"Metalik zlatna",2.5,true);

      a1.prikaziInformacije();
      k1.prikaziInformacije();
    }
}

