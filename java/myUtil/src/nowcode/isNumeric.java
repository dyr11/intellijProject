package nowcode;

/**
 * Created by dyr on 2016/10/5.
 */
public class isNumeric {
    public static void main(String[] args) {
        Solution52 solution52=new Solution52();
        System.out.println(solution52.isNumeric("-.123".toCharArray()));
    }
}
class Solution52 {
    public boolean isNumeric(char[] str) {
        String string=new String(str);
        string=string.toLowerCase();
        int ePos=string.indexOf('e');
        if(ePos==str.length-1){
            return false;
        } else if(ePos!=-1){
            return (ePos==0||isDecimal(string,0,ePos-1))&&isInteger(string,ePos+1,string.length()-1);
        }else{
            return isDecimal(string,0,string.length()-1);
        }
    }
    private boolean isUnsignedInteger(String str,int start,int end){
        if(end<start){
            return  true;
        }
        for(int i=start;i<=end;i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    private boolean isInteger(String str,int start,int end){
        if(end<start){
            return  true;
        }
        if(str.charAt(start)=='+'||str.charAt(start)=='-'){
            start++;
        }
        return isUnsignedInteger(str,start,end);

    }

    private boolean isDecimal(String str,int start,int end){
        int dotPos=str.indexOf('.',start);
        if(dotPos!=-1&&dotPos<=end){
            return isInteger(str,start,dotPos-1)&&isUnsignedInteger(str,dotPos+1,end);
        }else{
            return  isInteger(str,start,end);
        }

    }
}