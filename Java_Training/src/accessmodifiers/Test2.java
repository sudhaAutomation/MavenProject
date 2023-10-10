package accessmodifiers;

public class Test2 {
	
	public void sample() {
		Test1 o=new Test1();
		//System.out.println("private "+o.a);//The field Test1.a is not visible..we can use only with in the class
		System.out.println("default variable "+o.b);
		System.out.println("protected varible "+o.c);
		System.out.println("public variable "+o.d);
		
		
		o.display();
	}
	
	

}
