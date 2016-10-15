package nowcode;

import java.util.HashMap;

/**
 * Created by dyr on 2016/10/6.
 */
public class KthNode {
}
class Solution61 {
    private  HashMap<TreeNode,Integer> hashMap=new HashMap<>();
    public  TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(k<=0||k>count(pRoot)||pRoot==null){
            return null;
        }
        int currentCount=count(pRoot.left)+1;
        if(currentCount>k){
            return KthNode(pRoot.left,k);
        }else if(currentCount<k){
            return KthNode(pRoot.right,k-currentCount);
        }else{
            return pRoot;
        }
    }

    private int count(TreeNode root){
        if(root==null){
            return 0;
        }
        if(hashMap.containsKey(root)){
            return hashMap.get(root);
        }else{
            int count=1+count(root.left)+count(root.right);
            hashMap.put(root,count);
            return count;
        }
    }
}