package nowcode;

import java.io.Serializable;

/**
 * Created by dyr on 2016/10/6.
 */
public class SerializeAndDeserializeBainaryTree {
    public static void main(String[] args) {
        Solution60 solution60=new Solution60();
        TreeNode treeNode8=new TreeNode(8);
        TreeNode treeNode6=new TreeNode(6);
        TreeNode treeNode10=new TreeNode(10);
        TreeNode treeNode5=new TreeNode(5);
        TreeNode treeNode7=new TreeNode(7);
        TreeNode treeNode9=new TreeNode(9);
        TreeNode treeNode11=new TreeNode(11);
        treeNode8.left=treeNode6;
        treeNode8.right=treeNode10;

        treeNode6.left=treeNode5;
        treeNode6.right=treeNode7;

        treeNode10.left=treeNode9;
        treeNode10.right=treeNode11;
        TreeNode root=solution60.Deserialize(solution60.Serialize(treeNode8));
        System.out.println(root.left.right.val==7);
    }
}
class Solution60 {
    String Serialize(TreeNode root) {
        if(root==null)
            return "";
        return root.val+"("+ Serialize(root.left)+","+Serialize(root.right)+")";
    }
    TreeNode Deserialize(String str) {
        if(str==null||str.length()<1)
            return null;
        int LeftParenthesis=str.indexOf('(');
        TreeNode treeNode=new TreeNode(Integer.parseInt(str.substring(0,LeftParenthesis)));
        int diffParenthesis=0;
        int dotPos=-1;
        for(int i=LeftParenthesis+1;i<str.length();i++){
            if(str.charAt(i)==','&&diffParenthesis==0){
                dotPos=i;
                break;
            }else if(str.charAt(i)=='('){
                diffParenthesis++;
            }else if(str.charAt(i)==')'){
                diffParenthesis--;
            }
        }
        treeNode.left=Deserialize(str.substring(LeftParenthesis+1,dotPos));
        treeNode.right=Deserialize(str.substring(dotPos+1,str.length()-1));
        return treeNode;
    }
}