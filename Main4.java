package Person;

public class Main4 {

	public static void main(String[] args) {
		Student a1,a2;
		a1=new Student();
		a1.print();
		a1.setRollno(002);
		a1.setDepartment("Computer Science");
        a1.setClass("B");
        System.out.println("Roll number of the student           :"+a1.getRollno());
        System.out.println("Class of the student                 :"+a1.getclass());
        System.out.println("department number of the student     :"+a1.getdepartment());
        a2=new Student("sumi",21,"Thiruvanamalai","sumi@gmail.com",003,"C","Science");
		a2.print();
		a2.setRollno(002);
		a2.setDepartment("Computer Science");
        a2.setClass("B");
        System.out.println("Roll number of the student          :"+a2.getRollno());
        System.out.println("Class of the studen                 :"+a2.getclass());
        System.out.println("department number of the student    :"+a2.getdepartment());
	}

}
