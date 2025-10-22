package com.Inheritance;


class Parent3{
	public void car() {
		System.out.println("White");
	}
}
class Child3 extends Parent{
	public void car() {
		System.out.println("Black");
	}
}
class Child4 extends Parent{
	public void car() {
		System.out.println("Red");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		Child2 c=new Child2();
		c.car();
	}

}
