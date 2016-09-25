package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class HasSubtree {
}
class Solution18{
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null)
            return false;
        if(testTree(root1,root2))
            return true;
        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);

    }

    private boolean testTree(TreeNode root1, TreeNode root2) {
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return testTree(root1.left,root2.left)&&testTree(root1.right,root2.right);
    }
}
