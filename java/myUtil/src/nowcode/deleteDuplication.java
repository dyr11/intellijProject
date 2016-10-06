package nowcode;

/**
 * Created by dyr on 2016/10/6.
 */
public class deleteDuplication {
}
class Solution55 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode head=new ListNode(-1);
        head.next=pHead;
        ListNode before=head;
        ListNode current=pHead;
        ListNode next;
        while(current!=null){
            next=current.next;
            while(next!=null&&next.val==current.val){
                next=next.next;
            }
            if(current.next==next){
                before.next=current;
                before=before.next;
            }
            current=next;

        }
        before.next=null;
        return head.next;
    }
}