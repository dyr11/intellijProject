package nowcode;


import java.util.LinkedList;

/**
 * Created by dyr on 2016/10/2.
 */
public class FindFirstCommonNode {
}
class Solution35 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        LinkedList<ListNode> listNodes=new LinkedList<>();
        ListNode[] lists={pHead1,pHead2};
        while(lists[0]!=null||lists[1]!=null){
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null){
                    if(listNodes.indexOf(lists[i])!=-1) {
                        return lists[i];
                    }
                    else {
                        listNodes.add(lists[i]);
                        lists[i]=lists[i].next;
                    }
                }
            }
        }
        return null;
    }
}