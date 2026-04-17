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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int l = 0;
        while(temp != null){
            l++;
            temp=temp.next;
        }
        
        temp=head;
        for(int i=1;i<l-n;i++){
            temp=temp.next;
        }
        if(l==n) head=head.next;
        else if(l==1) head=null;
        else if(n==1) temp.next=null;
        else temp.next=temp.next.next;
        return head;
    }
}