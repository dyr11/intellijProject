package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class FindKthToTail {
}
class Solution10 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode kth=head;
        for(int i=0;i<k&&kth!=null;i++){
            kth=kth.next;
        }
        if(kth==null)
            return null;
        while(kth!=null){
            kth=kth.next;
            head=head.next;
        }
        return head;
    }
}
