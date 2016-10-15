package nowcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dyr on 2016/10/7.
 */
public class movingCount {
    public static void main(String[] args) {
        Solution65 solution65 = new Solution65();
        System.out.println(solution65.movingCount(10, 1, 100));
    }
}

class Solution65 {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] matrix = new boolean[rows][cols];
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        queue.add(0);
        queue.add(0);
        matrix[0][0] = true;
        while (!queue.isEmpty()) {
            int row = queue.poll();
            int col = queue.poll();
            if (isValid(row, col, threshold)) {
                count++;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if ((i + j == 1 || i + j == -1) && col + j >= 0 && col + j <= cols - 1 &&
                                row + i >= 0 && row + i <= rows - 1 && !matrix[row + i][col + j]) {
                            queue.add(row + i);
                            queue.add(col + j);
                            matrix[row + i][col + j] = true;
                        }
                    }
                }
            }
        }
        return count;
    }

    private boolean isValid(int row, int col, int k) {
        return getDigitalSum(row) + getDigitalSum(col) <= k;
    }

    private int getDigitalSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}