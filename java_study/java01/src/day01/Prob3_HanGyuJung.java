package day01;

public class Prob3_HanGyuJung {

	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		StringBuilder sb=new StringBuilder();
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		char c;
		int a;
		
		for(int i=0;i<sourceString.length();i++) {
			c=sourceString.charAt(i);
			if(c!=32) {
			c=(char)(c+3);  //c+3만하면 int형 됨
			
			
			if((int)c>122) {
				a=(int)c-122;
				c = (char)(a+97);
			}
			//x = (x + 3 - 97) % 26 + 97;

			}
			sb.append(c);
		}
		encodedString = sb.toString();
		
		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}