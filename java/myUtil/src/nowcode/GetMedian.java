package nowcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dyr on 2016/10/6.
 */
public class GetMedian {
    public static void main(String[] args) {
        Solution62 solution62=new Solution62();
        for(int i=0;i<10;i++){
            solution62.Insert(i);
            System.out.println(solution62.GetMedian());
        }
    }
}
class Solution62 {
    ArrayList<Integer> arrayList=new ArrayList<>();
    public void Insert(Integer num) {
        arrayList.add(num);
    }

    public Double GetMedian() {
        Collections.sort(arrayList);
        int length=arrayList.size();
        if(length%2==1){
            return (double)arrayList.get(length/2);
        }else{
            return (arrayList.get(length/2)+arrayList.get(length/2-1))/2.0;
        }
    }

}