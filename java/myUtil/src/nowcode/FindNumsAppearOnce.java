package nowcode;

/**
 * Created by dyr on 2016/10/2.
 */
public class FindNumsAppearOnce {
}
class Solution39 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int xorResult=0;
        for(int i=0;i<array.length;i++){
            xorResult^=array[i];
        }
        int diff=xorResult^(xorResult-1);
        int numa=0,numb=0;
        for(int i=0;i<array.length;i++){
            if((array[i]&diff)!=0){
                numa^=array[i];
            }else{
                numb^=array[i];
            }
        }
        num1[0]=numa;
        num2[0]=numb;
    }
}
