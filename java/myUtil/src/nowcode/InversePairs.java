package nowcode;

import java.util.Arrays;

/**
 * Created by dyr on 2016/10/2.
 */
public class InversePairs {
    public static void main(String[] args) {
        Solution34 solution34=new Solution34();
        int[] arr={1,2,3,4,5,0};
        System.out.println(solution34.InversePairs(arr));
    }
}
class Solution34 {
    public int InversePairs(int [] array) {
        return(int) (inverseParis(array,0,array.length-1)%1000000007);
    }
    private long inverseParis(int[] array,int start,int end){
        if(end>start){
            int middle=(end+start)/2;
            return inverseParis(array,start,middle)+
                    inverseParis(array,middle+1,end)+
                    merge(array,start,end);
        }else{
            return 0;
        }
    }

    private long merge(int[] array, int start, int end) {
        if(end<=start)
            return 0;

        int middle=(end+start)/2;
        int[] left=Arrays.copyOfRange(array,start,middle+1);
        int[] right=Arrays.copyOfRange(array,middle+1,end+1);
        int i,j,k;
        long count=0;
        for(i=0,j=0,k=start;i<left.length&&j<right.length;k++){
            if(left[i]<right[j]){
                array[k]=left[i++];
                count+=j;
            }else{
                array[k]=right[j++];
            }
        }
        for(;i<left.length;i++){
            array[k++]=left[i];
            count+=right.length;
        }
        for(;j<right.length;j++){
            array[k++]=right[j];
        }
        return count;
    }
}
