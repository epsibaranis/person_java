package Person;

class Ordstaff extends Payyroll{
	public Ordstaff(){
	       super();
		}
		public Ordstaff(String n1,int ag,String Ad,String mid,int a3,int a1,String a2,String a4) {
	    	super(n1,ag,Ad,mid,a3,a1,a2,a4);
	    }
		public void calhra() {
			hra=salary*((float)20/100);
		}
		public void calcca() {
			cca=(salary*12)*((float)5/100);
		}
		public void calma() {
			ma=salary*((float)15/100);
		}
		public void calda() {
			da=salary*((float)12/100);
		}
		public void calpf() {
			pf=salary*((float)12/100);
		}
		public void calins(int a) {
			ins=(salary*12)*a;
		}
		public  void print(){
		       System.out.println("OrdStaffs HRA allowance  :"+hra);
		       System.out.println("OrdStaffs CCA allowance  :"+cca);
		       System.out.println("OrdStaffs MA allowance   :"+ma);
		       System.out.println("OrdStaffs DA allowance   :"+da);
		       System.out.println("OrdStaffs PF Detection   :"+pf);
		       System.out.println("OrdStaffs Insurance      :"+ins);
		       System.out.println("\n");
		    }
}
