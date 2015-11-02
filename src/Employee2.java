import java.io.*;
//This program also runs off of Employee
public class Employee2 {
	
	//this instance variable is visible for any child class.
	public String name;
	
	//salary variable is visible in Employee class only
	private double salary;
	
	//The name variable is assigned in the constructor.
	public void Employee (String empName){
		name = empName;
	}
	
	//The salary variable is assigned a value.
	public void setSalary(double empSal){
		salary = empSal;
	}
	
	//This method print the employee details
	public void printEmp(){
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
	}
	
	public static void main(String args[]){
		Employee empOne = new Employee("Scarlett");
		empOne.empSalary(1000);
		empOne.printEmployee();
	}
	
}
