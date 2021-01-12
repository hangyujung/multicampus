package day02;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(args.length);
		
		System.out.println();
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i].charAt(0)+"**");
		}
	}
}
