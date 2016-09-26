package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Stack;

public class IsPopOrder {
    public static void main(String[] args) {
        Solution_IsPopOrder solution_isPopOrder = new Solution_IsPopOrder();
        int pushA[] = {1, 2, 3, 4, 5};
        int popA[] = {4, 5, 3, 2, 1};
        int popB[] = {4, 3, 5, 1, 2};
        System.out.println(solution_isPopOrder.IsPopOrder(pushA, popA));
        System.out.println(solution_isPopOrder.IsPopOrder(pushA, popB));
    }
}

class Solution_IsPopOrder {
    Stack<Integer> stack = new Stack<>();

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        int pos = 0, prePos = 0;
        for (int i = 0; i < popA.length; i++) {
            if (!stack.isEmpty() && stack.peek() == popA[i])
                stack.pop();
            else {

                pos = findPos(pushA, popA[i], prePos);
                if (pos == -1)
                    return false;

                for (; prePos < pos; prePos++) {
                    stack.push(pushA[prePos]);
                }
                prePos = pos + 1;
            }

        }
        return true;
    }

    public int findPos(int arr[], int target, int startPos) {
        for (int i = startPos; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
