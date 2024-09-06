package Day3Variables;

public class StudentInstanceVariables {
	String name = "Asheen"; // instance variables
	int rollNo = 101; // instance variables
	int marks = 40; // instance variables

	public static void main(String[] args) {
		StudentInstanceVariables s =  new StudentInstanceVariables();
		System.out.println("Student Name : " + s.name);
		System.out.println("Student RollNo : " + s.rollNo);
		System.out.println("Student Marks : " + s.marks);
	}

}
