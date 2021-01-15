package day05.collection;

import java.util.Stack;

public class Test03 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>(); //String[]
		stack.push("홍길동");
		stack.push("두길동");
		stack.push("셋길동");
		stack.push("사길동");
		stack.push("오길동");
		stack.push("육길동");
		
		for(String data : stack) {
			System.out.println(data.charAt(0)+"**");
		}
		System.out.println("----------------------------");
		Stack stack1 = new Stack();   //Object[]    jdk 이전버전은 이런식으로 사용했었음
		stack1.push("홍길동");
		stack1.push("두길동");
		stack1.push(1111);
		
		while(!stack.isEmpty()) {
			if(stack1.peek() instanceof String)
			System.out.println(((String)stack.pop()).charAt(0)+"**");
				else 
					System.out.println(stack.pop());
		
		}
		
		
	}
}
