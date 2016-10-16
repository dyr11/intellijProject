package jindian;

/**
 * Created by dyr on 2016/10/16.
 *
 * 题目描述

 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，
 但不得将元素复制到别的数据结构中。
 给定一个int[] numbers(C++中为vector&ltint>)，其中第一个元素为栈顶，请返回排序后的栈。请注意这是一个栈，
 意味着排序过程中你只能访问到第一个元素。
 测试样例：
 [1,2,3,4,5]
 返回：[5,4,3,2,1]
 */
import java.util.*;

public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        ArrayList<Integer> result=new ArrayList<>();
        if(numbers==null){
            return result;
        }
        Stack<Integer>  stack=new Stack<>();
        for(int i=numbers.length-1;i>=0;i--){
            stack.push(numbers[i]);
        }
        Stack<Integer> tempStack=new Stack<>();
        while(!stack.isEmpty()){
            int top=stack.pop();
            while (!tempStack.isEmpty()&&tempStack.peek()>top){
                stack.push(tempStack.pop());
            }
            tempStack.push(top);
        }

        while (!tempStack.isEmpty()){
            result.add(tempStack.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        TwoStacks twoStacks=new TwoStacks();
        int arr[]={1,3,5,7,8,4,6,2};
        twoStacks.twoStacksSort(arr);
    }
}
