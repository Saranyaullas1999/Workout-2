import java.util.*;
import java.io.*;
class NumOfObject{
	static int count;
	NumOfObject()
	{
		count+=1;
	}
	
	public static void main(String[] args)
	{
		NumOfObject ob1 = new NumOfObject();
		NumOfObject ob2 = new NumOfObject();
		NumOfObject ob3 = new NumOfObject();
		NumOfObject ob4 = new NumOfObject();
		NumOfObject ob5 = new NumOfObject();
		NumOfObject ob6 = new NumOfObject();
		System.out.println("Number of objects = " +count);
	}
}