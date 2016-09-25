package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
import java.util.ArrayList;
public class minNumberInRotateArray {
    public static void main(String[] args) {
        Solution6 solution6=new Solution6();
        int arr[]={3,3,3,1,3,3,3,3,3,3};
        System.out.println(solution6.minNumberInRotateArray(arr));
    }
}
class Solution6 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length<0)
            return 0;
        if(array[0]<array[array.length-1])
            return array[0];
        int start=0,end=array.length-1;
        for(;array[end]==array[0];end--);
        int middle=0;
        while(end>=start){
            middle=(start+end)/2;
            if(array[middle]>=array[0]){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }
        return array[middle]>array[0]?array[middle+1]:array[middle];
    }
}
