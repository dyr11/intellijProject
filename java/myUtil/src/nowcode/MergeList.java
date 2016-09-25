package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class MergeList {
}
class Solution15 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head=new ListNode(-1),pre=head;
        while (list1!=null&&list2!=null){
            if(list1.val>list2.val){
                pre.next=list2;
                list2=list2.next;
            }else{
                pre.next=list1;
                list1=list1.next;
            }
            pre=pre.next;
        }
        if(list1!=null){
            pre.next=list1;
        }else{
            pre.next=list2;
        }
        return head.next;
    }
}
