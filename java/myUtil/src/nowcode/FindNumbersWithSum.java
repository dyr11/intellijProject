package nowcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dyr on 2016/10/3.
 */
public class FindNumbersWithSum {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,11,15};
        Solution42 solution42=new Solution42();
        solution42.FindNumbersWithSum(arr,15);
    }
}
//输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
//        输出描述:
//        对应每个测试案例，输出两个数，小的先输出
class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> result=new ArrayList<>();
        int length=array.length;
        if(length<2||array[0]+array[1]>sum||array[length-1]+array[length-2]<sum)
            return result;

        for(int i=0;i<length;i++){
            int pos;
            if((pos=Arrays.binarySearch(array,sum-array[i]))>=0){
                result.add(array[i]);
                result.add(array[pos]);
                return result;
            }
        }
        return result;
    }
}