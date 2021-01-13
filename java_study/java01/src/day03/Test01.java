package day03;
import util.Calc;

public class Test01 {
	public static void main(String[] args) {
		//day02.Employee emp1;  풀패쓰로 하면 이렇다.
		java.util.Scanner s;
		java.util.Arrays a;
		
//		Calc c1 =new Calc();
//		int num=c1.add(33,88);
//		System.out.println(num);
//		Calc c2 =new Calc();
//		System.out.println(c2.add(999,111));  //어차피 사용용도는 똑같아 공유하는 느낌 --> static 키워드 사용
	
		
		int num = Calc.add(33, 88);    //객체 메모리에 올릴필요없이 바로 사용가능 (static)
		
		System.out.println(num);
		System.out.println(Calc.add(999,111));   //static에선 this 못씀
		System.out.println(Calc.add(999,111,555));
		System.out.println(Calc.add(11.1,11.2));
		System.out.println(Calc.add(55,8452,111,33,6));
	}
}
