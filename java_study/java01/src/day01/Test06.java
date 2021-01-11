package day01;

public class Test06 {
	public static void main(String[] args) {
		int jumsu[] = null;
		jumsu = new int[5];
		
		jumsu[0]=00;
		jumsu[1]=10;
		jumsu[2]=20;
		jumsu[3]=30;
		jumsu[4]=40;
//		for(int i=0;i<jumsu.length;i++) {
//			System.out.println(jumsu[i]);
//		}
		for(int data: jumsu) {
			System.out.print(data+" ");
		}
		System.out.println("");
		String[] name =null;
		name =new String[100];
		name[0]="홍길동";
		name[1]="한규정";
		name[2]="김열길";
		name[3]="임주영";
		name[4]="정다운";
		name[5]="";
		for(int i=0;i<name.length;i++) {
			if(name[i]!=null && name[i].length()>0)   //short circit logic 신경쓰기
				System.out.println(name[i].charAt(0)+"**");  //컴파일단에는 문제없지만 실행중에 문제있음 --> 런타임 오류
		}  //주소가있는곳에만 도트연산자가능한데 널인 곳에 도트연산자 써서 오류가 남
		
//		for(String data: name) { //여기 data는 레퍼런스이므로 data. 돗트 연산자(주소찾아가는) 사용가능
//			if(data!=null&& data.length()>0) System.out.println(data.charAt(0)+"**");
//		
//		}
		
		
	}
}
