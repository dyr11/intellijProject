package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class MirrorTree {
}
class Solution13 {
    public void Mirror(TreeNode root) {
        if(root==null)
            return ;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}