package nowcode;

import java.util.Arrays;

/**
 * Created by dyr on 2016/9/25.
 */
public class rebuildTree {

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int pre[] = {1, 2, 4, 7, 3, 5, 6, 8};
        int in[] = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = solution4.reConstructBinaryTree(pre, in);
        root.print();
    }
}


// Definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    void print() {
        printMid(this);
        System.out.println();
        printPre(this);
    }

    void printMid(TreeNode root) {
        if (root != null) {
            printMid(root.left);
            System.out.print(root.val);
            printMid(root.right);
        }
    }

    void printPre(TreeNode root) {
        if (root != null) {
            System.out.print(root.val);
            printPre(root.left);
            printPre(root.right);
        }
    }
}

class Solution4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, in, 0, 0, pre.length);
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in, int preStart, int inStart, int length) {
        if (length <=0)
            return null;
        if (length == 1)
            return new TreeNode(pre[preStart]);
        int rootPos = indexOf(in,pre[preStart]);
        TreeNode root = new TreeNode(pre[preStart]);
        int leftLength = rootPos - inStart;
        root.left = reConstructBinaryTree(pre, in, preStart + 1, inStart, leftLength);
        root.right = reConstructBinaryTree(pre, in, preStart + 1 + leftLength, inStart + 1 + leftLength, length - 1 - leftLength);
        return root;
    }
    int indexOf(int arr[],int val){
        for(int i=0;i<arr.length;i++){
          if(arr[i]==val)
              return i;
        }
        return -1;
    }
}
