package nowcode;

/**
 * Created by dyr on 2016/10/1.
 */
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PrintMinNumber {
    public static void main(String[] args) {
        Solution32 solution32=new Solution32();
        int arr[]={3,32,321};
        System.out.println(solution32.PrintMinNumber(arr).equals("321323"));
        System.out.println(solution32.PrintMinNumber(arr));
    }
}

class Solution32 {
    public String PrintMinNumber(int [] numbers) {
        for(int i=0;i<numbers.length;i++){
            int pos=i;
            for(int j=i+1;j<numbers.length;j++){
                if(compare(numbers[j],numbers[pos])<0){
                    pos=j;
                }
            }
            if(pos!=i){
                int temp=numbers[i];
                numbers[i]=numbers[pos];
                numbers[pos]=temp;
            }
        }
        String result="";
        for(int i=0;i<numbers.length;i++){
            result+=numbers[i];
        }
        return result;
    }
    private int compare(int a,int b) {
        String ab = a + "" + b;
        String ba = b + "" + a;
        return ab.compareTo(ba);
    }
}
