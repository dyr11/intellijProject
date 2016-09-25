package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
import java.util.Stack;

public class minValueInStack {
}

class Solution_minValueInStack {
    Stack<Integer> min=new Stack<>();
    Stack<Integer> value=new Stack<>();

    public void push(int node) {
        value.push(node);
        if(min.isEmpty()||min.peek()>=node){
            min.push(node);
        }
    }

    public void pop() {
        int top=value.pop();k
        if(min.peek()==top)
            min.pop();
    }

    public int top() {
        return value.peek();
    }

    public int min() {
        return min.peek();
    }
}