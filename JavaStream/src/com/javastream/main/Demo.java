package com.javastream.main;


@FunctionalInterface
interface A {
	
	void show(int a);
}

/*
 * class B implements A {
 * 
 * @Override public void show() { // TODO Auto-generated method stub
 * System.out.println("This is an implementation of interface"); } }
 */

public class Demo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anonymous inner class
		A obj = (int a) -> System.out.println("This is show " + a); // This is lambda expression
		obj.show(5);
	}
}
