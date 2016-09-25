package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
import java.util.Stack;
public class stackToQueue {
    public static void main(String[] args) {
        Solution5 solution5=new Solution5();
        solution5.push(1);
        solution5.push(3);
        System.out.println(solution5.pop());
        solution5.push(7);
        System.out.println(solution5.pop());
        solution5.push(8);
        System.out.println(solution5.pop());
        System.out.println(solution5.pop());

    }
}

class Solution5 {
    Stack<Integer> pushStack = new Stack<Integer>();
    Stack<Integer> popStack = new Stack<Integer>();

    public void push(int node) {
        pushStack.push(node);
    }

    public int pop() {
        if(!popStack.empty())
            return popStack.pop();
        if(!pushStack.empty()){
            while(!pushStack.empty()){
                popStack.push(pushStack.pop());
            }
            return pop();
        }
        return popStack.pop();
    }
}
