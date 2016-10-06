package nowcode;

/**
 * Created by dyr on 2016/10/3.
 */
public class LastRemaining_Solution {
}

class Solution46 {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = 1;
        }
        int count = 0;
        int i = 0;
        int remain = n;
        while (remain > 1) {
            if (list[i] == 1) {
                count++;
                if (count == m) {
                    count = 0;
                    list[i] = -1;
                    remain--;
                }
            }
            i++;
            i %= n;
        }
        for(int j=0;j<n;j++){
            if(list[j]==1)
                return j;
        }
        return -1;
    }
    public int Sum_Solution(int n) {
        int result=n;
        boolean temp=n!=0&&(result=Sum_Solution(n-1))>0;
        return result;
    }
}