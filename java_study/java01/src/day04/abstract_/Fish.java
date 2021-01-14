package day04.abstract_;

//Animal은 kind="동물의종류",breath="폐로숨쉬기" 갖고있음 
public class Fish extends Animal {
		
		String name;
		
		public Fish() {
			super("물고기");    //kind에 "물고기" 저장
		}
		public Fish(String name) {
			super("물고기");
			this.name = name;
		}
		@Override  //오버라이드 애노테이션
		public void breath() {
			System.out.println("아가미로 숨쉬기...");
		}
		@Override
		public void print(){
			System.out.println("[Fish] kind: "+this.kind+"\t 이름 : "+name);
		}
		public static void main(String[] args) {
			Animal f = new Fish("쿠피"); //업캐스팅    //슈퍼클래스 래퍼런스가 서브클래스 객체를 가르킴 : 업캐스팅
			//부모객체가 하단메모리 참조하고싶으면 다운캐스팅을 하면 됨.(하지만 오버라이딩 된 메소드는 그냥 접근 가능)
			((Fish)f).print();    //[Fish] kind : 물고기 이름: 쿠피    //(Fish)다운캐스팅,, 슈퍼클래스객체를 서브클래스타입으로 형변환 : 다운캐스팅
			f.breath();			  //폐로숨쉬기?
			((Fish)f).breath();   //
		}
		
}

//fish에서 애니멀로 캐스팅해야 애니멀의 정보를 볼수있음
