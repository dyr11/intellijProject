package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
    public static void main(String[] args) {
        Solution_PrintFromTopToBottom solution_printFromTopToBottom=new Solution_PrintFromTopToBottom();
        solution_printFromTopToBottom.PrintFromTopToBottom(null);
    }
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
class Solution_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();
        queue.add(root);
        TreeNode node;
        while (!queue.isEmpty()){
            //System.out.println("null is well");
            node=queue.poll();
            if(node!=null){
                result.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return result;
    }
}
