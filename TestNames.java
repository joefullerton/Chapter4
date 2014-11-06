package Chapter_4;
import java.util.Scanner;

public class TestNames
{
	public static void main(String[] args)
	{
		String first,middle,last,first2,middle2,last2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your First Name?");
		first = scan.next();
		System.out.println("What is your Middle Name?");
		middle = scan.next();
		System.out.println("What is your Last Name?");
		last = scan.next();
		
		System.out.println("What is your First Name?");
		first2 = scan.next();
		System.out.println("What is your Middle Name?");
		middle2 = scan.next();
		System.out.println("What is your Last Name?");
		last2 = scan.next();
		
		Names names1 = new Names(first, middle,last);
		Names names2 = new Names(first2, middle2, last2);
		
		System.out.println(names1.firstMiddleLast() + "\n" + names1.lastFirstMiddle() + "\n" + names1.initials() + "\n" + names1.length() + "\n");
		System.out.println(names2.firstMiddleLast() + "\n" + names2.lastFirstMiddle() + "\n" + names2.initials() + "\n" + names2.length() + "\n");
	
		
	}
}
