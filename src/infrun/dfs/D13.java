package infrun.dfs;

import java.util.Scanner;

public class D13 {
    static int n,m;
    static int[][]board;
    static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } ,{1,1},{1,-1},{-1,1},{-1,-1}};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                board[i][j]=sc.nextInt();
        }
        System.out.println(solution());

    }

    static private int solution(){
        int answer =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                 DFS(i,j);
                }
            }
        }

        return answer;
    }

    static private void DFS(int x, int y){

        for(int[] d : dirs){
            int nx = d[0]+ x;
            int ny = d[1]+y;

            if(nx>=0&&nx<n&&ny>=0&&ny<n&&board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx,ny);
            }

        }

    }

}
