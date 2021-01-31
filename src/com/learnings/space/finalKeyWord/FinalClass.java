package com.learnings.space.finalKeyWord;

/*
 * final class cannot be inherited
 */

public class FinalClass{

	public static void main(String[] args) {
		A a = new A();
		a.display();
	}

}

final class A{
	public final void display() {
		System.out.println("I am the dispay with no-args");
	}
	
	public final void display(String a) {
		System.out.println("I am the dispay with a arg");
	}
}

//class B extends A{
class B {
	B(){
		System.out.println("Default constructor");
	}
	
	public final void display(String a, String ba) {
		System.out.println("I am the dispay with no-args");
	}
}