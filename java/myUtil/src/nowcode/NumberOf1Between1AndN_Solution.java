package nowcode;

/**
 * Created by dyr on 2016/10/1.
 */
public class NumberOf1Between1AndN_Solution {
    public static void main(String[] args) {
        Solution30 solution30=new Solution30();
        for(int i=0;i<30;i++){
            System.out.println(i+" : "+solution30.NumberOf1Between1AndN_Solution(i));
        }
    }
}
class Solution30 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        int left,right,current,num=1;
        while(n/num>0){
            left=n/(num*10);
            right=n%num;
            current=n/num%10;
            if(current==0){
                count+=left*num;
            }else if(current==1){
                count+=left*num+right+1;
            }else{
                count+=(left+1)*num;
            }
            num*=10;
        }
        return count;
    }
}
