package Day6AssignmentPrograms;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = scanner.nextInt();
	/*	boolean LeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		String result = LeapYear ? " is a leap year " : " is not a leap year";
		System.out.println(year + result); */
		if((year % 4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println(year + " is a Leap Year");
		}else {
			System.out.println(year + " is not a Leap Year");
		}

	}

}
