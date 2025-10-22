// Klasa koja modeluje kompleksni broj
public class KompleksniBroj {
	private float realniDio;
	private float imaginarniDio;

	public KompleksniBroj() {
		realniDio = 0;
		imaginarniDio = 0;
	}

	public KompleksniBroj(float realniDioP, float imaginarniDioP) {
		realniDio = realniDioP;
		imaginarniDio = imaginarniDioP;
	}

	public float dajRealni() {
		return realniDio;
	}

	public float dajImaginarni() {
		return imaginarniDio;
	}

	public void postaviRealniDio(float realniDioP) {
		realniDio = realniDioP;
	}

	public void postaviImaginarniDio(float imaginarniDioP) {
		imaginarniDio = imaginarniDioP;
	}

	public String dajBroj() {
		return realniDio + " + j(" + imaginarniDio + ")";
	}

// Modul kompleksnog broja
	public float modulBroja() {
		return (float) Math.sqrt(realniDio * realniDio + imaginarniDio * imaginarniDio);
	}

// Sabiranje kompleksnih brojeva
	public KompleksniBroj saberi(KompleksniBroj a) {
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.postaviRealniDio(realniDio + a.realniDio);
		rezultat.postaviImaginarniDio(imaginarniDio + a.imaginarniDio);
		return rezultat;
	}

// Oduzimanje kompleksnih brojeva
	public KompleksniBroj oduzmi(KompleksniBroj a) {
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.postaviRealniDio(realniDio - a.realniDio);
		rezultat.postaviImaginarniDio(imaginarniDio - a.imaginarniDio);
		return rezultat;
	}

// Mnozenje kompleksnih brojeva
	public KompleksniBroj pomnozi(KompleksniBroj a) {
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.postaviRealniDio(realniDio * a.realniDio - imaginarniDio * a.imaginarniDio);
		rezultat.postaviImaginarniDio(imaginarniDio * a.realniDio + realniDio * a.imaginarniDio);
		return rezultat;
	}

	public KompleksniBroj podijeli(KompleksniBroj a) {
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.postaviRealniDio(dajRealni() * a.dajRealni() + dajImaginarni() * a.dajImaginarni() * (a.modulBroja()));
		rezultat.postaviImaginarniDio(
				dajImaginarni() * a.dajRealni() - dajRealni() * a.dajImaginarni() * (a.modulBroja()));
		return rezultat;
	}
	public void odstampaj() {
		if(this.dajImaginarni()<0)
			System.out.printf("%.2f - i%.2f", dajRealni(),-dajImaginarni());
		else
			System.out.printf("%.2f + i%.2f", dajRealni(),dajImaginarni());
	}
	public static KompleksniBroj OdrediMaxMin(KompleksniBroj x[],boolean minIliMax) {
		KompleksniBroj minMax = x[0];
		for(int i = 0; i< x.length;i++)
			if (minIliMax) {
				if(minMax.modulBroja()> x[i].modulBroja())
					minMax = x[i];
			}else
				if(minMax.modulBroja()> x[i].modulBroja())
					minMax = x[i];
		return minMax;
	}
}
