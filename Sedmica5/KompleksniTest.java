import java.util.Scanner;

public class KompleksniTest {

	public static void main(String[] args) {
		int N, i;
		Scanner u = new Scanner(System.in);
		KompleksniBroj z1 = new KompleksniBroj(2, 3);
		KompleksniBroj z2 = new KompleksniBroj(-2, 5);
		KompleksniBroj z3;
		z3 = z1.podijeli(z2);
		// z3.odstampaj();

		System.out.print("unesi broj elemenata niza: ");
		N = u.nextInt();

		KompleksniBroj x[] = new KompleksniBroj[N];

		for (i = 0; i < N; i++) {
			System.out.printf("unesi %d. element niza: ", i + 1);
			float re = u.nextFloat();
			float im = u.nextFloat();
			x[i] = new KompleksniBroj(re, im);

		}
		/*
		for (KompleksniBroj a : x) {
			if (max.modulBroja() < a.modulBroja())
				max = a;*/
		/*for (i = 0; i < N; i++) {
			if (max.modulBroja() < x[i].modulBroja())
			max = x[i];}*/
			
		
		System.out.printf("Max niz apoo modulu je: ");
		KompleksniBroj.OdrediMaxMin(x, false).odstampaj();
		
		
		u.close();
	}
}
