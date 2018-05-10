class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        while(low<=high){
          int mid = (high-low)/2 + low;
          int count = countRank(matrix, mid);
          if(count < k){
            low = mid+1;
          }else{
            high = mid-1;
          }
        }
        return low;
    }
    
    public int countRank(int[][] matrix, int value){
      int i = matrix.length-1;
      int j = 0;
      int result = 0;
      while(i>=0 && j<matrix[0].length){
        if(value < matrix[i][j]){         
          i--;
        }else{
          result+=i+1;
          j++;
        }
      }
      return result;
    }
}
