package infrun2.dp;

import java.util.LinkedList;
import java.util.Queue;

public class dp02 {
    public static void main(String[] args) {

        char[][] grid = {
                { '1', '1', '0', '0', '1' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' },
                { '0', '0', '0', '1', '1' } };
        dp02 a = new dp02();
        System.out.println(a.solve(grid));
    }

    int [][] dirs ={{-1,0},{1,0},{0,-1},{0,1}};
    int m,n;

    private  int solve(char[][] grid) {


        if(grid==null|| grid.length==0||grid[0].length==0)
            return 0;

        m=grid.length ;
        n= grid[0].length;

        int count =0;
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1')
                    count++;

                bfs(grid, i, j);


            }
        }
        return count;
    }

    private void bfs(char[][] grid, int i, int j) {
        grid[i][j]='X';
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{i,j});
        while(!queue.isEmpty()){

            int[] cur = queue.poll();
            for(int[]dir : dirs){
                int x1= cur[0]+dir[0];
                int y1= cur[1]+dir[1];

                if(x1>=0&&y1>=0&&x1<m&&y1<n&&grid[i][j]=='1'){

                    grid[x1][y1] = 'X';
                    queue.offer(new int[]{x1,y1});
                }

            }

        }


    }



}

