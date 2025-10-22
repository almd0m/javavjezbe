import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class studentTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Student.setProlazNaIspitu(50);
		Student s1 = new Student("marko", "markovic", "25/001", "Oktoih 1, podgorica", 65);
	

	
	ArrayList<Student>  x = new ArrayList<Student>();
	/*x.add(new Student("marko", "markovic", "25/001", "Oktoih 1, podgorica", 65));
	x.add(new Student("marko", "marinkovic", "25/001", "Oktoih 1, podgorica", 92));
	x.add(new Student("marko", "markovic", "25/001", "Njegoseva 1, podgorica", 11));
	x.add(new Student("marko", "markovic", "25/001", "Oktoih 1, podgorica", 34));
	x.add(new Student("marko", "markovic", "25/001", "Janka  1, podgorica", 48));*/
String ime,prezime,brojIndeksa,adresa;
float brojBodova;
	Scanner u = new Scanner(new File("C:\\Users\\mb-com.me\\Desktop\\studenti.txt"));
	while(u.hasNext()) {
		ime= u.nextLine();
		prezime = u.nextLine();
		brojIndeksa = u.nextLine();
		adresa = u.nextLine();
		brojBodova = Float.parseFloat(u.next());
		x.add(new Student(ime,prezime,brojIndeksa,adresa,brojBodova));
	}
	u.close();
	
	ArrayList<Student> izdvojeno = Student.izdvojUlica(x, "Oktoih");
	System.out.println("Studenti iz ulice oktoih");
	for(Student s : izdvojeno)
		System.out.println(s1.toString());
	
	/*ArrayList<Student> izdvojenoNisuPolozili = Student.izdvojProlazNaIspitu(x, true);
	BufferedWritter upis = new BufferedWriter(new fileWriter("\"C:\\Users\\mb-com.me\\Desktop\\studenti.txt\""));*/

	ArrayList<Student> izdvojenoNisuPolozili = Student.izdvojProlazNaIspitu(x, true);
	System.out.println("nisu polozili ");
	for(Student s : izdvojenoNisuPolozili)
		System.out.println(s1.toString());

}
}
