package nowcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by dyr on 2016/10/6.
 */
public class PrintZ {
}
class Solution58 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Stack<TreeNode> left=new Stack<>();
        Stack<TreeNode> right=new Stack<>();
        boolean leftToRight=true;
        Stack<TreeNode> temp;
        ArrayList<Integer> row;
        left.push(pRoot);
        while(!left.empty()){
            row=new ArrayList<>();
            while (!left.empty()){
                TreeNode current=left.pop();
                if(current!=null){
                    row.add(current.val);
                    if(leftToRight){
                        right.push(current.left);
                        right.push(current.right);
                    }else{
                        right.push(current.right);
                        right.push(current.left);
                    }
                }
            }
            if(!row.isEmpty()){
                result.add(row);
            }
            temp=right;
            right=left;
            left=temp;
            leftToRight=!leftToRight;
        }
        return result;
    }

}