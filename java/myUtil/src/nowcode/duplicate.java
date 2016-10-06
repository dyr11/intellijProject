package nowcode;

/**
 * Created by dyr on 2016/10/5.
 */
public class duplicate {
    public static void main(String[] args) {
        Solution49 solution49=new Solution49();
        int arr[]={2,3,1,0,2,5,3};
        int result[]=new int[1];
        result[0]=-1;
        System.out.println(solution49.duplicate(arr,arr.length,result));
        System.out.println(result[0]);
    }
}

class Solution49 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length < 1)
            return false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= length)
                return false;
            if (numbers[i] != i) {
                int j=numbers[i];
                while(j!=i){
                    int value=numbers[j];
                    numbers[j]=j;
                    j=value;
                    if(numbers[j]==j){
                        duplication[0]=j;
                        return true;
                    }
                }
                numbers[i]=i;
            }
        }
        return false;
    }
}