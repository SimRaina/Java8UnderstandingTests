package org.firsttests;

public class MyLambdaClass {

	public static void main(String[] args) {
       
    MyInterface1 mi1 = () -> System.out.println("Hello"); // Lambda represents to the instance of the Functional interface
    mi1.test();
    
    
    MyInterface2 mi2 = msg -> System.out.println(msg);
    mi2.test("Hello Again");
    
    MyInterface3 mi3 = (fname, lname) -> System.out.println(fname + " " + lname);
    mi3.test("Sim", "Raina");
   }
}

@FunctionalInterface
interface MyInterface1{
	
	public void test(); // abstract / not implemented  SAM -> Single Abstract Method
}

@FunctionalInterface
interface MyInterface2{
	
	public void test(String msg); // abstract / not implemented  SAM -> Single Abstract Method
}

@FunctionalInterface
interface MyInterface3{
	
	public void test(String fname, String lname); // abstract / not implemented  SAM -> Single Abstract Method
}

