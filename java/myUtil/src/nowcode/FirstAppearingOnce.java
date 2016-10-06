package nowcode;

import java.util.Arrays;

/**
 * Created by dyr on 2016/10/5.
 */
public class FirstAppearingOnce {
}
class Solution53 {
    //Insert one char from stringstream
    int count=0;
    int[] array=new int[128];
    {
        for(int i=0;i<array.length;i++){
            array[i]=-1;
        }
    }
    public void Insert(char ch)
    {
        if(array[ch]==-1){
            array[ch]=count++;
        }else{
            array[ch]=-2;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int pos= count;
        char first='\0';
        for(int i=0;i<array.length;i++){
            if(array[i]>=0&&array[i]<pos){
                pos=array[i];
                first=(char)i;
            }
        }
        return pos==count?'#':first;
    }
}