package day02;

public class Test01 {
	public static void main(String[] args) {
	int[] num1 = new int[] {55,99,87,100};
	int[] num2=num1;
	int[] num3=num2.clone();
	
	int idx =0;
	num1[idx]=11;
	System.out.println(num1[idx]);
	System.out.println(num2[idx]);
	System.out.println(num3[idx]);
System.out.println("----------------------------------");	
	int num4[] = new int[] {8,1,9,11};
	int num5[] = new int[num4.length*2];  //사이즈 무조건 정해줘야함
	System.arraycopy(num4, 0, num5, 0, num4.length);
	System.out.println(num5.toString());
	System.out.println();

	char[] c=new char[5];
	String[] s=new String[5];
	System.out.println();
	String[] data ="고길동/90/99/100".split("/");
	int count=0;
	int sum=0;
	for(int i=1; i<data.length;i++) {
		sum+=Integer.parseInt(data[i]);
		count++;
	}
	System.out.println(data[0]+"의 성적은  합계는"+ sum+" 평균은 : "+ sum/(double)count);
	}
}
