package infrun.dfs;

import java.util.*;

public class D11 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static int board[][];
    static int dis[][];



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        board = new int[8][8];
        dis= new int[8][8];

        for(int i=1;i<8;i++){
            for(int j=1;j<8;j++)
                board[i][j]=sc.nextInt();
        }

        BFS(1,1);
        if(board[7][7]==0)
            System.out.println(-1);
        else
            System.out.println(dis[7][7]);
    }

    static private void BFS(int x, int y){

        Queue<Pos> q=  new LinkedList<>();

        q.offer(new Pos(x,y));
        board[x][y]=1;

        while (!q.isEmpty()){

            Pos tmp = q.poll();

            for(int i=0;i<4;i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if(nx>=1&&ny>=1&&nx<=7&&ny<=7&&board[nx][ny]==0)
                {
                    q.offer(new Pos(nx,ny));
                    board[nx][ny]=1;
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }


            }



        }

    }
}

class Pos{
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}