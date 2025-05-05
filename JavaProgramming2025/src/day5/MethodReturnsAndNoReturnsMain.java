package day5;

public class MethodReturnsAndNoReturnsMain {

	public static void main(String[] args) {
	
		MethodReturnsAndNoReturns meth = new MethodReturnsAndNoReturns();
		
		meth.methodNoParamNoReturn();
		System.out.println(meth.methodNoParamWithReturn());
		
		meth.methodWithParamNoReturn(2,3);
		
		System.out.println(meth.methodWithParamAndReturn(4, 5.0));
		
	}

}
