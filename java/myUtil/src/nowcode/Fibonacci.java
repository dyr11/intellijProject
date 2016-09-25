package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Solution7 solution7=new Solution7();
        for(int i=1;i<=39;i++){
            System.out.println(i+" : "+solution7.Fibonacci(i));
        }
    }
}

class Solution7 {
    public int Fibonacci(int n) {
        int arr[]=new int[40];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}
