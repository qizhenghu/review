class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null||matrix.length ==0 || matrix[0].length == 0) return false;
        int row = matrix.length;
        int column = matrix[0].length;
        int low = 0;
        int high = row*column-1;
        
        while(low <=high){
            int mid = (high-low)/2+low;
            int number = matrix[mid/column][mid%column];
            if(number == target) return true;
            if(number < target){ 
                low = mid+1;
            }else{
                high = mid-1;
            }   
        }
        return false;
    }
}
