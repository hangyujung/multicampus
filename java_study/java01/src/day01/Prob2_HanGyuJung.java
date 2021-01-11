package day01;

public class Prob2_HanGyuJung {
	public static void main(String[] args) {
		String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		
		for(int i=strData.length-1;i>=0;i--) {
			for(int j=strData[i].length()-1;j>=0;j--) {
				System.out.print(strData[i].charAt(j));
			}
			System.out.println();
		}
	}
}
