package nowcode;

import java.util.ArrayList;

/**
 * Created by dyr on 2016/9/28.
 */
public class GetLeastNumbers_Solution {
    public static void main(String[] args) {
        Solution19 solution19=new Solution19();
        int[] arr={2,42,45,32,35,65,72,3};
        solution19.GetLeastNumbers_Solution(arr,6);
    }
}
class Solution19 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        if(input.length<1)
            return result;
        if(k>input.length)
            return result;
        for(int i=k/2;i>=0;i--){
            leadpDown(input,k,i);
        }

        for(int i=k;i<input.length;i++){
            if(input[0]>input[i]){
                input[0]=input[i];
                leadpDown(input,k,0);
            }
        }
        for(int i=k-1;i>0;i--){
            int temp=input[0];
            input[0]=input[i];
            input[i]=temp;
            leadpDown(input,i,0);
        }
        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return  result;
    }
    private void leadpDown(int[] input,int length,int parent){
        int temp=input[parent];
        int child;
        while(parent*2+1<length){
            child=parent*2+1;
            if(child+1<length&&input[child]<input[child+1])
                child++;
            if(temp<input[child]){
                input[parent]=input[child];
                parent=child;
            }else{
                break;
            }

        }
        input[parent]=temp;
    }

}
