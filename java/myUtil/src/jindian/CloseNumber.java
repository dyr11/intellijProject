package jindian;

/**
 * Created by dyr on 2016/10/19.
 */

import java.util.*;

public class CloseNumber {
    public int[] getCloseNumber(int x) {
        // write code here
        int[] result=new int[2];
        int temp=x^(x-1)|x;
        if(x==1){
            result[0]=1<<31;
            result[1]=1<<1;
        }else if((x&(x-1))==0){
            result[0]=x>>1;
            result[1]=x<<1;
        }else if((x&(x+1))==0){
            result[0]=x+1+x>>1;
            result[1]=x<<1;
        }else if((temp&(temp+1))==0){
            result[0]=x-(x^(x-1)+1)>>1;
            result[1]=x<<1;
        }else{
            int in=0;
            int big,small;
            if(x%2==0){
                small=((x^(x-1))+1)>>2;
            }else {
                int p=((x^(x+1))+1)>>2;
                int t=x&(-(p<<1));
                //  t=(t-1)&t;
                small=((t^(t-1))+1)>>2;
                big=p;
            }

                result[0]=x-small;

        }
        return result;
    }

    public static void main(String[] args) {
        CloseNumber closeNumber=new CloseNumber();
        int result[]=closeNumber.getCloseNumber(76351);
        System.out.print(result[0]+","+result[1]);
    }
}