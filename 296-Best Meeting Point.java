class Solution {
    public int minTotalDistance(int[][] grid) {
        List<Integer> row = new ArrayList<>();
        List<Integer> column = new ArrayList<>();
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] == 1){
                    row.add(i);
                    column.add(j);
                }                
            }            
        }

        return findMin(row) + findMin(column);
    }
    private int findMin(List<Integer> list){
        Collections.sort(list);
        int result = 0;
        int i = 0;
        int j = list.size()-1;
        while(j>i){
            result+= list.get(j)-list.get(i);
            j--;
            i++;
        }
        return result;
    }
}
