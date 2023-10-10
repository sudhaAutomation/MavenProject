package oops;

import java.time.LocalDate;
import java.util.Calendar;

public class Calender1 {
	
	
	

	public static void main(String[] args) {
		//to perform additionm or substraction on current date
		Calendar c= Calendar.getInstance();//factory method
		c.set(2023, Calendar.AUGUST, 20);
		c.add(Calendar.DATE, 3);
		System.out.println(c.getTime());
	System.out.println(LocalDate.of(2023, 8, 20));		

	}

}
