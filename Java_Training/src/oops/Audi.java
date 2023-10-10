package oops;

public class Audi extends Car {

	public void naming() {
		System.out.println("My audi car specifications");
		colour = "maroon";
		System.out.println(colour);
		regNo = "TS04FU2378";
		System.out.println(regNo);
	}

	public void sunRoof() {
		System.out.println("my Audi is having sunroof");
	}

	public static void dieseltype() {
		System.out.println("my Audi will work with diesel fuel");
	}

	public void toolKit() {
		System.out.println("Audi is included with tool kit");
	}

	public static void main(String[] args) {
		Car over = new Audi();// child class object  will reffered with the parent clas reference
								// varible,by this method over riding feature will be form,here executing the child
								// class methods at run time by overriiding the parent class methods
	//dynamic ploymorphism also called as run time polymorphism
		
		over.carBody();
		over.toolKit();//comman methods in child and parent 
		over.dieseltype();
		over.petroltype();
				over.automaticgear();
		// over.sun

	}

}
