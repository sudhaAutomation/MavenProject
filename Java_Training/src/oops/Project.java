package oops;

public interface Project extends SBI,ICICI {//is a relationship
	int minbal = 2000;// he blank final field i may not have been initialized

	public void studentScolar(); // Abstract methods do not specify a body

	public static void main(String[] args) {
		//new Interface1();

	}

}
// the variables in an interface, in default act as a final & static in nature
// the methods which are not having the method body called as an abstract
// method,thease are unimplemented methods
// in an interafce we can define only abstract methods
// in an interafce we can't create an object ,bcz it will contain the abstract
// methods
//static methods in an interface can have the implementation