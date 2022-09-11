import java.util.*;
class employee{
	static int empNo;
	static double salary;
	static double totalSalary;
	
	employee()
	{
	}

	employee(double salary)
	{
		empNo++;
		System.out.println("Employee Number: " +empNo);
		this.salary = salary;
		System.out.println("Salary : " +salary);
		totalSalary = salary + totalSalary;
	}

	static void display()
	{
		System.out.println("Total no of Employee: " +empNo);
		System.out.println("Total Salary of all employee: " +totalSalary);
	}
}
class Emp2
{
	public static void main(String[] args)
	{
		float s1,s2,s3,s4;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st employee salary :");
		s1 = sc.nextFloat();
		employee e1 = new employee(s1);

		System.out.println("Enter 2nd employee salary :");		
		s2 = sc.nextFloat();
		employee e2 = new employee(s2);
		
		System.out.println("Enter 3rd Employee salary :");		
		s3 = sc.nextFloat();
		employee e3 = new employee(s3);

		System.out.println("Enter 4th Employee salary :");		
		s4 = sc.nextFloat();
		employee e4 = new employee(s4);
		employee.display();
	}
}