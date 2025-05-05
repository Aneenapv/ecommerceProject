package day5;

public class MethodReturnsAndNoReturns {

	
	public void methodNoParamNoReturn()
	{
		System.out.println("No Parameter and no return value");
	}
	
	public String methodNoParamWithReturn()
	{
		return ("No Parameter with return value");
	}
	
	public void methodWithParamNoReturn(int a,int b)
	{
		int c=a+b;
		System.out.println("sum of a and b = "+c);
	}
	
	public double methodWithParamAndReturn(int a, double b)
	{
		//int c = (int) (a+b); // cast
        //float c = a+b;
		return a+b;
	}
	
	
}
