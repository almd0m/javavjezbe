import java.util.ArrayList;

public class Student {
	public String ime;
	public String prezime;
	public String brojIndexa;
	public String adresa;
	public float brojBodova;
	public boolean polozioIliNe;
	public static int prolazNaIspitu;

	// Konstruktori
	public Student(String ime, String prezime, String brojIndexa, String adresa, float brojBodova) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndexa = brojIndexa;
		this.adresa = adresa;
		this.brojBodova = brojBodova;
		this.azurirajProlaz();
	}

	public Student() {
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public float getBrojBodova() {
		return brojBodova;
	}

	public void setBrojBodova(float brojBodova) {
		this.brojBodova = brojBodova;
		this.azurirajProlaz();
	}

	public boolean isPolozioIliNe() {
		return polozioIliNe;
	}

	public void setPolozioIliNe(boolean polozioIliNe) {
		this.polozioIliNe = polozioIliNe;
	}

	public static int getProlazNaIspitu() {
		return prolazNaIspitu;
	}

	public static void setProlazNaIspitu(int prolazNaIspitu) {
		Student.prolazNaIspitu = prolazNaIspitu;
	}

	@Override
	public String toString() {
		if (this.polozioIliNe)
			return "Student [ime=" + ime + ", prezime=" + prezime + ", brojIndexa=" + brojIndexa + ", adresa=" + adresa
					+ ", brojBodova=" + brojBodova + ",polozio]";
		else
			return "Student [ime=" + ime + ", prezime=" + prezime + ", brojIndexa=" + brojIndexa + ", adresa=" + adresa
					+ ", brojBodova=" + brojBodova + ",nije polozio]";
	}

	public void azurirajProlaz() {
		polozioIliNe = this.brojBodova >= Student.prolazNaIspitu;
	}

	public static ArrayList<Student> izdvojUlica(ArrayList<Student> niz, String ulica) {
		ArrayList<Student> izdvojeno = new ArrayList<Student>();

		for (Student s : niz)
			if (s.getAdresa().toLowerCase().startsWith(ulica.toLowerCase()))
				izdvojeno.add(s);
		return izdvojeno;
	}

	public static ArrayList<Student> izdvojProlazNaIspitu(ArrayList<Student> niz, boolean poloziliIliNe) {
		ArrayList<Student> izdvojeno = new ArrayList<Student>();
		for (Student s : niz)
			if (poloziliIliNe == s.isPolozioIliNe())
				izdvojeno.add(s);
		return izdvojeno;

	}
}