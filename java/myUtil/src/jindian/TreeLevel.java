package jindian;

/**
 * Created by dyr on 2016/10/16.
 */
import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class TreeLevel {
    public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
        ListNode head=new ListNode(-1);
        ListNode pre=head,current;
        TreeNode top;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        for(int i=1;i<dep;i++){
            int length=queue.size();
            for(int j=0;j<length;j++){
                top=queue.poll();
                if(top.left!=null) queue.add(top.left);
                if(top.right!=null) queue.add(top.right);
            }
        }
        while (!queue.isEmpty()){
            current=new ListNode(queue.poll().val);
            pre.next=current;
            pre=current;
        }
        return head.next;
    }
}