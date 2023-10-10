package basics;

public class Loops {// when we neeed to execute the sam elogic for no of times

	public static void main(String[] args) {
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		System.out.println("Hello 6");
		System.out.println("Hello 7");
		System.out.println("1 while loop");

		int i = 1;// initialisation
		while (i <= 10) {// conditional part
			System.out.println("Hello " + i);
			i = i + 2;// i++;//incremental /decremental part
		}

		System.out.println("2 do while loop");

		int j = 1;// initialisation
		do {
			System.out.println("Hello " + j);
			j = j + 2;// i++;//incremental /decremental part
		} while (j <= 10);// conditional part

		System.out.println("FOR LOOP");
		for (int k = 1; k <= 10; k++) {
			System.out.println("Hello " + k);
		}

	}

}
