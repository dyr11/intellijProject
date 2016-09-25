package nowcode;

import java.util.ArrayList;

/**
 * Created by dyr on 2016/9/24.
 */
public class stringreplace {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        StringBuffer buffer = new StringBuffer();
        buffer.append(" a s ");
        System.out.println(solution.replaceSpace(buffer));
    }
}

class Solution2 {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ", "%20");
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result=new ArrayList<>();
        while(listNode!=null){
            result.add(0,listNode.val);
            listNode=listNode.next;
        }
        return result;
    }
}
