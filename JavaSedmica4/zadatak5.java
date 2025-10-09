import java.util.*;
public class zadatak5 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	 Random rand = new Random();

	System.out.println("Unesite duzinu niza:");
	int velicinaNiza = sc.nextInt();
	int[] brojevi = new int [velicinaNiza];
	
	for (int i = 0;i < brojevi.length; i++) {
		brojevi[i] = rand.nextInt(10) + 1;
	}
	System.out.println("\nOrignalni niz" );
	for (int x : brojevi) {
		System.out.print(x + ", ");
	}
	int j = 0;
	double [] noviniz = new double[velicinaNiza];
	for (int i = 0; i < velicinaNiza; i++) {
		if ( brojevi[i] % 2 == 0) {
		noviniz[j]=brojevi[i]  *(-1);
		j++;
		}else {
			noviniz[j]= 1.0 / brojevi[i] ;
					j++;
		}
	}
	System.out.println("\n\nNovi niz:");
	for (double x : noviniz) {
			System.out.print(x + ", ");
	}

}
}
