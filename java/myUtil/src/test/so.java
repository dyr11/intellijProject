package test;


/**
 * Created by dyr on 2016/10/20.
 */
public class so {
    public int countT(String s) {
        String match = "yep";
        int count = 0, j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (match.charAt(j) == s.charAt(i)) {
                j++;
                if (j == 3) {
                    j = 0;
                    count++;
                }
            } else {
                j = 0;
            }
        }
        return count;
    }

    public int[][] mysort(int[][] matrix) {
        int column = matrix[0].length;
        int row = matrix.length;
        int array[] = new int[column * row];
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[count++] = matrix[i][j];
            }
        }
        count=0;
        java.util.Arrays.sort(array);
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j]=array[count++];
                }
            }else{
                for(int j=column-1;j>=0;j--){
                    matrix[i][j]=array[column++];
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        so so1 = new so();
        System.out.print(so1.countT("yepiloveyouyeloveyouverymuch"));
    }
}
