package day04;

import day04.abstract_.Animal;
import day04.abstract_.Dog;
import day04.abstract_.Fish;

public class Test01 {
	public static void main(String[] args) {
		Object obj=null;
		Animal a=null;
		Dog d=null;
		Fish f=null;
		
		obj= new int[] {}; //obj="hello java"; //obj= new Dog();
		a=new Dog();
		a.breath();
		((Dog)a).print(); //도그타입으로 다운캐스팅 해주세요
		System.out.println("==================");
		
		a=new Fish();
		a.breath();
		if(a instanceof Fish)((Fish)a).print(); //컴파일에서 못걸르고 메모리에 올려봐야 오류가 남 따라서 조건문 활용하자
		if(a instanceof Dog)((Dog)a).print(); 
		
		System.out.println("==================업캐스팅 , 다운캐스팅================");
		
		breathCall(new Dog());
		breathCall(new Fish());
		
		printCall(new Dog("시츄","쫑쫑"));
		printCall(new Fish("쿠쿠"));
		
		System.out.println("===============배열=================");
		
		Object[] objs= {"~~~","java",new Dog(),2,3,11.3};
		Dog[] ds= {new Dog(),new Dog("시츄","쫑쫑")};
		Fish[] fs= {new Fish(), new Fish("쿠쿠쿠")};
		Animal[] as= {new Dog(),new Dog("시츄","쫑쫑"),new Fish(), new Fish("쿠쿠쿠")};

		for(Animal data :as) {
			breathCall(data);
			printCall(data);
		}
	}
	
	public static void breathCall(Animal d) { //자바 다형성 실현, 기본적으로 is a 관계를 활용함
		d.breath();
	}
	public static void printCall(Animal d) {
//		if(d instanceof Dog)((Dog)d).print();
//		if(d instanceof Fish)((Fish)d).print();
		d.print();
	}
	
}
	
	
