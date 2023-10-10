package oops;

public class Encapsulation {
	private String username;
	private String password;

	public void setusername(String uname) {
		username = uname;
		System.out.println(username);

	}

	public void setpassword(String pword) {
		password = pword;
		System.out.println(password);

	}

	public String getusername() {
		System.out.println("get username");
		System.out.println(username);
		return username;

	}

	public String getpassword() {
	//	System.out.println("get password method");
		return password;
	}

}
