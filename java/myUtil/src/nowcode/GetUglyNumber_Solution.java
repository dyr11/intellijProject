package nowcode;

import java.util.Currency;

/**
 * Created by dyr on 2016/10/2.
 */
public class GetUglyNumber_Solution {
    public static void main(String[] args) {
        Solution31 solution31=new Solution31();
        int x=0;
        for(int i=0;i<10;i++){
            int result=solution31.GetUglyNumber_Solution(i);
            System.out.println(i+" : "+result);
            x++;
        }

    }
}
class Solution31 {
    public int GetUglyNumber_Solution(int index) {
        if(index<1)
            return 0;
        int result[]=new int[index];
        result[0]=1;
        int p2=0,p3=0,p5=0;
        for(int i=1;i<index;i++){
            int v2=result[p2]*2;
            int v3=result[p3]*3;
            int v5=result[p5]*5;
            int minv=v2<v3?v2:v3;
            minv=minv<v5?minv:v5;
            if(minv==v2) p2++;
            if(minv==v3) p3++;
            if(minv==v5) p5++;
            result[i]=minv;
        }
        return result[index-1];
    }
}
