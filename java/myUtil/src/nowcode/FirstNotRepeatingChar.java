package nowcode;

/**
 * Created by dyr on 2016/10/2.
 */
public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        Solution33 solution33=new Solution33();
        System.out.println(solution33.FirstNotRepeatingChar("google"));
    }
}
class Solution33 {
    public int FirstNotRepeatingChar(String str) {
        int arr[]=new int['z'-'A'+1];
        for(int i=0;i<arr.length;i++)
            arr[i]=-1;
        for(int i=0;i<str.length();i++){
            int pos=str.charAt(i)-'A';
            if(arr[pos]==-1){
                arr[pos]=i;
            }else{
                arr[pos]=-2;
            }
        }
        int pos=str.length();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0&&arr[i]<pos)
                pos= arr[i];
        }
        return pos==str.length()?-1:pos;
    }
}
