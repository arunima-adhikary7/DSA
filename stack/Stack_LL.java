package stack;

class Stack_LL {
            public static Node head;

     
    public static class Node {
         int data;
         Node next;

         Node(int data)
         {
            this.data=data;
            next=null;
         }
    
        
    }

    static class stack {


        public static void push(int data)
        {
            Node newnode=new Node(data);
            if(head==null)
            {
               head=newnode;
               return;
            }
            else
            {
                newnode.next=head;
                head=newnode;
            }
        }

        public static int pop()
        {
            if(head==null)
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek()
        {
            if(head==null)
            {
                return -1;

            }
            int top=head.data;
            return top;
        }
    
        
    }
    

    public static void main(String[] args) {

        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(head!=null)
        {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}