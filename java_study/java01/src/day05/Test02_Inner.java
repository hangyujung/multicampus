package day05;

public class Test02_Inner {
	public static void main(String[] args) {
		B b= new B();
		b.print();
		A.C c =new A().new C();
		c.print();
		A.C c1 =new A("~~~~~~~~~").new C();
		c1.print();
	}
}
class A{
	String name = "A _ name";

	public A() {}

	public A(String name) {
		this.name = name;
	}
	class C{ //inner클래스가 되면 outer에 있는 자원을 마음껏 쓸수 있다.
		
		public void print() {
			System.out.println(name);   //name은 this.name이 생략된 것.
		}
	}
	
}
class B{
	A a =new A();
	public void print() {
		System.out.println(a.name);
	}
}