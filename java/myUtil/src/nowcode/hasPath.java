package nowcode;

/**
 * Created by dyr on 2016/10/6.
 */
public class hasPath {
    public static void main(String[] args) {
        char[] matrix="abcesfcsadee".toCharArray();
        char[] str="abcb".toCharArray();
        Solution64 solution64=new Solution64();
        System.out.println(solution64.hasPath(matrix,3,4,str));
    }
}
class Solution64 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix==null||rows<1||cols<1||matrix.length!=cols*rows||str==null||str.length<1)
            return false;
        char[][] arr=new char[rows+2][cols+2];
        int count=0;
        for(int i=1;i<rows+1;i++){
            for(int j=1;j<cols+1;j++){
                arr[i][j]=matrix[count++];
//                System.out.print(arr[i][j]+" ");
            }
//            System.out.println();
        }
        for(int i=1;i<rows+1;i++){
            for(int j=1;j<cols+1;j++){
                if(arr[i][j]==str[0]){
                    arr[i][j]='\0';
                    if(str.length==1||hasPath(arr,i,j,str,1)){
                        return true;
                    }
                    arr[i][j]=str[0];
                }
            }
        }
        return false;
    }
    private boolean hasPath(char[][] matrix,int rows, int cols,char[] str,int next){
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if(i+j==-1||i+j==1){
                    if(matrix[rows+i][cols+j]==str[next]){
                        if(next==str.length-1)
                            return true;
                        matrix[rows+i][cols+j]='\0';
                        if(hasPath(matrix,rows+i,cols+j,str,next+1)){
                            return true;
                        }
                        matrix[rows+i][cols+j]=str[next];
                    }
                }
            }
        }
        return false;
    }
}