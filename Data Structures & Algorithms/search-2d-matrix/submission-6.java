class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // int ROWS = matrix.length;   // rows
        // int COLS = matrix[0].length; // cols

        int m = matrix.length;   // rows
        int n = matrix[0].length; // cols

        int l = 0;
        int r = m*n -1;

        while (l<=r){
            int mid = l + (r-l)/2;
            //IMPORTANT TO FIND WHERE ELEMENT IS LOCATED IN MATRIX
            int row = mid/n;
            int col = mid%n; 

             if(matrix[row][col] < target){
                l = mid+1;
            }
            else if(matrix[row][col] > target) {
                r = mid-1;
            }
            else  return true;
            
        }
        return false;
    }
}
