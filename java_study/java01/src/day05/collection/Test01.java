package day05.collection;

public class Test01 {
	public static void main(String[] args) {
		
		Employee1 emp0 = new Employee1("홍길동","2021001");   // 오브젝트 타입이라 다운캐스팅 해서 써야함
		System.out.println(((String)emp0.getNum()).charAt(0));
		
		Employee1<Object> emp1 = new Employee1("박길동",2021001);
		System.out.println(emp1.getNum().getClass());
		
		Employee1<String> emp2 =new Employee1<String>("고길동","2021001"); //반드시 오브젝트 타입이 꺽세에 들어감(오브젝트의 서브클래스)
		System.out.println(emp2.getNum().getClass());
		
		Employee1<Integer> emp3 =new Employee1<Integer>("앙길동",2021001);
		System.out.println(emp3.getNum().getClass());
		
	}
}

class Employee1<T>{ //런타임에 T타입을 알려줌 (언급하지 않으면 그냥 Object 타입
	
	private String name;
	private T num; //꼭 T일 필요는 없음.
	
	public Employee1() {	}

	public Employee1(String name, T num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}
	
	
}