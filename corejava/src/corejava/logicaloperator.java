package corejava;

public class logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p, q;
		System.out.println("P\tQ\tPANDQ\tPORQ\tPXORQ\tNOTP"); 
	p = true; 
		q = true;	
		System.out.print(p + "\t" + q +"\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = true; 
		q = false;
		System.out.print(p + "\t" + q +"\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)); 
		p = false; 
		q = true;
		System.out.print(p + "\t" + q +"\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = false;
		q = false;
		System.out.print(p + "\t" + q +"\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	
	}

}
