package day03.extend;

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
		public void print(){
			System.out.println("[Fish] kind: "+this.kind+"\t 이름 : "+name);
		}
		public static void main(String[] args) {
			Animal f = new Fish("쿠피"); //업캐스팅    //슈퍼클래스 래퍼런스가 서브클래스 객체를 가르킴 : 업캐스팅
			((Fish)f).print();    //[Fish] kind : 물고기 이름: 쿠피    //(Fish)다운캐스팅,
			f.breath();			  //폐로숨쉬기?
			((Fish)f).breath();   //
		}
		
}
