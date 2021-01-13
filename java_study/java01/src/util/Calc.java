package util;

public class Calc {
	
	//메소드 오버로딩
	
	
	public static int add(int ...x) { //데이터타입과 변수사이에 ...을 넣으면 배열처리함
		int sum=0;
		for(int data:x) {
			sum+=data;
		}
		return sum;
		}
	public static int add(int x,int y) {
		return x+y;
	}
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	public static double add(double x,double y) {
		return x+y;
	}
	public static int sub(int x,int y) {
		return x+y;
	}
}
