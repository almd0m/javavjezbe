import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int velicinaNiza = sc.nextInt();
		int[] bodovi = new int [velicinaNiza];
		for (int i = 0;i < bodovi.length; i++) {
			System.out.println("unesite" + (i + 1) + "elementi niza: ");
			bodovi[i] = sc.nextInt();
		}
		
		double prosjek = 0;
		for(int x:bodovi) {
		prosjek += x;	
		}		
		System.out.print("prosjek je" + prosjek/velicinaNiza);
		int min = 100;
		for(int x : bodovi) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println("minimum je :" + 100);
		sc.close();
	}

}
