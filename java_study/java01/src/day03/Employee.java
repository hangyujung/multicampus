package day03;
/**
 * 
 * @author gyu 
 * @since 2021.1.13
 */
public class Employee {
	private String name;
	private String dept;
	private int age;
	public Employee() {
		System.out.println("기본생성자 호출");
	}
	
	public Employee(String name,String dept,int age) {
		System.out.println("생성자호출");
		setName(name);
		setDept(dept);
		setAge(age);
	}
	public Employee(String string, int i) {
//		setName(string);
//		setAge(i);		
		this(string,null,i);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	/**
	 * 
	 * @param dept 부서정보
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	/**
	 * 
	 * @param age 양수여야함
	 */
	public void setAge(int age) {
		if(age>0) this.age = age;
	}
/**
 * 출력용도
 */
	void print() {
		System.out.printf("[이름:%s 부서:%s 나이:%d] %n",this.name,dept,age);//this는  바깥 스코프에 있는 것을 찾음, 그냥 디폴트면 우선
		//자기 스코프에서 dept를 찾아보고 없으면 밖에 있는 것을 찾는다.
	}

}
