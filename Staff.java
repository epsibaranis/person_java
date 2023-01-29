package Person;

class  Staff extends Person{
    protected int  ID,salary;
    protected String department,designation;
    public Staff(){
    	super();
    	ID=001;
    	department="development";
    	designation="developer";
    	salary=75000;
    }
    public Staff(String n1,int ag,String Ad,String mid,int a3,int a1,String a2,String a4) {
    	super(n1,ag,Ad,mid);
    	ID=a3;
    	department=a2;
    	designation=a4;
    	salary=a1;
    }
    public void setID(int a) {
    	ID=a;
    }
    public void setDepartment(String a) {
    	department=a;
    }
    public void setDesignation(String a) {
    	designation=a;
    }
    public void setSalary(int a1) {
    	salary=a1;
    }
    public int getID() {
    	return ID;
    }
    public String getDepartment() {
    	return department;
    }
    public String getDesignation() {
    	return designation;
    }
    public int getSalary() {
    	return salary;
    }
    public void print() {
    	super.print();
    	System.out.println("Staff ID:           "+ID);
    	System.out.println("Staff department:   "+department);
    	System.out.println("Staff designation:  "+designation);
    	System.out.println("Staff salary:       "+salary);
    }
}
