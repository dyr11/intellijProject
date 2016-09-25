package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class JumpFloorII {
    public static void main(String[] args) {
        Solution8 solution8=new Solution8();
        for(int i=1;i<10;i++){
            System.out.println(i+" : "+solution8.JumpFloorII(i));
        }
    }
}

class Solution8 {
    public int JumpFloorII(int target) {
        return (int)Math.pow(2,target-1);
    }
}
