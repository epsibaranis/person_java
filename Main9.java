package Person;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
public class Main9 {

	public static void main(String[] args) {
		ObjectInputStream ois;
		FileInputStream fis;
		try {
	    fis=new FileInputStream("Biodata1.txt");
		ois=new ObjectInputStream(fis);
		Person a1=(Person)ois.readObject();
		a1.print();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
