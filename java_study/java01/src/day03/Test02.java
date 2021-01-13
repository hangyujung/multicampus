package day03;

public class Test02 {
	public static void main(String[] args) {
		Employee emp1 =new Employee(); //employee클래스공간을 메인메모리에 업로드( 클래스내용 :힙 ,, 레퍼런스 : 스택)
		
		emp1.print();
	
	Employee emp2=new Employee("고길동","영업부",29);
	Employee emp3=new Employee("최나라","비서부",22);
	Employee emp4=new Employee("징징이",null,22);
	Employee emp5=new Employee("한규정",22);
	Employee[] employees= {
			new Employee("고길동","영업부",29),
			new Employee("최나라","비서부",22),
			new Employee("징징이",null,-22),
			new Employee("한규정",22),
	};
	for(Employee data : employees) {
		if(data.getDept()==null) System.out.println(data.getName());
	}
	
	}
	
}
