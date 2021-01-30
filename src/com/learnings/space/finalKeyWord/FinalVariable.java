package com.learnings.space.finalKeyWord;

/*
 * Final variables can be assigned only once in a lifetime
 *  Final variables cannot be re-assigned
 *  Final variable cannot used until it is assigned a value
 */
public class FinalVariable {
	
	static{ 
		PRODUCT_TYPE="T-SHIRT";
	  }  
	
	//final int PRODUCT_MRP = 500;
	final int PRODUCT_MRP;
	
	static final String PRODUCT_TYPE;
	static final String PRODUCT_NAME="BEING HUMAN";
	
	FinalVariable(){
		//System.out.println(this.PRODUCT_MRP);
		this.PRODUCT_MRP = 200;
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		
		System.out.println(FinalVariable.PRODUCT_NAME);
		
		FinalVariable finalVariable = new FinalVariable();
		System.out.println(finalVariable.PRODUCT_MRP);
		
		//finalVariable.PRODUCT_MRP=12;
		
		int x = finalVariable.PRODUCT_MRP + 125;
		System.out.println(x);
		
		finalVariable.display();
		
		int y = finalVariable.addition(10,20);
		System.out.println("Sum is :: " + y);
	}
	
	public void display() {
		final int x;
		System.out.println("Final Local Variable");
		
		x=32;
		System.out.println(x);
		
//		x=35;
//		System.out.println(x);
		
	}
	
	public int addition(final int a, final int b) {
		//a=a+10;
		return a+b;
	}
	
	public int sum(int a,int b) {
		a = a+10;
		return a+b;
	}

}

interface I1{
	//String VALUE_OF_STRING;
	String VALUE_OF_STRING = "String";
}
