package day04.abstract_;

public class Dog extends Animal {
	String name;
	String kind="강아지종류";
	
	public Dog() {
		super("강아지과");
	}
	
	public Dog(String name, String kind) {
		super("강아지과");
		this.name = name;
		this.kind = kind;
	}
//업캐스팅(Upcasting)이란, 서브 클래스의 객체가 슈퍼 클래스 타입으로 형변환 되는 것을 말한다
	@Override
	public void print() {
		System.out.println(super.kind+" / "+this.kind+" / "+name);
	}
	public static void main(String[] args) {
	Dog d1 = new Dog();
	d1.print(); // null / 강아지종류 /  강아지과
	
	Dog d2 = new Dog("캐리","진돗개");
	d2.breath();  //폐로숨쉬기
	d2.print();   // 캐리 / 진돗개  / 강아지과
	
	System.out.println(d1.kind);  // 강아지종류
	System.out.println(((Animal)d1).kind); //업캐스팅,          // 강아지과 
	System.out.println(((Animal)d2).kind);		  			// 강아지과
	System.out.println(d2.kind); //static에선 super, this 사용불가	//진돗개
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("폐로 숨쉬기...");
	}
}
