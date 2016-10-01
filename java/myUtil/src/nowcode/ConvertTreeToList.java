package nowcode;

/**
 * Created by dyr on 2016/9/27.
 */
public class ConvertTreeToList {
}
/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
class Solution24 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        return convert(pRootOfTree,false);
    }
    private TreeNode convert(TreeNode root,boolean isLeft){
        if(root==null)
            return null;
        TreeNode left=convert(root.left,true);
        TreeNode right=convert(root.right,false);
        root.left=left;
        root.right=right;
        if(left!=null)
            left.right=root;
        if(right!=null)
            right.left=root;
        if(isLeft){
            while(root.right!=null){
                root=root.right;
            }
        }else{
            while(root.left!=null){
                root=root.left;
            }
        }
        return root;

    }
}