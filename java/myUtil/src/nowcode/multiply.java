package nowcode;

/**
 * Created by dyr on 2016/10/5.
 */
import java.util.ArrayList;
public class multiply {
    public static void main(String[] args) {
        Solution50 solution50=new Solution50();
        int arr[]={1,2,3,4,5};
        solution50.multiply(arr);
    }
}
class Solution50 {
    public int[] multiply(int[] A) {
        if(A==null||A.length<1)
            return null;
        int length=A.length;
        int[] result=new int[length];
        int[] left=new int[length+1];
        int[] right=new int[length+1];
        left[0]=right[length]=1;
        for(int i=0;i<length;i++){
            left[i+1]=left[i]*A[i];
        }
        for(int i=length-1;i>=0;i--){
            right[i]=right[i+1]*A[i];
        }
        for(int i=0;i<length;i++){
            result[i]=left[i]*right[i+1];
        }
        return  result;
    }
}