package legacyClasses;

import java.util.Stack;

public class StackDemo {

	static void push(Stack<String> st, String name)
	{
		
		System.out.println("value added: "+st.push(name));
	}
	static void pop(Stack<String> st)
	{
		String s = st.pop();
		System.out.println("value removed: "+s);
	}
	public static void main(String[] args) {
		
		
		Stack<String> st=new Stack<>();
		push(st,"raju");
		push(st,"ravi");
		push(st,"rekha");
		push(st,"reshma");
		push(st,"reshmaKhan");
		st.push("akash");
		
		while(!st.isEmpty())
		{
			pop(st);
		}
		
	}

}
