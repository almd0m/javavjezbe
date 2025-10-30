import java.util.Scanner;
public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tekst = sc.nextLine();
		String[] rijeci = tekst.split(" ");
		System.out.print("Broj rijeci je:"+ rijeci.length);
	}

}