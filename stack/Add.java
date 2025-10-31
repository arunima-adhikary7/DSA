package stack;
import java.util.*;

public class Add{

    public static void addbottom(int data,Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        addbottom(data, s);
        s.push(top);


    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
         s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        addbottom(5,s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        
    }
    
}
}
 
