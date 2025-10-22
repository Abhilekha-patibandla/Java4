package com.Inheritance;


class Parent2{
	public void car() {
		System.out.println("red");
	}
}
class Subchild1 extends Parent2{
	public void car() {
		System.out.println("white");
	}
}
class Subchild2 extends Parent2{
	public void car() {
		System.out.println("Black");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		Subchild2 s=new Subchild2();
		s.car();
		Subchild1 s1=new Subchild1();
		s1.car();

	}

}
