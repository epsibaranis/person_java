package Person;

public class Person1 {	
		private String name,address,emailId;
		private int age;
		public Person1() {
			name="epsi";
			address="kosavapatti";
			emailId="epsi13@gmail.com";
			age=25;
		}
		public Person1(String n1,int a1,String a2,String e1) {
			name=n1;
			address=a2;
			emailId=e1;
			age=a1;
		}
		public void setName(String a1) {
			name=a1;
		}
		public void setAge(int a1) {
			age=a1;
		}
		public void setEmailId(String a1) {
			emailId=a1;
		}
		public void setAddress(String a1) {
			address=a1;
		}
		public int getAge() {
			return age;
		}
		public String getAddress() {
			return address;
		}
		public String getEmailId() {
			return emailId;
		}
		public String getName() {
			return name;
		}
		public void print() {
			System.out.println("Person name    :"+name);
			System.out.println("Person age     :"+age);
			System.out.println("Person Address :"+address);
			System.out.println("Person emailId :"+emailId);
		}
}
