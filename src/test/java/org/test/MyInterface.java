package org.test;

@FunctionalInterface
public interface MyInterface {
     void show(String fname, String lname);
}

@FunctionalInterface
 interface MyInterface1 {
	void show();
}

@FunctionalInterface
interface MyInterface2 {
	void show(String message);
}