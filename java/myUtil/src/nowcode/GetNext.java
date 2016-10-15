package nowcode;

import java.util.LinkedList;

/**
 * Created by dyr on 2016/10/6.
 */
public class GetNext {
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

class Solution56 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)
            return null;
        if(pNode.right!=null){
            TreeLinkNode node=pNode.right;
            while(node.left!=null){
                node=node.left;
            }
            return node;
        }else{
            TreeLinkNode parent=pNode.next;
            while(parent!=null&&parent.right==pNode){
                pNode=parent;
                parent=pNode.next;
            }
            return parent;
        }
    }
}