package nowcode;

/**
 * Created by dyr on 2016/9/25.
 */
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;
import java.util.function.Function;

public class printMatrix {
    public static void main(String[] args) {
        Solution_printMatrix solution_printMatrix=new Solution_printMatrix();
        int matrix[][]=new int[4][3];
        int count=1;
        for(int i=0;i<4;i++ ){
            for(int j=0;j<3;j++){
                matrix[i][j]=count++;
            }
        }
        int matrix1[][]={{1},{2},{3},{4},{5}};
        ArrayList<Integer> result=solution_printMatrix.printMatrix(matrix1);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" \t");
        }

    }
}
class Solution_printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        int x=0,y=0,lengthX=matrix.length,lengthY=matrix[0].length;
        for(int i=0;i<(matrix.length+1)/2&&i<(matrix[0].length+1)/2;i++){
            for(int j=y;j<lengthY;j++){
                result.add(matrix[x][j]);
            }
            for(int j=x+1;j<lengthX;j++){
                result.add(matrix[j][lengthY-1]);
            }
            for(int j=lengthY-2;j>y&&x!=lengthX-1;j--){
                result.add(matrix[lengthX-1][j]);
            }
            for(int j=lengthX-1;j>x&&lengthY-1!=y;j--){
                result.add(matrix[j][y]);
            }
            x++;
            y++;
            lengthX--;
            lengthY--;
        }
        return result;
    }


}
