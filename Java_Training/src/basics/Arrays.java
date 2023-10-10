package basics;

public class Arrays {// array is an object, will store the similar data type of the lements in a
						// contigious memory location
	// single dimensional array
	// multi /2 dimesional array
	public static void main(String[] args) {
		String course = "Software Testing";
		String course1 = "Devops";
		int i = 100;
		i = 20;
		// System.out.println(i);
		// System.out.println(course);

		String cource[] = new String[6];
		cource[0] = "Software testing";
		cource[1] = "Devops";
		cource[2] = "Salesforce";
		cource[3] = "Power bi";
		cource[4] = "JAva Full Stack";
		cource[5] = "MULE SOFT";
		// cource[6] = "PYTHON";// ArrayIndexOutOfBoundsException
		// System.out.println(cource[0]);
		// System.out.println(cource[1]);
		// System.out.println(cource[2]);
		// System.out.println(cource[3]);
		System.out.println(cource.length);// 10

		for (int j = 0; j < cource.length; j++) {

			System.out.println(cource[j]);

		}
		String branch[][] = new String[6][3];
		branch[0][0] = "Course";
		branch[0][1] = "--KPHB----";
		branch[0][2] = "-madhapur-";

		branch[1][0] = "Software Testing";
		branch[1][1] = "15-08-2023";
		branch[1][2] = "16-09-2023";

		branch[2][0] = "Mule Soft";
		branch[2][1] = "23-08-2023";
		branch[2][2] = "24-09-2023";

		branch[3][0] = "Power Bi";
		branch[3][1] = "26-08-2023";
		branch[3][2] = "27-09-2023";

		branch[4][0] = "Salesforce";
		branch[4][1] = "25-08-2023";
		branch[4][2] = "24-09-2023";

		branch[5][0] = "JAva";
		branch[5][1] = "3-9-2023";
		branch[5][2] = "13-09-2023";
		System.out.println(branch.length);// 6
		System.out.println(branch[2].length);// 3

		for (int j = 0; j < branch.length; j++) {// rows
			// j=1
			for (int k = 0; k < branch[2].length; k++) {
				System.out.print(branch[j][k] + "         ");

			}
			System.out.println();

			// System.out.println(cource[j]);

		}

	}

}
