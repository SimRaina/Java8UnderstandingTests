package org.test;

public class ExampleUsageLambda {
    public static void main(String args[]) {

      MyInterface test = (fname, lname) -> System.out.println(fname +" "+lname);
      test.show("John", "Doe");

      
      MyInterface1 test1 = () -> System.out.println("Hello");
      test1.show();
      
      MyInterface2 test2 = message -> System.out.println(message);
      test2.show("Hello");
    }
}