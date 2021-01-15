package day05;

public class Test05_has_a {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(3,3),2);
		System.out.println(c1);
		
		c1.setR(c1.getR() );
	}
}
class Point {  //extends Object 생략된거임
	int x;
	int y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
class Circle {
	private Point p; // Has a 관계
	int r;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(Point p,int r) {
		this.p=p;
		this.r=r;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [중심점 =" + p + ", 반지름=" + r + "]";
	}
	
}
