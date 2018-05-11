class Solution {
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
      visited = new boolean[board.length][board[0].length];
      for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[0].length; j++){
          if(board[i][j] == word.charAt(0) && findWord(board, word, 0, i, j)) return true;
        }
      }
      return false;
    }
    
    public boolean findWord(char[][] board, String word, int index, int i, int j){
      if(index == word.length()) return true;
      if(i<0 || i >board.length-1 || j <0 || j>board[0].length-1||word.charAt(index) != board[i][j]||visted[i][j]) return false;
      visited[i][j] = true;
      if(findWord(board, word, index+1, i-1,j)||findWord(board, word, index+1, i,j-1)
      ||findWord(board, word, index+1, i+1,j)||findWord(board, word, index+1, i,j+1)) return true;
      visited[i][j] = false;
      return false;
    }
}
