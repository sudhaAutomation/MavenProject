package oops;

public class TestC implements Project {// has a relationship

	public static void main(String[] args) {
		TestC mt = new TestC();

		mt.accountOpening();
		mt.savingsAccount();
		mt.studentScolar();
		mt.currentAccount();
		mt.onlinTransaction();
		mt.insuranceClaim();
	}

	public void MyTestmethod() {
		System.out.println("Sample implementation");

	}

	@Override
	public void accountOpening() {
		System.out.println("SBI account opening method implemented");

	}

	@Override
	public void onlinTransaction() {
		System.out.println("SBI online transaction method implemented");
	}

	@Override
	public void savingsAccount() {
		System.out.println("SBI savings Account method implemented");

	}

	@Override
	public void currentAccount() {
		System.out.println("ICICI current Account method implemented");

	}

	@Override
	public void insuranceClaim() {
		System.out.println("ICICI insurance claim method implemented");

	}

	@Override
	public void studentScolar() {
		System.out.println("Project student acholarship method implemented");

	}

}
