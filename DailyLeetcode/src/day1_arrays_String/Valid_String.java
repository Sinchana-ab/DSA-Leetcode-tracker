package day1_arrays_String;

import java.util.Stack;

public class Valid_String {
	public static boolean validString(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == '(')
				stack.push(')');
			else if(s.charAt(i) == '{')
				stack.push('}');
			else if(s.charAt(i) == '[')
				stack.push(']');
			else {
				if(stack.isEmpty() || stack.peek() != s.charAt(i)) {
					return false;
					
				}
				stack.pop();
			}
			
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String s = "()";
		System.out.println("the String is valid: "+(validString(s)));
	}
}
