
public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		int i = 10;

		try {
			System.out.println(i / 0);// 2
		} catch (ArithmeticException e) {

			e.printStackTrace();
		} finally {// always follwed by try or catch
			System.out.println("line of code to protect or closing the source file");
		}
		System.out.println("Bye");

		Thread.sleep(5000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
	}

}
