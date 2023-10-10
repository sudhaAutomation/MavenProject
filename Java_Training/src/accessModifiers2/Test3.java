package accessModifiers2;

import accessmodifiers.Test1;

public class Test3 extends Test1{//is a relationship
	 
	public void sam() {
		///System.out.println("private variable "+a);//The field Test1.a is not visible..with in the class
		//System.out.println("default variable "+b);//The field Test1.b is not visible..we can use with in the package
		System.out.println("protected variable "+c);
		System.out.println("public variable "+d);
		display();
	}

}
