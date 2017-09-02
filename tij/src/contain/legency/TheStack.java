package contain.legency;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class TheStack {
	public static void main(String[] arg){
		Stack<String> stack=new Stack<>();
		stack.push("hello");
		stack.push("world");
		stack.push(",");
		stack.push("en");
		stack.push(" ");
		stack.push("haha");
		stack.push(".");
		//设计问题，这里不应该有
		System.out.print(stack.elementAt(2));

		//用LinkedList
		LinkedList<String> stackl=new LinkedList<>();
		stackl.push("hello");
		stackl.push("world");
		stackl.push(",");
		stackl.push("en");
		stackl.push(" ");
		stackl.push("haha");
		stackl.push(".");
		Deque dq=new LinkedList();
	}
}
