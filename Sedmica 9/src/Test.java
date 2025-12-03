import java.util.ArrayList;
public class Test {
public static void main(String[] args) {
	ArrayList<Zaposleni> x = new ArrayList<Zaposleni>();
	x.add(new SluzbenikSaltera("Pera peric","id12345",600,100,20));
	x.add(new SluzbenikSaltera("John Doe","id852",800,120,10));
	x.add(new TehnickaPodrska("John Doel ","id0002",1200,10,(float)2.1));
	x.add(new Menadzer("Marko Markovic ","id003",1200,4));
	
}
}
