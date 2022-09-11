import java.util.*;
class SwapVal{
	int a,b;
	
	SwapVal()
	{
	}

	SwapVal(int i,int j)
	{
		a = i;
		b = j;
	}

	void swap(int a, int b)
	{
		int c = a;
		a = b;
		b = c;
	}

	void swapref(SwapVal val)
	{	
		System.out.println("Before Swapping:  a =" +a+ " and b = " +b);
		int c;
		c=val.a;
		val.a=val.b;
		val.b=c;
		System.out.println("After Swapping: a =" +val.a+ " and b = " +val.b);
	}


	public static void main(String[] args)
	{	
		SwapVal sw = new SwapVal();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before Swapping a = " +x+ " and b = " +y);
		sw.swap(x,y);
		System.out.println("After Swapping a = " +x+ " and b = " +y);

		SwapVal sw2 = new SwapVal(x,y);
		sw2.swapref(sw2);
		
	}
}
		


		