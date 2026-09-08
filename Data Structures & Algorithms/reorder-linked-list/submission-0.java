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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode l1 = head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next=null;

        ListNode l2 = reverseLL(slow);
        mergeLL(l1,l2);

    }

    public ListNode reverseLL(ListNode l2){

        ListNode prev = l2;
        ListNode curr = l2.next;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        l2.next = null;
        l2=prev;
        return l2;

    }

    public void mergeLL(ListNode l1, ListNode l2){
 
        while(l1!=null){
      
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;
            l1.next = l2;

            if(l1Next ==null){ break;}
            l2.next = l1Next;
            l1=l1Next;
            l2=l2Next;
        }
    }
}
