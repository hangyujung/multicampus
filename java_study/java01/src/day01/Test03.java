package day01;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		String msg = num+1+"Hello" +num+1 +"java"; //앞에서부터 처리함 , +기준으로 양옆의 데이터타입을 비교함
		System.out.println(msg);
	
		
		//StringBuffer sb1 = new StringBuffer();   //jdk1.5버전까지는 이거썻음
		StringBuilder sb = new StringBuilder();   //알아둬야할 api
		
		sb.append(num+1);
		sb.append("hello");
		sb.append(num);
		sb.append(1);
		sb.append(" ");
		sb.append("java ");
		String r = sb.toString();   //equal은 똑같은 데이터타입에 사용하는것
		System.out.println(r);
		
		
	}
}
