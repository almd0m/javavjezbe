import java.util.Scanner;

public class DrugiZadatak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tekst = sc.nextLine().trim();
		String okrenutTekst = new StringBuilder(tekst).reverse().toString();
		System.out.print(tekst.equalsIgnoreCase(okrenutTekst));
	}
}
