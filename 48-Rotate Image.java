class Solution {
    public void rotate(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return;
        int row = matrix.length;
        int column = matrix[0].length;
        int n = matrix.length;
        for(int i =0; i<n/2; i++){
          for(int j =0; j<(n+1)/2; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[n-j-1][i];
            matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
            matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
            matrix[j][n-i-1]=temp;
          }
        }
        
    }
}
