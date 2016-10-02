package nowcode;

/**
 * Created by dyr on 2016/10/2.
 */
public class GetNumberOfK {
    public static void main(String[] args) {
        Solution36 solution36=new Solution36();
        int arr[]={};
        System.out.println(solution36.GetNumberOfK(arr,3));
    }
}
class Solution36 {
    public int GetNumberOfK(int [] array , int k) {
        int end=array.length-1;
        if(end<0||array[0]>k||array[end]<k)
            return 0;
        int start=0;
        int middle=(start+end)/2;
        while(start<=end){
            middle=(start+end)/2;
            if(array[middle]>k){
                end=middle-1;
            }else if(array[middle]<k){
                start=middle+1;
            }else{
                int count=0;
                for(int i=middle;i<array.length&&array[i]==k;i++)count++;
                for(int i=middle-1;i>=0&&array[i]==k;i--)count++;
                return count;
            }
        }

        return 0;
    }
}