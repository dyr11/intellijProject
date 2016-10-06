package nowcode;

/**
 * Created by dyr on 2016/10/5.
 */
public class StrToInt {
    public static void main(String[] args) {
        Solution48 solution48=new Solution48();
        System.out.println(solution48.StrToInt("-123asdz"));

    }
}
class Solution48 {
    public int StrToInt(String str) {
        if(str==null||str.trim().length()<1)
            return 0;
        boolean flag=true;
        if(str.startsWith("+")){
            flag=true;
            str=str.substring(1);
        }else if(str.startsWith("-")){
            flag=false;
            str=str.substring(1);
        }

        if(str.replaceAll("[^\\d]","xx").length()!=str.length())
            return 0;

        int result=0;
        int bit=1;
        for(int i=str.length()-1;i>=0;i--){
            result+=(str.charAt(i)-'0')*bit;
            bit*=10;
        }
        return  flag?result:-result;
    }
}
