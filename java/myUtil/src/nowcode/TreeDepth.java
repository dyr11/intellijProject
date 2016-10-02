package nowcode;

/**
 * Created by dyr on 2016/10/2.
 */
public class TreeDepth {
}
class Solution37 {
    public int TreeDepth(TreeNode pRoot)
    {
        if(pRoot==null)
            return 0;
        int left=TreeDepth(pRoot.left);
        int right=TreeDepth(pRoot.right);
        return left>right?left+1:right+1;
    }
}