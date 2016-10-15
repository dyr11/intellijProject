package nowcode;

/**
 * Created by dyr on 2016/10/6.
 */
public class isSymmetrical {
}
class Solution57 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return pRoot==null||isSame(pRoot.left,pRoot.right);
    }
    boolean isSame(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        if(left==null||right==null)
            return false;
        return left.val==right.val&&isSame(left.left,right.right)&&isSame(left.right,right.left);
    }
}