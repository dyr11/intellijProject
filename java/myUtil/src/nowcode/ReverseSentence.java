package nowcode;

/**
 * Created by dyr on 2016/10/3.
 */
public class ReverseSentence {
    public static void main(String[] args) {
        String test="I am a student.";
        Solution44 solution44=new Solution44();
        System.out.println(solution44.ReverseSentence(test).equals(" I am a student."));
    }
}
//        牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
//        同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
//        例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
//        正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
class Solution44 {
    public String ReverseSentence(String str) {
        StringBuffer stringBuffer=new StringBuffer();
        if(str==null||str.trim().length()<1)
            return str;
        String[] substrs=str.trim().split(" ");
        for(int i=substrs.length-1;i>0;i--){
            stringBuffer.append(substrs[i]+" ");
        }
        if(substrs.length>0){
            stringBuffer.append(substrs[0]);
        }
        return stringBuffer.toString();
    }
}
