package day03.extend;

public class Animal {

	String kind = "동물의 종류";
	
	public Animal() {}

	public Animal(String kind) {
		this.kind = kind;
	}

	public void breath() {
		System.out.println("폐로 숨쉬기..,");
	}
	
}
