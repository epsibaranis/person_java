package Person;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
public class Main8 {

	public static void main(String[] args) {
		ObjectOutputStream oos;
		FileOutputStream fos;
		Person a1;
		try {
			a1=new Person("Epsi",25,"kosavapatti","epsi@gmail.com");
			fos=new FileOutputStream("Biodata1.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(a1);
			oos.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
