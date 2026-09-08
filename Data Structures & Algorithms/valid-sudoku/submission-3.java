class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                String row = board[i][j] + "found in row " + i;
                String column = board[i][j] + "found in column " + j;
                String box = board[i][j] + "found in box " + i/3 + "_" + j/3 ;

                if(set.contains(row) || set.contains(column) || set.contains(box)){
                    return false;
                }

                set.add(row);
                set.add(column);
                set.add(box);
                
            }
        }
        return true;

    }
}
