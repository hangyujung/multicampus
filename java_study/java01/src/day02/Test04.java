package day02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test04 {
	//데이터 + 기능  , 어플리케이션을 구동시켜주는 메인메소드를 갖고있음
	public static void main(String[] args) {
		int num=99;
		Scanner scanner =new Scanner(System.in); 
		String name =new String("~~~~~");
		boolean flag = num>100;
		Emp emp1 =new Emp(); // 하드디스크에있던 데이터를 메모리에 올린다(객체생성), 사용자 정의 데이터 타입   
		emp1.name="홍길동";
		emp1.dept="기술부";
		emp1.setAge(32);
		emp1.print();
		
		Emp emp2 =new Emp(); // 메모리에 올린다(객체생성), 사용자 정의 데이터 타입
		emp2.name="두길동";
		emp2.dept="영업부";
		emp2.setAge(29);
		emp2.print();
		
		Emp emp3 =new Emp(); // 메모리에 올린다(객체생성), 사용자 정의 데이터 타입
		emp3.name="삼길동";
		emp3.dept="비서부";
		emp3.setAge(22);
		emp3.print();
		
		Emp emp4 = new Emp();
		emp4.print();
		
		Emp[] employees1 = new Emp[10];
		Emp[] employees = new Emp[] {emp1,emp2,emp3,emp4,null,null};


		
		System.out.println("================================");
		System.out.println("사원검색");
		name="삼길동";
		name=JOptionPane.showInputDialog("검색할 사원의 이름을 입력하세요..");
		
		for(Emp part:employees) {
				if(part!=null && part.dept!=null && part.name.equalsIgnoreCase(name)) {
					part.print();
				}
		}
		//구동과정 : 메모리 stack 부분에 emp1 이라는 변수가 만들어짐 , 하드디스크에 있던 employee 클래스가 Heap에 각 데이터와 기능을 저장할 공간들이 
		//디폴트 초기화되어 할당하고 emp1이라는 레퍼런스 타입 변수는 이곳을 레퍼런싱한다.
	}
}
class Emp{  //public이 아니기 떄문에 같은 패키지(폴더) 내에서만 사용가능
	//데이터 +기능
	String name ;
	String dept ;
	private int age;
	public void setAge(int age) {   //인캡슐레이션을 통해 데이터 걸러서 받을수 있음
		if(age>0) this.age=age;  //스코프밖에 있는 age에 넣는것
		//age=age;  이러면 그냥 로컬변수 age에 넣는것뿐임,,
	}
	public int getAge() {
		return age;
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
	public void setDept(String dept) {
		this.dept = dept;
	}
	void print() {
		System.out.printf("[이름:%s 부서:%s 나이:%d] %n",this.name,dept,age);//this는  바깥 스코프에 있는 것을 찾음, 그냥 디폴트면 우선
		//자기 스코프에서 dept를 찾아보고 없으면 밖에 있는 것을 찾는다.
	}
}
