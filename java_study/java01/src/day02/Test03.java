package day02;

public class Test03 {
	public static void main(String[] args) {
		int[] num1 = {1,1,2,1};
		int[] num2 = {2,2,2,2};
		int[] num3 = {3,3,3,3};
		
		int[][]two = {num1,num2,num3};  //배열들의 주소를 모은 배열 ==> 2차원배열
		System.out.println(num1[0]);
		System.out.println("------------");
		
		int[][] two2 = {
				{90,55,88,99,92},
				{94,55,88,99,92},
				{90,65,88,99},
				{90,95,88,79,92},
				{91,55,88,59,72}
				};
		
		for(int i=0;i<two2.length;i++) {
			int count = two2[i].length;
			int sum=0;
			for(int j=0; j<count;j++) {
				sum+=two2[i][j];
			}
			System.out.println(i+1+" "+count+"  "+sum+" " +sum/(double)count);
		}
		int[][] two3= new int[4][]; // 행배열만 정의해서 사용가능
		two3[0]=new int[] {1,2,3}; //변수선언은 끝났고 초기화하고 있는 것이니 new 키워드가 꼭필요함
		two3[2]=new int[] {7,8,9};
	
		for(int i=0;i<two3.length;i++) {
			if(two3[i]==null) continue;
			else {
				int len = two3[i].length;
				for(int j=0; j<len;j++) {
					System.out.print(two3[i][j]+ "  ");
				}
			}
		}
	}
}
