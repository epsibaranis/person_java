package Person;

class Student extends Person {
    protected int rollno;
    protected String classes,department;
    public Student() {
    	super();
    	rollno=1;
    	classes="A";
    	department="Biology";
    }
    public Student(String n1,int ag,String Ad,String mid,int r1,String c1,String d1) {
    	super(n1,ag,Ad,mid);
    	rollno=r1;
    	classes=c1;
    	department=d1;
    }
   public void setRollno(int a) {
	   rollno=a;
   }
   public void setClass(String a) {
	   classes=a;
   }
   public void setDepartment(String a) {
	   department=a;
   }
   public int getRollno() {
	   return rollno;
   }
   public String getclass() {
	   return classes;
   }
public String getdepartment() {
	return department;
}
public void print() {
	System.out.println("Roll no of the student      :"+rollno);
	System.out.println("class of the student        :"+classes);
	System.out.println("department of the student   :"+department);
}
}
