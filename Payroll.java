                            package Person;

class Payroll extends Staff {
    protected float hra,cca,ma;
    protected float pf,ins;
    public Payroll() {  
    	super();
    }
   public void calhra() {
	   hra=salary*((float)50/100);
   }
   public void calcca() {
	   cca=(salary*12)*((float)20/100);
   }
   public void calma() {
	   ma=salary*((float)30/100);
   }
   public void calpf() {
	   pf=salary*((float)12/100);
   }
   public void insurance(int a) {
	   ins=(salary*12)*a;   
	   }
   public void print() {
	   System.out.println("HRA allowance        "+ hra);
	   System.out.println("CCA allowance        "+ cca);
	   System.out.println("MA allowance           "+ma);
	   System.out.println("PF Detection          "+pf);
	   System.out.println("Insurance Detection  "+ins);
	   System.out.println(5/(double)6);
   }
}
