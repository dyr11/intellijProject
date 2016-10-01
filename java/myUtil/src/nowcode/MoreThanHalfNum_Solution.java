package nowcode;

import java.util.Arrays;

/**
 * Created by dyr on 2016/9/28.
 */
public class MoreThanHalfNum_Solution {
    public static void main(String[] args) {
        Solution28 solution28=new Solution28();
        int arr[]={1,2,3,3,2,1,2,2,2};
        System.out.println(solution28.MoreThanHalfNum_Solution(arr));
    }
}
class Solution28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length<1)
            return 0;
        int temp[]=Arrays.copyOf(array,array.length);
        int length=temp.length;
        while(length>1){
            int count=0;
            for(int i=0;i+1<length;i+=2){
                if(temp[i]==temp[i+1]){
                    temp[count++]=temp[i];
                }
            }
            if(length%2==1){
                temp[count++]=temp[length-1];
            }
            length=count;
        }
        int count=0,num=temp[0];
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                count++;
            }
        }
        if(count>array.length/2)
            return num;
        else
            return 0;
    }
}