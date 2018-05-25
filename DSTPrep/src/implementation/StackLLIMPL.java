package implementation;

import stackImplementation.StackLL;

public class StackLLIMPL {

	public static void main(String[] args) {
		StackLL stack = new StackLL();
		stack.push(10);
		
		System.out.println("TOP " + stack.top());
		System.out.println(stack.pop());
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	

	}

}
