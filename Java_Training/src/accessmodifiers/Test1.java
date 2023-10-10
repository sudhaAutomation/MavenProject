package accessmodifiers;

public class Test1 {
	private int a;
	int b;//default
	protected int c;
	public int d;
	
	
	

public void display() {
		System.out.println("private "+a);
		System.out.println("default "+b);
		System.out.println("protected "+c);
		System.out.println("public "+d);
		
	}

}
