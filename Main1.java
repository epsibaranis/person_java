package Person;

public class Main1 {

	public static void main(String[] args) {
		Person a1;
		a1=new Person();
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
		a1.setName("emi");
		a1.setAge(22);
		a1.setAddress("coimbatore");
		a1.setEmailId("emi@gmail.com");
		a1.print();
		System.out.println("Getting the name of the person    :"+a1.getName());
		System.out.println("Getting the age of the Person     :"+a1.getAge());
		System.out.println("Getting the Address of the person :"+a1.getAddress());
		System.out.println("Getting the Emailid of the person :"+a1.getEmailId());
		//System.out.print(a1);
	}

}
