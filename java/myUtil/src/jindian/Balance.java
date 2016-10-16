package jindian;

/**
 * Created by dyr on 2016/10/16.
 */
import java.util.*;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    private  boolean isBalance=true;
    public boolean isBalance(TreeNode root) {
        treeHeight(root);
        return isBalance;
    }
    private int treeHeight(TreeNode root){
        if(root==null||!isBalance){
            return 0;
        }
        int left=treeHeight(root.left);
        int right=treeHeight(root.right);
        if(left-right>1||left-right<-1){
            isBalance=false;
            return -1;
        }else{
            return left>right?left+1:right+1;
        }
    }
}
