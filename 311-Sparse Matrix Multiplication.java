class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int AR = A.length;
        int AC = A[0].length;
        int BR = B.length;
        int BC = B[0].length;
        int[][] result = new int[AR][BC];
        for(int i=0; i< AR; i++){
          for(int j=0; j<AC; j++){
            if(A[i][j]!=0){
              for(int k=0; k< BR; k++){
                result[i][j] += B[k][j]*A[i][k];
              }
            }
          }
        }
        return result;
    }
}
