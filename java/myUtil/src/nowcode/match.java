package nowcode;

/**
 * Created by dyr on 2016/10/5.
 */
public class match {
    public static void main(String[] args) {
        Solution51 solution51=new Solution51();
        char str[]="bbbba".toCharArray();
        char pattern[]=".*a*a".toCharArray();
        System.out.println(solution51.match(str,pattern));
    }
}
class Solution51 {
    public boolean match(char[] str, char[] pattern)
    {
        int j=0;
        char before='\0';
        char strPre='\0';
        int count=0;
        int i;
        for(i=0;i<str.length&&j<pattern.length;i++){
            if(pattern[j]=='.'||pattern[j]==str[i]){
                if(strPre!=str[i]){
                    before=pattern[j];
                    strPre=str[i];
                    count=0;
                }
                j++;
            }else if(pattern[j]=='*'&&(before==str[i]||before=='.')){
                if(strPre!=str[i]){
                    before=pattern[j];
                    strPre=str[i];
                    count=1;
                }else{
                    count++;
                }
            }else if(pattern[j]=='*'){
                j++;
                i--;
            } else if(pattern[j]==before&&count>0){
                count--;
                j++;
            }else if(j+1<pattern.length&&pattern[j+1]=='*'){
                j+=2;
                i--;
                //before='\0';
            }else{
                return false;
            }
        }
        if(i!=str.length)
            return false;

        while(j<pattern.length){
            if(pattern[j]=='*'){
                j++;;
            }else if(j+1<pattern.length&&pattern[j+1]=='*'){
                j+=2;
            }else if(count>0&&pattern[j]==strPre){
                count--;
                j++;
            }else{
                return false;
            }
        }
        return true;
    }
}