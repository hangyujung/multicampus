package day03;
import java.util.Calendar;
public class Test04 {
	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.YEAR);
		
		String msg = new String("안녕!");
		System.out.println(msg);
		
	}
}
class Singleton{
	static Singleton s =new Singleton();
	private Singleton() {}//외부에서는 객체생성 금지,생성자에 private 붙이기
	
	public static Singleton getInstance() {
		return s;
	}
}
