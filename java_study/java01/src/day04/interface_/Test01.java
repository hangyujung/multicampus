package day04.interface_;

import java.io.Serializable;

public class Test01 {
	public static void main(String[] args) {
	play(new STV());  //메소드는 하나인데 다양한 동작을 함 ==> 자바 다형성	
	
	}
	
	public static void play(TV t) {
		t.powerON();
		t.powerOFF();
	}
}
interface TV{  //이렇게 하자고 약속을 한 규약 느낌   //abstract와는 다르게 interface 는 추상메소드만 들어옴 따라서 abstract,public 처리됨 알아서
	public abstract void powerON();
	void powerOFF();
}
class LgTV implements TV ,Serializable{

	@Override
	public void powerON() {
		System.out.println("LGTV POWER ON!!!");
	}

	@Override
	public void powerOFF() {
		System.out.println("LGTV POWER OFF!!!");
		
	}
}
class STV implements TV{
	public void powerON() {
		System.out.println("STV POWER ON!!!");
	}

	@Override
	public void powerOFF() {
		System.out.println("STV POWER OFF!!!");
		
	}
}