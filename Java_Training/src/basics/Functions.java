package basics;

public class Functions {// functions are nothing but the methods , we can implemnet the function in 4
						// ways

	// 1.with out argumnets and with out return type
	// method is a block of code, where we can implement the logic
	public void sample() {// returns nothing

		System.out.println("1.with out argumnets and with out return type");
		System.out.println("Hello");
	}

	// 2.with argumnets and with out return type
	public void sum(int a, int b) {// returns nothing
		System.out.println("2.with  argumnets and with out return type");
		System.out.println("sum of a nad b is " + (a + b));
		System.out.println("sum of a nad b is " + a + b);

	}
	// 3.with out argumnets and with return type

	public int sub() {
		int a = 20;
		int b = 30;
		int c = b - a;// 10
		System.out.println("3.with out  argumnets and with  return type");

		System.out.println("substraction of a and b of c is " + c);
		return c;

	}

	// 3.ii
	public String append() {
		String firstname = " Swhizz";
		String lastname = " Technologies";

		String fullname = firstname + lastname;
		System.out.println("full name of institution" + fullname);
		return fullname;
	}
	// 4.with arguments with return type

	public int multi(int i, int j) {
		int k = i * j;
		System.out.println("4.with arguments with return type");
		System.out.println("multip,ication of i and j of k is " + k);

		return k;

	}

}
