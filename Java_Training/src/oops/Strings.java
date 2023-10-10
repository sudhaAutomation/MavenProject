package oops;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Strings {

	public static void main(String[] args) {
		String str = "Swhizz Technologies 12345";// this is by string literal
		String name = new String("Institute");// by new keyword
		System.out.println(str);
		System.out.println(name);
		name = "sudha";
		str = "welcome to madhapur kphb and welcome to gachibowli    ";
		String expresult = "Admin";
		System.out.println(str);
		System.out.println(name);
		System.out.println(str.concat(" kphb"));
		System.out.println(str + " kphb");
		System.out.println(str.length());// 8

		System.out.println(str.contains("welcome m"));// boolean
		String actresult = "ADMIN";
		System.out.println(expresult.equals(actresult));
		System.out.println(actresult.equalsIgnoreCase(expresult));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		String date = "12-09-2001";
		System.out.println(date.replace('-', '/'));

		String[] strar = str.split("to");
		System.out.println(strar.length);//
		System.out.println(strar[0]);
		for (int i = 0; i < strar.length; i++) {
			System.out.println(strar[i].trim());
		}
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println();
		System.out.println("char at method output " + str.charAt(4));
		System.out.println(str.indexOf('e'));// 1 first occurence
		System.out.println(str.indexOf('y'));// -1
		System.out.println(str.indexOf('e', 2));// 6 second occurence
		System.out.println(str.indexOf('e', str.indexOf('e', str.indexOf('e') + 1) + 1));
		System.out.println(name);
		StringBuffer revnsme = new StringBuffer(String.valueOf(name)).reverse();
		System.out.println(revnsme);
		System.out.println(new StringBuffer(String.valueOf(name)).reverse());
		int a = 12345678;
		System.out.println(new StringBuffer(String.valueOf(a)).reverse());
		System.out.println(new StringBuilder(name).reverse());

		System.out.println(Calendar.getInstance().getTime());
		System.out.println(new Date());
		System.out.println(Instant.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(System.currentTimeMillis());
		Parent.out.print("Hi");
	}

}

class Parent {
	public static Child out= new Child();
}

class Child {
	public void print(String str) {
		System.out.println(str);
	}
}
