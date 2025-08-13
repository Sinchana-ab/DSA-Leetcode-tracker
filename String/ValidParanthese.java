import java.util.Scanner;
import java.util.*;

public class ValidParanthese {
    public static boolean isvalid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:  s.toCharArray()){
            if(c == '(') stack.push(')');
            else if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c) 
            	return false;
        }

        return stack.isEmpty(); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid parantheses: ");
        String s = sc.next();
        boolean result = isvalid(s);
        System.out.println("result is: "+result);
        sc.close();
    }
}
