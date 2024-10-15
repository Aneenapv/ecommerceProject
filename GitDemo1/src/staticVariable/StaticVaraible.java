package staticVariable;

public class StaticVaraible {

	int a =2;
	static int b = 3;
	
	public void method1()   //non static
	{
		int s = a+b;
		System.out.println(s);
	}
	
	public static void method2()  //static
	{
		int s = b;
		System.out.println(s);
	}
	
	public static void method3()
	{
		
		StaticVaraible staticVaraibleObj = new StaticVaraible();	
		staticVaraibleObj .method1();
		method2();
		int s = (staticVaraibleObj.a=5) +b;
		System.out.println(s);
	}
	
}
