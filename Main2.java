package Person;

public class Main2 {

	public static void main(String[] args) {
		Person1 a1,a2;
		a1=new Person1();
		a1.print();
		a1.setName("julit");
		a1.setAge(26);
		a1.setAddress("Kanniyakumari");
		a1.setEmailId("juli21@gmail.com");
		a1.print();
		System.out.println("Getting the name of the person    :"+a1.getName());
		System.out.println("Getting the age of the Person     :"+a1.getAge());
		System.out.println("Getting the Address of the person :"+a1.getAddress());
		System.out.println("Getting the Emailid of the person :"+a1.getEmailId());
		a2=new Person1("archana",19,"kosavapatti","archanan2gmail.com");
		a2.print();
		a2.setName("sumi");
		a2.setAge(25);
		a2.setAddress("Thiruvannamalai");
		a2.setEmailId("sumi@gmail.com");
		a2.print();
		System.out.println("Getting the name of the person    :"+a2.getName());
		System.out.println("Getting the age of the Person     :"+a2.getAge());
		System.out.println("Getting the Address of the person :"+a2.getAddress());
		System.out.println("Getting the Emailid of the person :"+a2.getEmailId());
	}

}
