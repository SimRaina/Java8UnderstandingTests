package org.test;
public class ExampleUsageAnonymousClass {
    public static void main(String args[]){
        new MyInterface() {
            @Override
            public void show(String fname, String lname) {
                System.out.println(fname +" "+ lname);
            }
        }.show("Sim", "Raina");
    }
}

class Test1 implements MyInterface{

	@Override
	public void show(String fname, String lname) {
		// TODO Auto-generated method stub
		
	}
}
