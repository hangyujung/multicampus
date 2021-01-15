package day05.collection;

public class Test02 {
	public static void main(String[] args) {
		Employee emp = new Employee("고고고",202111);
		System.out.println(emp.num);
		Employee<String,Double> emp0 = new Employee<String,Double>("홍길동",221001.2);   
		System.out.println(emp0.num+ 100);
		Employee<String,Integer> emp1 = new Employee<>("박길동",2021001);
		System.out.println(emp1.num%1111);
	}
}
class Employee<T,P extends Number>{  //적어도 P는 반드시 연산이 가능한 타입이여한다고 제한을 주는 방법 
	T name;
	P num;
	public Employee(T name, P num) {
		super();
		this.name = name;
		this.num = num;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public P getNum() {
		return num;
	}
	public void setNum(P num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}
	
}