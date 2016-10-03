package nowcode;

/**
 * Created by dyr on 2016/10/3.
 */
public class LeftRotateString {
    public static void main(String[] args) {
        Solution43 solution43=new Solution43();
        System.out.println(solution43.LeftRotateString("abcXYZdef",3));
    }
}
class Solution43 {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()<1)
            return str;
        if(n<1||n>str.length())
            return  str;
        return str.substring(n)+str.substring(0,n);
    }
}