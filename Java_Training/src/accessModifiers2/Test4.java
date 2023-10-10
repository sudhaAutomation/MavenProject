package accessModifiers2;

import accessmodifiers.Test1;

public class Test4 {
	public void simple() {
		Test1 o=new Test1();
		//System.out.println("private "+o.a);//The field Test1.a is not visible..we can use only with in the class
		//System.out.println("default variable "+o.b);//with in the package
		//System.out.println("protected varible "+o.c);//with in the package and also in the child class
		System.out.println("public variable "+o.d);//any where in the project
		o.display();
	}
	

}
