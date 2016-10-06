package nowcode;

import java.util.Arrays;

/**
 * Created by dyr on 2016/10/3.
 */
public class isContinuous {
}
class Solution45 {
    public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length<1)
            return false;
        Arrays.sort(numbers);
        int k=0;
        for(;k<numbers.length&&numbers[k]==0;k++);
        if(k==4)
            return true;
        for(int i=k;i<numbers.length-1;i++)
            if(numbers[i]==numbers[i+1])
                return false;
        if(numbers[numbers.length-1]-numbers[k]<=4)
            return true;
        return false;
    }
}