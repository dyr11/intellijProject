package nowcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dyr on 2016/10/6.
 */
public class PrintTreeRow {
}

class Solution59 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        Queue<TreeNode> temp;
        ArrayList<Integer> row;
        left.offer(pRoot);
        while (!left.isEmpty()) {
            row = new ArrayList<>();
            while (!left.isEmpty()) {
                TreeNode current = left.poll();
                if (current != null) {
                    row.add(current.val);
                    right.offer(current.left);
                    right.offer(current.right);
                }
            }
            if (!row.isEmpty()) {
                result.add(row);
            }
            temp = right;
            right = left;
            left = temp;
        }
        return result;
    }

}