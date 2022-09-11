class MathFunction
{
        void multiply(int a,int b)
	{
		System.out.println(a*b);

	}

	void multiply(float x,float y)
	{
		System.out.println(x*y);
	}
	
	void multiply(int p,float q)
	{
		System.out.println(p*q);
	}

	public static void main(String[] args)
	{
		MathFunction mf = new MathFunction();
		mf.multiply(8,9);
		mf.multiply(7,6);
		mf.multiply(8,7);
	}
}