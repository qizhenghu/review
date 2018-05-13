class Solution {
     public boolean isValidSudoku(char[][] board) {
         for(int i = 0; i < 9; i++){
            if(!isSubSudokuValid(board, i, i, 0, 8)) return false;
            if(!isSubSudokuValid(board, 0, 8, i, i)) return false;         
         }
         for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
              if(!isSubSudokuValid(board, i*3, i*3+2, j*3, j*3+2)) return false;
            }
         }
         return true;
     }
     
     public boolean isSubSudokuValid(char[][] board, int top, int bottom, int left, int right){
        Set<Character> set = new HashSet<>();
        for(int i = top; i <=bottom; i++){
          for(int j= left; j<=right; j++){
            char temp = board[i][j];
            if(temp!='.'){
              if(set.contain(temp)){
                return false;
              }else{
                set.add(temp);
              }              
            }
          }
        }
        return true;
     }
}
