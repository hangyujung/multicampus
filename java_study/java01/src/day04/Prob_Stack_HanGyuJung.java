package day04;

public class Prob_Stack_HanGyuJung {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 20; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	int[] sta;
	int n=0;
	MyStack(){
		sta=new int[10];
	}
	MyStack(int size) {
		if(size>=0) {
			sta=new int[size];
		}
		else
			sta =new int[10];
	}
	void push(int num) {
		if(isFull()) {
			int resize=sta.length;
			int[] sta2 =new int[resize+10];
			for(int i=0;i<resize;i++) {
				sta2[i]=sta[i];
			}
			sta=sta2;
		}
		
		sta[n++]=num;
	}
	//System.arraycopy 메소드 활용
	
	
	boolean isEmpty() {
		if(n==0) return true;
		else return false;
	}
	boolean isFull() {
		if (n==sta.length) return true;
		else return false;
	}
	int top() {
		if(n==0) return -1;
		else {
			return sta[n-1];
		}
	}
	int pop() {
		if(n==0) return -1;
		else {
			return sta[(n--)-1];
		}
		}
}			
	
	
