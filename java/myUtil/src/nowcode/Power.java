package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class Power {
    public static class Solution {
        public double Power(double base, int exponent) {
            if(exponent==0)
                return 1;
            boolean flag=false;
            if(exponent<0){
                flag=true;
                exponent*=-1;
            }
            double result=1;
            for(int i=0;i<exponent;i++){
                result*=base;
            }
            return flag?1/result:result;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.Power(2,-3));
    }
}
