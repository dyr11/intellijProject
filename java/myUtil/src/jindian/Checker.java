package jindian;

/**
 * Created by dyr on 2016/10/16.
 */
import java.util.*;
import java.util.logging.Level;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Checker {
    public boolean checkBST(TreeNode root) {
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean checkBST(TreeNode root,int min,int max) {
        if(root==null){
            return true;
        }
        if(root.val>max||root.val<min||root.left!=null&&root.left.val>root.val||root.right!=null&&root.right.val<root.val){
            return false;
        }
        return checkBST(root.left,min,root.val)&&checkBST(root.right,root.val,max);
    }
}
