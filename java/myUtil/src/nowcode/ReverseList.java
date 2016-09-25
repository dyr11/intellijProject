package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class ReverseList {
}

class Solution11 {
    public ListNode ReverseList(ListNode head) {
        ListNode newHead=null,pre=head,next;
        while (pre!=null){
            next=pre.next;
            pre.next=newHead;
            newHead=pre;
            pre=next;
        }
        return newHead;
    }
}
