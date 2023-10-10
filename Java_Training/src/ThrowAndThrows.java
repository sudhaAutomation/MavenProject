
public class ThrowAndThrows {
	int accoutNumber = 8975644;
	int amount = 5000;

	public void display() {
		System.out.println("my account number is " + accoutNumber);
		System.out.println("my current blance is " + amount);
	}

	public void deposit(int amount) {
		this.amount = this.amount + amount;
		display();
	}

	public void withdraw(int amount) throws Exception {
		if (this.amount >= amount) {
			this.amount = this.amount - amount;
			display();
		} else {
			// System.out.println("insufficient funds in your accout");
			throw new Exception("insufficient funds in your account");

		}

	}

}
