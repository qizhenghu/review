class Solution {
   public int maxKilledEnemies(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;        
        int[] columnCount = new int[grid[0].length];        
        int rowCount = 0;
        int result = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i==0 || grid[i-1][j] == 'W'){                    
                    int num =0;
                    for(int k = i; k < grid[0].length && grid[i][k]!='W'; k++){
                        if(grid[i][k]=='E') num++;
                    }  
                    columnCount[j] = num;
                }
                if(j==0 || grid[i][j-1] == 'W'){
                    int num =0;
                    for(int k = j; k < grid.length && grid[k][j]!='W'; k++){
                        if(grid[k][j]=='E') num++;
                    }      
                    rowCount = num;
                }
                if(grid[i][j]=='0')result = Math.max(result, rowCount + columnCount[j]);
            }
            
        }
        
        return result;
    }
}
