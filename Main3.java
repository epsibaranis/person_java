package Person;

public class Main3 {

	public static void main(String[] args) {
		Staff a1,a2;
		a1=new Staff();
		a1.print();
		a1.setID(002);
		a1.setDepartment("development");
		a1.setDesignation("developer");
        a1.setSalary(65000);
        System.out.println("Get Id from the staff         :"+a1.getID());
        System.out.println("Get Department from the staff :"+a1.getDepartment());
        System.out.println("Get Designation from the staff:"+a1.getDesignation());
        System.out.println("Get Salary from the staff     :"+a1.getSalary());
        
        
        a2=new Staff("sumi",21,"Thiruvanamalai","sumi@gmail.com",003,70000,"development","developer");
        a2.print();
		a2.setID(004);
		a2.setDepartment("development");
		a2.setDesignation("developer");
        a2.setSalary(80000);
        System.out.println("Get Id from the staff         :"+a2.getID());
        System.out.println("Get Department from the staff :"+a2.getDepartment());
        System.out.println("Get Designation from the staff:"+a2.getDesignation());
        System.out.println("Get Salary from the staff     :"+a2.getSalary());
       
	}

}
