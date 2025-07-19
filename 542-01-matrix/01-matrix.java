class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows=mat.length;
        int columns=mat[0].length;

        int [][]result=new int[rows][columns];
        Queue<int[]>queue=new LinkedList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(mat[i][j]==0){
                    result[i][j]=0;
                    queue.offer(new int[]{i,j});
                }else{
                    result[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        while(!queue.isEmpty()){
            int []cell=queue.poll();
            int row=cell[0];
            int column=cell[1];
            
            for(int [] dir: directions){
                int newRow=row +dir[0];
                int newColumn=column+dir[1];

                if(newRow>=0 && newRow<rows && newColumn>=0 && newColumn <columns){
                    if(result[newRow][newColumn]>result[row][column]+1){
                        result[newRow][newColumn]=result[row][column]+1;
                        queue.offer(new int[]{newRow,newColumn});
                    }
                }
            }
        }

        return result;




    }
}