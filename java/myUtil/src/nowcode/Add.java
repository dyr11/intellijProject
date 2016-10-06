package nowcode;

/**
 * Created by dyr on 2016/10/5.
 */
public class Add {
    public static void main(String[] args) {
        Solution47 solution47=new Solution47();
        System.out.println(solution47.Add(3,3));
    }
}

class Solution47 {
    public int Add(int num1, int num2) {
        int sum=num1^num2;
        int and=num1&num2;
        while(and!=0){
            and<<=1;
            int temp=sum;
            sum^=and;
            and&=temp;
        }
        return sum;
    }
}
