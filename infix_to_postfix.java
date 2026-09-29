package stack;
import java.util.*;

public class infix_to_postfix {

    public int precedence(char ch)
    {
        if(ch=='^')
        {
            return 3;

        }
        if(ch=='*' || ch=='/')
        {
            return 2;
        }
        if(ch=='+' || ch=='-')
        {
            return 1;
        }
        return -1;
    }
    public String infixToPostfix(String exp)
    {
        Stack<Character> stack=new Stack<>();
            StringBuilder result=new StringBuilder();
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch))
            {
                result.append(ch);

            }
            else if(ch=='(')
            {
                stack.push('(');
            }
            else if(ch==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek()))
                {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }
        return result.toString();
    }
   public String infixToPrefix(String exp) {

    // Step 1: Reverse
    StringBuilder reversed = new StringBuilder(exp).reverse();

    // Step 2: Swap brackets
    for (int i = 0; i < reversed.length(); i++) {

        if (reversed.charAt(i) == '(') {
            reversed.setCharAt(i, ')');
        }
        else if (reversed.charAt(i) == ')') {
            reversed.setCharAt(i, '(');
        }
    }

    // Step 3: Convert to postfix
    String postfix = infixToPostfix(reversed.toString());

    // Step 4: Reverse postfix → prefix
    return new StringBuilder(postfix).reverse().toString();
}
    public static void main(String args[])
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        infix_to_postfix ob = new infix_to_postfix();
        infix_to_postfix ob1 = new infix_to_postfix();
        System.out.println(ob.infixToPrefix(exp));
        System.out.println(ob.infixToPostfix(exp));
    }
    
}
