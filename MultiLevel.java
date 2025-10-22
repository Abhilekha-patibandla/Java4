package com.Inheritance;


class Parent1{
	public void car() {
		System.out.println("red");
	}
}
class Child1 extends Parent1{
	public void car() {
		System.out.println("black");
	}
}
class Child2 extends Child1{
	public void car() {
		System.out.println("white");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		Child2 c=new Child2();
		c.car();

	}

}
