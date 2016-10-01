package nowcode;

/**
 * Created by dyr on 2016/10/1.
 */
public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {
        Solution29 solution29=new Solution29();
        int arr[]={1,-2,3,10,-4,7,2,-5};
        System.out.println(solution29.FindGreatestSumOfSubArray(arr));
    }
}
class Solution29 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length<1)
            return 0;
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}