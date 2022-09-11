import java.util.*;
import java.lang.Math;
class MathOperation{
	int x,y;
	MathOperation()
	{
	}	

	
	void init()
	{	
		Scanner sc = new Scanner(System.in);
	        x = sc.nextInt();
		y = sc.nextInt();
	}

	void add()
	{
		int R = x+y;
		System.out.println("R=" +R);
	}
	
	void multiply()
	{
		int R = x*y;
		System.out.println("R=" +R);
	}
	
	void power()
	{
		double R = Math.pow(x,y);
		System.out.println("R=" +R);
	}

	void display()
	{
		init();
		add();
		multiply();
		power();
	}
	
	public static void main(String[] args)
	{
		MathOperation mo = new 	MathOperation();
		mo.display();
	}
}