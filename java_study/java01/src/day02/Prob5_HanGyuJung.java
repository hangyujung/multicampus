package day02;

public class Prob5_HanGyuJung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( Prob5_HanGyuJung.leftPad("SDS", 6, '#') );
		System.out.println( Prob5_HanGyuJung.leftPad("SDS", 5, '$') ); 
		System.out.println( Prob5_HanGyuJung.leftPad("SDS", 2, '&') ); 
	}
	public static String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		StringBuilder sb=new StringBuilder();
		if(size<=str.length()) {
			return str;
		}
		else {
			
			for(int i=0;i<size-str.length();i++) {
				sb.append(padChar);
			}
			for(int j=0;j<str.length();j++) {
				
				sb.append(str.charAt(j));
			}
		}
		
		return sb.toString();
	}

}
