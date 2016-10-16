package jindian;

/**
 * Created by dyr on 2016/10/16.
 * 题目描述

 对于一个元素各不相同且按升序排列的有序序列，请编写一个算法，创建一棵高度最小的二叉查找树。
 给定一个有序序列int[] vals,请返回创建的二叉查找树的高度。
 */
import java.util.*;

public class MinimalBST {
    public int buildMinimalBST(int[] vals) {
        if(vals==null)
            return 0;
        int lenght=vals.length;
        int height=0;
        while (lenght>0){
            height++;
            lenght>>=1;
        }
        return  height;
    }

    public static void main(String[] args) {
        MinimalBST minimalBST=new MinimalBST();
        int arr[]=new int[8];
        System.out.println(minimalBST.buildMinimalBST(arr));
    }
}