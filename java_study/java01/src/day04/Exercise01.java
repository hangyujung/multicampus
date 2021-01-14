package day04;

public class Exercise01 {
	public static void main(String[] args) {
		Student stu =new Student("홍길동",20,200201);
		Teacher tea = new Teacher("이순신",30,"JAVA");
		Employee emp = new Employee("유관순",40,"교무과");
	
		Person[] pers = {new Student("홍길동",20,200201),
				new Teacher("이순신",30,"JAVA"),new Employee("유관순",40,"교무과")};
		for (Person data:pers) {
			data.print();
		}
	}
}
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
		System.out.println("이름 : "+name+" 나이 : "+ age);
	}
	
	
}
class Student extends Person{
	
	private int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void print() {
		System.out.println("이름 : "+this.getName()+"   나이 : "+this.getAge()+"  학  번 : "+id);
	}
	
}
class Teacher extends Person{
	
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String sub) {
		this.subject = sub;
	}
	@Override
	public void print() {
		System.out.println("이름 : "+this.getName()+"   나이 : "+this.getAge()+"  담당과목 : "+subject);
	}
	
}
class Employee extends Person{
	
	private String dept;

	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void print() {
		System.out.println("이름 : "+this.getName()+"   나이 : "+this.getAge()+"  부  서 : "+dept);
	}
	
}
