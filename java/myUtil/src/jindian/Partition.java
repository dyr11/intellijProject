package jindian;

/**
 * Created by dyr on 2016/10/16.
 */
import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode less=new ListNode(-1);
        ListNode large=new ListNode(-1);
        ListNode lessCurrent=less,largeCurrent=large;
        while (pHead!=null){
            if(pHead.val<x){
                lessCurrent.next=pHead;
                lessCurrent=pHead;
            }else{
                largeCurrent.next=pHead;
                largeCurrent=pHead;
            }
            pHead=pHead.next;
        }
        lessCurrent.next=large.next;
        largeCurrent.next=null;
        return less.next;
    }
}