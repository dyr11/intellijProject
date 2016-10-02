package nowcode;

/**
 * Created by dyr on 2016/10/2.
 */
public class IsBalancedTree {

}
class Solution38 {
    private boolean isbalanced=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return false;
        isBalanced(root);
        return isbalanced;
    }

    private int isBalanced(TreeNode root) {
        if(!isbalanced)
            return -1;
        if(root==null)
            return 0;
        int left=isBalanced(root.left);
        int right=isBalanced(root.right);
        if(left-right>=-1&&left-right<=1)
            return left>right?left+1:right+1;
        else{
            isbalanced=false;
            return -1;
        }
    }
}
