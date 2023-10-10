
public class ParentCons {
	int pj=60;
	String ps="sudha";

	public ParentCons() {
		this(9);
		System.out.println(pj);
		System.out.println(ps);
		System.out.println("default parent class constructor");
	}

	public ParentCons(int j) {
		this(100, 100);
		System.out.println("1 param parent class constructor " + j);
		System.out.println("");
	}

	public ParentCons(int a, int b) {
		System.out.println("2 param parent class constructor and sum of a and b is  " + (a + b));
	}
	public void sam() {
		System.out.println("parent dum");
	}
}
