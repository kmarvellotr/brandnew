import java.io.*;

public class EmployeeTest {
	
	public static void main(String args[]){
		//Create two projects using constructors
		Employee empOne = new Employee("Chris Evans");
		Employee empTwo = new Employee("Jennifer Lawrence");
		
		//Invoking methods for each object created
		empOne.empAge(30);
		empOne.empDesignation("Actor");
		empOne.empSalary(85789.98);
		empOne.printEmployee();
		System.out.println();
		empTwo.empAge(29);
		empTwo.empDesignation("Actress, Democrat");
		empTwo.empSalary(95678.79);
		empTwo.printEmployee();
		
	}
}
