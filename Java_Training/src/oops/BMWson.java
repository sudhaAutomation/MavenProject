package oops;

public class BMWson extends BMW {// is-a-relationship

	public void naming() {
		colour = "white";
		System.out.println(colour);
		regNo = "TS05FU2378";
		System.out.println(regNo);
	}

	public static void main(String[] args) {
		BMWson b = new BMWson();

		b.naming();
		b.carBody();
		b.automaticgear();
		b.manualgear();
		b.petroltype();

	}

}
