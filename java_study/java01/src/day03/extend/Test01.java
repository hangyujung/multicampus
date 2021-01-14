package day03.extend;

import day04.abstract_.Animal;
import day04.abstract_.Dog;

public class Test01 {
	public static void main(String args[]) {
		//is a 관계
		//모든 객체의 data type은 부모가 될 수 있다.
		//부모타입인 경우에 접근영역에 제한을 받는다 ==> 메무리 하단부 접근이 X
		// 메모리 하단부 접근을 하려면 다운캐스팅 필요. 
		
		Animal a=new Animal();
		
		Animal d=new Dog(); //부모타입이라 하단부 접근안함
		//d.name; 
		Dog temp =(Dog) d;
//		System.out.println(temp.name);
//		System.out.println(((Dog)d).name); //(Dog)로 다운캐스팅해서 사용
		
		Dog d1 = new Dog(); // 밑에서부터 메모리 전체접근함
		Animal a2= d1;  //이렇게 하면 d1으로 부모단에 메모리 접근가능
		
	}
}
