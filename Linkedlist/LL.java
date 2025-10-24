package Linkedlist;
public class LL {
    Node head;


    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }

    }

    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }

    public void printList()
    {
        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){

        if(head==null)
        {
            System.out.println("Empty list,nothing to delete");
        }
        head=this.head.next;
    }

    public void removeLast()
    {
        if(head==null){
                     System.out.println("Empty list,nothing to delete");
                    return ;}
                    if(head.next==null)
                    {
                        head=null;
                        return;
                    }
                    Node currNode=head;
                    Node lastNode=head.next;
                    while(lastNode.next!=null)
                    {
                        currNode=currNode.next;
                        lastNode=lastNode.next;
                    }
                    currNode.next=null;


    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("Java");
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
    }
    
}
