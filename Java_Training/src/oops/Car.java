package oops;

import java.util.Calendar;

public class Car {

	String regNo;
	String colour;

	public void carBody() {
		System.out.println("Body manuafactured ");

	}

	public void automaticgear() {
		System.out.println("car Automatic gear system implemented");
	}

	public void manualgear() {
		System.out.println("car manual gear system implmented");
		
	}

	public static void dieseltype() {//overrriden by child method
		System.out.println("fuel type of car is diesel");
	}

	public void petroltype() {
		System.out.println("fuel type car is petrol");
	}

	public void toolKit() {
		System.out.println("car is included with tool kit");
	}

}
