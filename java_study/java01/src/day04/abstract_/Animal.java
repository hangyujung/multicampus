package day04.abstract_;

public abstract class Animal {

	protected String kind = "동물의 종류";
	
	public Animal() {}

	public Animal(String kind) {
		this.kind = kind;
	}
	public void print() {};
	
	
	@Override
	public String toString() {
		return "Animal [kind=" + kind + "]";
	}
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		return true;
	}

	public abstract void breath();  //바디부가 없는 메소드는 abstract 메소드, 이 메소드는 일반클래스에는 포함될 수 없다.(abstract,interface에만 존재)
	//abstract 클래스는 new 를 통해 메모리에 올라갈 수 없다. 오직 부모가 되기 위한 클래스임   //무조건 서브클래스에서 override를 강제함
	public static void main(String[] args) {
		
	}
}
