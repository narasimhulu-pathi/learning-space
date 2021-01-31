package com.learnings.space.finalKeyWord;

/*
 *  Final methods cannot be overridden
 *  Final methods can be overloaded but not overridden
 */
public class FinalMethod {
	
//	final FinalMethod(){
//		
//	}

	public static void main(String[] args) {
		FinalMethod finalMethod = new FinalMethod();
		System.out.println(finalMethod);
		
		A a = new A();
		a.display();
		a.display("One arg");
	}
	
}

class A{
	public final void display() {
		System.out.println("I am the dispay with no-args");
	}
	
	public final void display(String a) {
		System.out.println("I am the dispay with a arg");
	}
}

class B extends A{
	B(){
		System.out.println("Default constructor");
	}
	
	public final void display(String a, String ba) {
		System.out.println("I am the dispay with no-args");
	}
}

interface I1{
//	final default void show() {
//		System.out.println("I am the show method");
//	}
	void display();
}

abstract class ABC{
	final void project() {
		System.out.println("I am the project method");
	}
}


