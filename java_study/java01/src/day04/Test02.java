package day04;

import day04.abstract_.Animal;

public class Test02 {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		
		Animal a1= new Animal("고양이");
		Animal a2= new Animal("고양이");
		System.out.println(a1.toString());
		System.out.println(a2);
		System.out.println(a1.equals(a2));
	}
}

//Object 클래스에 toString() 과 equals() 메소드는 웬만하면 메소드오버라이딩 해야함. 그래야 객체의 주소가 아닌 정보 출력할수있음
//Object 클래스는 모든 클래스의 슈퍼클래스.
