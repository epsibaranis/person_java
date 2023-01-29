package Person;

class Superviouser extends Payyroll {
	public Superviouser(){
	       super();
		}
		public Superviouser(String n1,int ag,String Ad,String mid,int a3,int a1,String a2,String a4) {
	    	super(n1,ag,Ad,mid,a3,a1,a2,a4);
	    }
		public void calhra() {
			hra=salary*((float)2/100);
		}
		public void calcca() {
			cca=(salary*12)*((float)1/100);
		}
		public void calma() {
			ma=salary*((float)7/100);
		}
		public void calda() {
			da=salary*((float)6/100);
		}
		public void calpf() {
			pf=salary*((float)5/100);
		}
		public void calins(int a) {
			ins=(salary*12)*a;
		}
		public  void print() {
		       System.out.println("Superviouser HRA allowance  :"+hra);
		       System.out.println("Superviouser CCA allowance  :"+cca);
		       System.out.println("Superviouser MA allowance   :"+ma);
		       System.out.println("Superviouser DA allowance   :"+da);
		       System.out.println("Superviouser PF Detection   :"+pf);
		       System.out.println("Superviouser Insurance      :"+ins);
		       System.out.println("\n");
		    }
}
