package oops;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(args));
		
		if(args[1].equals("dev")) {
			System.out.println("dev props");
		} 
		if(args[1].equals("qa")) {
			System.out.println("qa props");
		}
		
//		Encapsulation en = new Encapsulation();
//		en.setusername("Swhizz Technologies");
//		en.setpassword("123456");
//
//		System.out.println(en.getusername());
//		System.out.println(en.getpassword());
//		// System.out.println(en.password);
//
		String name = "Thirisha";
		String str = new String("Thirisha");
//		String name = "Ram";
//		name="molabanti";
//		
//		System.out.println(name.concat("MOhan"));
		
		Integer i = new Integer(100099);
		Integer ii = new Integer(100099);
		System.out.println(i.hashCode());
		System.out.println(ii.hashCode());

	}

}
