/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //      ListNode dummy = new ListNode(-1);
    //     ListNode tail = dummy;

    //     // Traverse both lists until one becomes null
    //     while(list1 != null && list2 != null) {
    //         if(list1.val <= list2.val) {
    //             tail.next = list1;  // Attach list1 node
    //             list1 = list1.next; // Move list1 forward
    //         } else {
    //             tail.next = list2;  // Attach list2 node
    //             list2 = list2.next; // Move list2 forward
    //         }
    //         tail = tail.next; // Move tail forward
    //     }

    //     // Attach remaining nodes from whichever list is not null
    //     if(list1 != null) tail.next = list1;
    //     if(list2 != null) tail.next = list2;

    //     return dummy.next; // Return merged list, skipping dummy
        
    // }











 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

  
     ListNode dummy=new ListNode(-1);
     ListNode tail=dummy;

     while(list1!=null && list2!=null)
     {
        if(list1.val<=list2.val)
        {
            tail.next=list1;
            list1=list1.next;
        }
        else
        {
            tail.next=list2;
            list2=list2.next;
        }
        tail=tail.next; 
     }

     if(list1!= null) tail.next=list1;
     if(list2!=null)  tail.next=list2;

     return dummy.next;

 }

















}