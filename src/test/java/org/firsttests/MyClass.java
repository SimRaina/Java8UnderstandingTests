package org.firsttests;

public class MyClass {

	public static void main(String[] args) {
       
		new MyInterface() {
			public void test() {  // Overridden method 
				System.out.println("Test Method");
		} 
	}.test();

   }
}

@FunctionalInterface
interface MyInterface{
	
	public void test(); // abstract / not implemented  SAM -> Single Abstract Method
}

