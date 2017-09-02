package contain.containner.stack;

import java.util.Stack;

public class MyStack {
	public static void main(String args[]){
		Stack<Integer> stack=new Stack();
		stack.push(5);
		System.out.println(stack.peek());

		System.out.println(stack.search(5));

	}

}
