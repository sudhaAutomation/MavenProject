
public class Constructor1 extends ParentCons {
	// Constructor will instantiate the global/instance variables
	String str;
	int j;
	double d;
	boolean f;

	public void sam() {
		System.out.println("child dum");
	}

	public Constructor1() {// Constructor call must be the first statement in a constructor

		this(100000);// will express abput the current class objects(varibales, methods,
						// constructors)
		// no params
		// a special method in a class,bcz it is having the same name as the class name
		System.out.println("we can implement the functionality");
		System.out.println("child default constructor");
	}
	// can we over load the constructor?
	// yes

	public Constructor1(int i) {// 2. parameterized constructor
		this("Software", "Testing");
		System.out.println("child constructor with 1 int param " + i);

	}

	public Constructor1(String f, String l) {// 2. parameterized constructor
		// super();// parent class constructors
		super(1, 2);
		System.out.println("child constructor with 2 String params " + f + " " + l);

	}

	// calling the constructors from all the constructors of the class called as the
	// constructors chaining
	// can we overrride the constructor?
	// no,comman methods in the child and parent class not possible
	// can we perform the inheritance b/w the constructors?
	// yes
	// constructors are static or non static methods?and why?
	// non static methods, bcz without creation of the object we can not clal the
	// coonstructor
	// is void or returns any value?..not void and not returns anything

	public static void main(String[] args) {
		Constructor1 c = new Constructor1();

		// new Constructor1(1000);
		// new Constructor1("Swhizz", "Technologies");
		// c.printVars();
		// c.sam();

	}

	public void printVars() {
		// deafult values of the primitive data types
		System.out.println("printvars method output");
		System.out.println(str);
		System.out.println(j);
		System.out.println(d);
		System.out.println(f);
	}

}
