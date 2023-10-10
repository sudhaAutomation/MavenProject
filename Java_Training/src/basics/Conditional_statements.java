package basics;

public class Conditional_statements {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		char c = 'a';
		char d = 'p';// 122
		char g;
		g = c;
		System.out.println("simple if condition");
		if (a != b) {// simple if condition
			System.out.println("a and b are distinct vales");
		}
		if (c > g) {
			System.out.println(" c and g are holding same value");
		}
		System.out.println(" if else");
		if (c > g) {
			System.out.println(" c and g are holding same value");
		} else {
			System.out.println("c and g are not greater than or not lesser than each other ");
		}

		// else if / nested if
		System.out.println("nested if");

		if (a > b || d < b) {
			System.out.println(" a and d are holding the values greater than b");
		} else if (b > a & g != c) {
			System.out.println("b is greater than a , g and c are not same");
		} else if (b == a || c == g) {
			System.out.println(" b and a , c and g are same");

		} else {
			System.out.println(" a and b are numerics and c and g are characters");
		}
		int x = 100;
		int y = 400;
		int z = 1900;

		if (z > y) {
			if (z < x) {
				System.out.println(" z is greater than x and also y");
			}
		} else {
			System.out.println("z is not matched with x and y");
		}

		System.out.println("bye");

		String expcourse = "Software Testing";
		switch (expcourse) {
		case "power BI":
			System.out.println("my actual course is POwer BI");
			break;
		case "Salesforce":
			System.out.println("my actual course is POwer BI");
			break;
		case "Devops":
			System.out.println("my actual course is POwer BI");
			break;
		case "Software testing":
			System.out.println("my actual course is Software testing");
			break;
		case "Software Testing":
			System.out.println("my actual course is Software Testing");
			
		default:
			System.out.println("my actual course is not found");
			break;
		}

	}

}
