package jindian;

/**
 * Created by dyr on 2016/10/16.
 *
 *
 * 题目描述

 请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。
 给定树的根结点指针TreeNode* root和结点的值int p，请返回值为p的结点的后继结点的值。
 保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1。
 */
import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Successor {
    private int pre=-1;
    boolean isFind=false;
    int next=-1;
    public int findSucc(TreeNode root, int p) {
        // write code here
        find(root,p);
        return isFind?next:-1;
    }
    private void find(TreeNode root,int p){
        if(root==null||isFind){
            return;
        }
        find(root.left,p);
        if (pre == p) {
            next=root.val;
            isFind=true;
            pre=-1;
            return ;
        }
        pre=root.val;
        find(root.right,p);
    }

    public static void main(String[] args) {
        int n=300;
        TreeNode tree[]=new TreeNode[n];
        for(int i=0;i<n;i++){
            tree[i]=new TreeNode(i);
        }
        for(int i=0;2*i+2<n;i++){
            tree[i].left=tree[i*2+1];
            tree[i].right=tree[i*2+2];
        }
        Successor successor=new Successor();
        System.out.print(successor.findSucc(tree[0],295));
    }

}