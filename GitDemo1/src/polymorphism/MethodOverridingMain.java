package polymorphism;

public class MethodOverridingMain {

	public static void main(String[] args) {
		
		MethodOverridingA.a=5;
		
		
		//MethodOverridingB  methodOverridingB = new  MethodOverridingB();
		//methodOverridingB.method1();
		 
		// MethodOverridingA  methodOverridingA = new  MethodOverridingA();
		 //methodOverridingA.method1();
		 
		 MethodOverridingB  methodOverridingB = new  MethodOverridingB();
		 methodOverridingB.method1();
	}

}
