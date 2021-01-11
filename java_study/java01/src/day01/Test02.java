package day01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "hello java";
		System.out.println(msg);
		System.out.println(msg.toUpperCase());
		System.out.println(msg);   //String은 immutable 불변의 객체 (읽기만 할수있음)
		
		char cc = msg.charAt(9);
		System.out.println(cc);
		int num = Integer.parseInt("100");   //자바에서 클래스 네임은 대문자로 시작 Integer 레퍼 클래스 (기본형을 객체화시킨다)
	
		double d1 = Double.parseDouble("33.56");  //new키워드없이 사용 
	
		byte b1 = 127;
		System.out.printf("Byted %d ~ %d %n",Byte.MIN_VALUE,Byte.MAX_VALUE);
		System.out.printf("int %d ~ %d %n",Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		char c = 'a';
		boolean f = c>='0' && c<='9';
		System.out.printf("%c 숫자?=> %b %n ",c,f);
	
		System.out.printf("%c =>  %d %n",'a',(int)'a');
		System.out.println('a'+"=>"+(int)'a');
		//문자는 아스키코드값으로 관리함
		
	
	}

}
