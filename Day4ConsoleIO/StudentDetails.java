package Day4ConsoleIO;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Student Name : ");
		String name = scanner.next();
		System.out.println("Student Id : ");
		int id = scanner.nextInt();
		System.out.println("Student Age : ");
		int age = scanner.nextInt();
		System.out.println("Student Gender : ");
		char gender = scanner.next().charAt(0);
		
		System.out.println("Student Name : " + name);
		System.out.println("Student Id : " + id);
		System.out.println("Student Age : " + age);
		System.out.println("Student Gender : " + gender);
        
	}

}
