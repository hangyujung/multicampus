package day03;

public class Test03 {
	public static void main(String[] args) {

		Time t1=new Time(6,30,0,true);
		t1.print();
	
		Location p=new Location();
		
	
	}
}
class Location{ //왓다갓다하기 불편하니깐 여기다가 클래스선언한건데 외부에 노출할 클래스는 따로 파일 분리해서 선언함
	double x;
	double y;
}
class Time{
	private int hour;
	private int minute;
	private int second;
	private boolean am;
	
	
	public Time() {
		super();
	}


	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}


	public Time(int hour, int minute, int second, boolean am) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.am = am;
	}
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public boolean isAm() {
		return am;
	}
	public void setAm(boolean am) {
		this.am = am;
	}

	public void print() {
		System.out.println("[Time] "+hour +" : "+ minute + " : "+ second+" "+ (am?"오전":"오후"));
	}
}
