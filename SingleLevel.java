package com.Inheritance;

class Parent{
	public void run() {
		System.out.println("Running fastly");
	}
}
class Child extends Parent{
	public void run() {
		System.out.println("Running slowly");
	}
}
public class SingleLevel {

	public static void main(String[] args) {
		Child c=new Child();
		c.run();
	}

}
