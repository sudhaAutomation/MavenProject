package oops;

public class BMW extends Car {// is-a-relationship

	public void naming() {
		colour = "maroon";
		System.out.println(colour);
		regNo = "TS04FU2378";
		System.out.println(regNo);
	}

	public static void main(String[] args) {
		BMW b = new BMW();

		b.naming();
		b.carBody();
		b.automaticgear();
		b.petroltype();

	}

}
