package nowcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by dyr on 2016/10/6.
 */
public class maxInWindows {
    public static void main(String[] args) {
        Solution63 solution63=new Solution63();
        int arr[]={2,3,4,2,6,2,5,1};
        ArrayList<Integer> result=solution63.maxInWindows(arr,0);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }
}
class Solution63 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> result=new ArrayList<>();
        if(num==null||num.length<size||size<1){
            return result;
        }
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(size, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<size-1;i++){
            priorityQueue.add(num[i]);
        }
        for(int i=size-1;i<num.length;i++){
            priorityQueue.add(num[i]);
            result.add(priorityQueue.peek());
            priorityQueue.remove(num[i-size+1]);
        }
        return result;
    }
}