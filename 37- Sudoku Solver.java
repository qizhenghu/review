class Solution {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length !=9 || board[0].length!=9) return;
        backtracking(board);
    }
    private boolean backtracking(char[][] board){
      for(int i = 0; i < 9; i++){
        for(int j = 0; j < 9; j++){
          if(board[i][j] == '.'){
            for(char c = '1'; c <='9'; c++){
              if(isValid(board, i, j, c)){
                board[i][j] = c;
                if(backtracking(board)) {
                  return true;
                }else{
                  board[i][j] = '.';
                }                
              }              
            }
            return false;
          }
        }    
      }
      return true;
    }
    private boolean isValid(char[][] board, int row, int column, char c){
      for(int i = 0; i < 9; i++){
        if(board[row][i]==c) return false;
        if(board[i][column]==c) return false;
      }
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          if(board[row-row%3+i][column-column%3+j] == c) return false;
        }
        
      }
      return true;
    }
}
