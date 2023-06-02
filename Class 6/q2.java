/* You are given an m x n integer matrix matrix with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.

You must write a solution in O(log(m * n)) time complexity. */

public class q2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        if(searchMatrix(matrix, target)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int n = matrix[i].length - 1;
            // Finding that row.
            if(target <= matrix[i][n]){
                // Binary Search
                int start = 0;
                int end = n;
                while(start <= end){
                    int mid = start + (end - start)/2;
                    if(matrix[i][mid] == target)
                        return true;
                    else if(matrix[i][mid] < target){
                        start = mid + 1;
                    }else{
                        end = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
