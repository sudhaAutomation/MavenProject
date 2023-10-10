package basics;

public class Operators {

	public static void main(String[] args) {
		/*
		 * 2 types of operators 
		 * i. arthematic operators::+,-,/,%,*,++,--
		 *  ii.Relational
		 * operators::>,<,>=,<=,==,!=
		 * 
		 */
		int i = 100;//expression
		int j = 200;
		System.out.println(i);//100
		System.out.println(i+j);//300
		System.out.println(200%100);//0
		System.out.println(200/100);//2..quotient
		//++ means incrementing the value by 1 time
		//-- means decrementing the value by 1 time
		i++;
		System.out.println(i);
		j--;
		System.out.println(j);
		System.out.println(i>j);//false
		System.out.println(i<j);//true
		System.out.println(i<=j);//true
		System.out.println(i>=j || i!=j);//true
		System.out.println(i>=j & i!=j);//false
		System.out.println(i==j);//false
		System.out.println(i!=j);//true
		
		
		
		
		
		

	}

}
