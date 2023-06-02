/* Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order. */

public class q7 {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(3);

        for (int i=0; i<ans.length; i++){
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        if (n == 0) {
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];
        int left = 0, right = n-1, top = 0, bottom = n-1, num = 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }
}
