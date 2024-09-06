package Day3Variables;

public class StudentStaticVariables {
	static String StudentName = "Abdul";
	static int StudentRollNumber = 102;
	static int StudentMarks = 90;

	public static void main(String[] args) {
		// object creation
		StudentStaticVariables std = new StudentStaticVariables();
		System.out.println("Student Name : " + StudentName); // called directly with given name.
		System.out.println("Roll Number : " + std.StudentRollNumber); // called using object created reference variable.
		System.out.println("Marks : " + StudentStaticVariables.StudentMarks); // called using class name.

	}

}
