package nowcode;

/**
 * Created by dyr on 2016/9/24.
 */
public class maxNum_array {
    public static void main(String[] args) {
        int array[][] = {{
        0, 1, 3, 4, 5, 7, 8, 11, 13, 15, 18, 21, 24},{
        1, 4, 6, 8, 11, 12, 15, 17, 18, 20, 23,25,27},{
        4, 7, 8, 11, 14, 16, 18, 20, 21, 24,26,28,30},{
        5, 8, 10, 13, 15, 19, 21, 23, 24,  96, 97,100,105}
        }
        ;
        Solution111 solution = new Solution111();
        int test[] = {22};
        for (int i = 0; i < test.length; i++) {

            System.out.println(solution.Find(array, test[i]));
        }
    }
}

class Solution111 {
    public boolean Find(int[][] array, int target) {
        return find(array, target, 0, 0, array.length - 1, array[0].length - 1);
    }

    private boolean find(int[][] array, int target, int startX, int startY, int endX, int endY) {
        for(int i=startX;i<=endX;i++){
            for(int j=startY;j<=endY;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("==============================");
        if (endX < startX || endY < startY)
            return false;
        int x = startX, y = startY;
        int y1 = y = findPoint(array, target, startX, startY, endY, true, true);
        if (array[x][y] == target) {
            return true;
        }
        int x1 = x = findPoint(array, target, startX, startY, endX, false, true);
        if (array[x][y] == target) {
            return true;
        }
        int y2 = y = findPoint(array, target, x, startY, y, true, false);
        if (array[x][y] == target) {
            return true;
        }
        int x2 = x = findPoint(array, target, startX, y1, x, false, false);
        if (array[x][y] == target) {
            return true;
        }
        if (endX - startX < 2 || endY - startY < 2) {
            return false;
        } else {
            return find(array, target, x2, y2, x1, y1);
        }

    }

    int findPoint(int[][] array, int target, int startX, int startY, int end, boolean row, boolean less) {
        int start = row ? startX : startY;
        int begin = row ? startY : startX;
        int middle = 0;
        if (row && array[startX][end] < target)
            return end;
        if (!row && array[end][startY] < target)
            return end;
        if (row && array[startX][startY] > target)
            return startY;
        if (!row && array[startX][startY] > target)
            return startX;
        int x = -1, y = -1;
        while (end >= begin) {
            middle = (begin + end) / 2;
            x = row ? start : middle;
            y = row ? middle : start;
            if (array[x][y] > target) {
                end = middle - 1;
            } else if (array[x][y] < target) {
                begin = middle + 1;
            } else {
                return middle;
            }
        }
        if (array[x][y] < target)
            middle++;
        return less ? middle - 1 : middle;
    }
}