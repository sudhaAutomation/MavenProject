package basics;

public class TestOfFunctions {

	public static void main(String[] args) {
		Functions f = new Functions();
		f.sample();
		f.sum(200, 100);
		f.sub();//with return 
		System.out.println(f.sub());
		//System.out.println(f.sample());
		f.append();//with return
		System.out.println(f.append());
		f.multi(10, 5);//with return with arguments

	}

}
