package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
public class RectCover {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + solution9.RectCover(i));
        }
    }

}

class Solution9 {
    public int RectCover(int target) {
        if (target <= 2)
            return target;
        int f1 = 1, f2 = 2, f3 = 0;
        for (int i = 3; i <= target; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
