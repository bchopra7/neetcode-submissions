class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

     int rows =  matrix.length;
     int columns = matrix[0].length;

     int l = 0;
     int r = rows*columns - 1;

     while(l <= r){

        int m = l + (r-l)/2;
        int rowNum = m / columns;
        int colNum = m % columns;
        if(matrix[rowNum][colNum] ==  target){
            return true;
        }
        else if(matrix[rowNum][colNum] > target){
            r = m - 1;
        }else{
            l = m + 1;
        }
     }

     return false;
     

    }
}
