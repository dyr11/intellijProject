package nowcode;

/**
 * Created by dyr on 2016/9/27.
 */
import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Solution25 solution25=new Solution25();
        ArrayList<String> result=solution25.Permutation("");
        for (int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}
class Solution25 {
    public ArrayList<String> Permutation(String str) {
        char charArray[]=str.toCharArray();
        Arrays.sort(charArray);
        HashSet<String> hashSet=new HashSet<>();
        permutation(charArray,0,charArray.length,hashSet,0);
        ArrayList<String> result=new ArrayList<>(hashSet);
        Collections.sort(result);
        return result;
    }

    private void permutation(char[] charArray, int start, int length, HashSet<String>  result,int ins) {
        if(length<1)
            return ;

        if(start==length-1) {
            result.add(new String(charArray));
            return;
        }else{
            permutation(charArray,start+1,length,result,start+1);
        }

        for(int i=start+1;i<length;i++){
            if(charArray[i]!=charArray[start]){
                exchange(charArray,i,start);
                permutation(charArray,start+1,length,result,i);
                exchange(charArray,i,start);
            }
        }
    }
    private void exchange(char arr[],int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

