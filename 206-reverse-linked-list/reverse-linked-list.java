
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head==null){
            return head;
        }

        ListNode prev=null;
        ListNode current=head;

        while(current!=null){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current =temp;
        }
        return prev;



        
    }
}