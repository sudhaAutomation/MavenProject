package oops;

public class MethodOverLoading1 {// is feature,with in the class , if we write the same method with different no
									// of
									// arugumnets, different data types of the argumnets and different order of data
									// types,
	// 1.static polymorphism and this is also called as compile time
	// polymorphism::while we are compiling the code itself the compiler will
	// instruct us, that method is duplicate
	// 2.Dynamic polymorphism
	public void sum() {// compile time polymorphism
		System.out.println("sum method with no arguments");
	}

	public void sum(int a) {
		System.out.println("sum method with 1 argument" + a);
	}

	public void sum(int a, int b) {
		System.out.println("sum method with 2 arguments" + (a + b));

	}

	public void sum(int a, String s) {
		System.out.println("sum method with 2 arguments" + (a + s));

	}

	public void sum(int a, int c, String s) {
		System.out.println("sum method with 2 arguments" + (a + c) + " " + s);

	}

	public static void main(String[] args) {
		MethodOverLoading1 m = new MethodOverLoading1();
		m.sum();
		m.sum(100);
		m.sum(1, 2);
		m.sum(2, 3);
		m.sum(1, "Software Testing");
		m.sum(2, "Devops");
		m.sum(3, "Python");
		m.sum(1, 5, "Swhizz");
		main();
	}

	public static void main() {

	}

	public static void main(int a) {

	}

}
