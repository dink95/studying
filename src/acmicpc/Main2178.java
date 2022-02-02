package acmicpc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2178 {

    static int n,m;
    static boolean[][] arr;
    static int[][] result;
    static int[][] pq = {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

         arr= new boolean[n+1][m+1];
         result = new int[n+1][m+1];
         for(int i=1;i<=n;i++){
             String s = sc.next();
             for(int j=1;j<=m;j++){
                 result[i][j]=s.charAt(j-1)-'0';
             }
         }
         BFS(1,1);

        System.out.println(result[n][m]);

    }


    private static void BFS(int x, int y){

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        arr[x][y]=true;
        while(!q.isEmpty()){
            int[] tmp = q.poll();

            for(int i=0;i<pq.length;i++){
                int px = tmp[0]+pq[i][0];
                int py = tmp[1]+pq[i][1];
                if(px>0&&py>0&&px<=n&&py<=m&&!arr[px][py]&&result[px][py]!=0){
                    result[px][py]=result[tmp[0]][tmp[1]]+1;
                    arr[px][py]=true;
                    q.offer(new int[]{px,py});
                }

            }
        }

    }


    //시간 초과

}
