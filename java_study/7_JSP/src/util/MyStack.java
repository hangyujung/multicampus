package util;

public class MyStack<T> {
		T[] stack;
	    int count = 0;
	    
	    public MyStack() {
	    	stack = (T[]) new Object[10];
	    }

		public MyStack(int size) {
	    	stack = (T[]) new Object[size > 0 ?size:10];
	    }
	    
		public boolean isEmpty() {
			return count == 0 ? true : false;
		}
	    
		public boolean isFull() {
			return count == stack.length ? true : false;
		}
		
		public void push(T i) {
			
			if(isFull()) {
	            	System.out.println("스택 리사이즈 .....");
	            	T[] temp = (T[]) new Object[stack.length * 2];
	            	System.arraycopy(stack, 0, temp, 0, stack.length);
	            	stack = temp;
	            	temp = null;
			}
			stack[count++] = i;
		}
		
		public T peek() {
			return count == 0 ? null : stack[count-1];
		}
		
		
		public T pop() {
			T data = null;
			if(!isEmpty()) {
				data = stack[count-1];
				stack[count-1] = null;
				count--;
			}
			return data;
		}
		

}
