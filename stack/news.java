package stack;

public class news {
    public static class Node {

        int data;
        Node next;
        Node(int data)
        {
           this.data=data;
           next=null;
        }
    
        
    }

    public static class Stack{
     public static Node head;

     public static boolean isEmpty()
     {
        return head==null;
     }

        public static void push(int data)
        {
            Node newnode=new Node(data);
            if(isEmpty())
            {
                head=newnode;
            }
            else{
            newnode.next=head;
            head=newnode;
            }


        }

        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=head.data;
            return top;
        }

        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static void print()
        {
            if(isEmpty())
            {
                return;
            }
            else{
                Node temp=head;
                while(temp!=null)
                {
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }

    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
     System.out.println();
     //s.print();
        while (!s.isEmpty()) {
    System.out.println(s.peek());
    s.pop();
}


    }
    
}
