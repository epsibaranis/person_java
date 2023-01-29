package Person;

public abstract class Payyroll extends Staff{
	protected float hra,cca,ma,da;
    protected float pf,ins;
    public Payyroll() {
    	super();
    }
    public Payyroll(String n1,int ag,String Ad,String mid,int a3,int a1,String a2,String a4) {
    	super(n1,ag,Ad,mid,a3,a1,a2,a4);
    }
    public abstract void calhra();
    public abstract void calcca();
    public abstract void calma();
    public abstract void calda();
    public abstract void calpf();
    public abstract void calins(int a);
    public  void print() {
       System.out.println("Staffs HRA allowance  :"+hra);
       System.out.println("Staffs CCA allowance  :"+cca);
       System.out.println("Staffs MA allowance   :"+ma);
       System.out.println("Staffs DA allowance   :"+da);
       System.out.println("Staffs PF Detection   :"+pf);
       System.out.println("Staffs Insurance      :"+ins);
    }
}
