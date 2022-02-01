package acmicpc;

import java.util.*;


public class Main1012
{
    static boolean[][]arr;
    static int result;
    static boolean visited[][];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            result=0;
            int row = sc.nextInt();
            int col = sc.nextInt();
            arr= new boolean[row][col];
            visited = new boolean[row][col];
            int count =sc.nextInt();
            for(int j=0;j<count;j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y]=true;
            }
            solution(row,col);
            System.out.println(result);
        }
    }

    static void solution(int x,int y){

        for(int i=0;i<x;i++)
            for(int j=0;j<y;j++){
                if(!visited[i][j]&&arr[i][j]){
                    BFS(i,j);
                    result++;
                }
            }
    }

    private static void BFS(int x, int y) {

        visited[x][y]=true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});

        while(!q.isEmpty()){

            int [] tmp = q.poll();
            int [][] trans = {{1,0},{-1,0},{0,1},{0,-1}};

            for(int i=0;i<4;i++){
                int px = tmp[0]+trans[i][0];
                int py = tmp[1]+trans[i][1];

                if(px>=0&&py>=0&&arr.length>px&&arr[0].length>py&&!visited[px][py]&&arr[px][py]){
                    visited[px][py]=true;
                    q.offer(new int[]{px,py});
                }

            }


        }
    }


}
