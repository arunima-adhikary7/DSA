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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev=head;
        ListNode curr=prev.next;
        ListNode next=curr.next;
        int min=Integer.MAX_VALUE;
         int[] ans={-1,-1};
        int position=1;
        int first=-1;
        int last=-1;
        while(next!=null )
        {
            if((curr.val<prev.val && curr.val<next.val )||( curr.val>prev.val && curr.val>next.val)  )
            {
                if(first==-1)
                {
                    first=position;
                }
                else
                {
                    min=Math.min(min,position-last);
                }
                last=position;
            }
            prev=prev.next;
            curr=curr.next;
            next=next.next;
            position++;
        }

       if(first==-1 || first==last)
       {
        return ans;
       }
       int max_dist=last-first;
       ans[0]=min;
       ans[1]=max_dist;
       return ans;
    }
}