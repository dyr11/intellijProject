package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class NumberOf1 {
    public static class Solution {
        public int NumberOf1(int n) {
            int count=0;
            while (n!=0){
                if((n&1)!=0){
                    count++;
                }
                n>>>=1;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.NumberOf1(-1));
    }
}
