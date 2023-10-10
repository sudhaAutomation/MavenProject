package basics;

public class DataTypes_Variables {
	int k ;// global variable
	static String str;

	public static void main(String[] args) {// is responsible for the execution of the line of code in a class
		// commenting in single line
		/*
		 * in this way you can give multi line commenting
		 */
		// primitive dat atypes
		byte data = 127;
		System.out.println(data);
		int i = 2000000000;
		System.out.print(i);
		long l = 90000000000l;
		System.out.println(l);
		System.out.println(i);
		double d = 23.34;
		System.out.println(d);
		float j = 23.1f;
		System.out.println(j);
		// non primitive data type
		// String ,Array
		char c = '1';
		String s = "Swhizz Technologies";
		System.out.println(s);

		/*
		 * object is the physical entity of the class,it will contain every thing that
		 * class contains object will be created by the instantiation of the class with
		 * new keyword
		 */
	//	System.out.println(k);
		DataTypes_Variables obj = new DataTypes_Variables();// obj is reference variable of the object
		System.out.println(obj.k);
		System.out.println(str);
		obj.sam();
		int m;
		//System.out.println(m);
	}
	public void sam() {
		System.out.println(str);
		System.out.println(k);
	}

}
