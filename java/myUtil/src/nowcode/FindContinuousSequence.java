package nowcode;

/**
 * Created by dyr on 2016/10/3.
 */

import java.util.ArrayList;

public class FindContinuousSequence {
}

class Solution41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum < 2)
            return result;
        int from = 0;
        ArrayList<Integer> validArray;
        for (int i = 2; (sum * 2 / i - i + 1) / 2 > 0; i++) {
            if (sum * 2 % i == 0 && ((sum * 2 / i - i + 1) % 2 == 0)) {
                from = (sum * 2 / i - i + 1) / 2;
                validArray = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    validArray.add(from + j);
                }
                result.add(0, validArray);
            }
        }
        return result;
    }
}