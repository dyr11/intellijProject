package nowcode;

/**
 * Created by dyr on 2016/10/6.
 */
public class EntryNodeOfLoop {
}
class Solution54 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast =pHead;
        ListNode slow=pHead;
        while (fast!=null&&fast.next!=null&&slow!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                while(slow!=pHead){
                    slow=slow.next;
                    pHead=pHead.next;
                }
                return slow;
            }
        }
        return null;
    }
}