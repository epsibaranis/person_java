package Person;
class Manger extends Staff implements Allowance,Detection {
	protected float hra,cca,ma,da,pf,ins;
	public Manger(){
		super();
	}
	public Manger(String n1,int ag,String Ad,String mid,int a3,int a1,String a2,String a4) {
    	super(n1,ag,Ad,mid,a3,a1,a2,a4);}
	public void calhra() {
		hra=salary*((float)50/100);
	}
	public void calcca() {
		cca=(salary*12)*((float)20/100);
	}
	public void calma() {
		ma=salary*((float)30/100);
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
	public  void print() {
		   super.print();
	       System.out.println("Manager HRA allowance  :"+hra);
	       System.out.println("Manager CCA allowance  :"+cca);
	       System.out.println("Manager MA allowance   :"+ma);
	       System.out.println("Manager DA allowance   :"+da);
	       System.out.println("Manager PF Detection   :"+pf);
	       System.out.println("Manager Insurance      :"+ins);
	       System.out.println("\n");
	    }
}