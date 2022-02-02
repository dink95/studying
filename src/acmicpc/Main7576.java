package acmicpc;

import java.util.*;

public class Main7576 {

    static int [][]arr;
    static int n, m,result =0;
    static int[][] pos ={{1,0},{-1,0},{0,1},{0,-1}};
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        arr= new int[n][m];

        boolean zero = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1)
                    q.offer(new int[]{i, j});
                if(zero&&arr[i][j]==0)
                    zero=false;
            }
        }

        BFS();
        boolean flag = false;
        result =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                if(arr[i][j]==0){
                    flag=true;
                }
                result = Math.max(result,arr[i][j]);
            }
        }
        if(flag){
            System.out.println(-1);
        }else if(zero){
            System.out.println(0);
        }
        else{
            System.out.println(result-1);
        }

    }

    private static void BFS(){

        while(!q.isEmpty()){
            int[] tmp = q.poll();

            for(int i=0;i<4;i++){
                int px = tmp[0]+pos[i][0];
                int py = tmp[1]+pos[i][1];
                if(px>=0&&py>=0&&px<n&&py<m&&arr[px][py]==0){
                    arr[px][py]=arr[tmp[0]][tmp[1]]+1;
                    q.offer(new int[]{px,py});
                }
            }
        }
    }


}
