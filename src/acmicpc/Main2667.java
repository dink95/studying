package acmicpc;

import java.util.*;

public class Main2667 {

    static int arr[][];
    static boolean visited[][];
    static int n;
    static int[][] p = {{-1,0},{1,0},{0,1},{0,-1}};
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

        visited= new boolean[n][n];
        arr = new int[n][n];

        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<n;j++){
                arr[i][j]=s.charAt(j)-'0';
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]&&arr[i][j]==1)
                    BFS(i,j);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int i : result){
            System.out.println(i);
        }

    }

    public static void BFS(int a, int b){

        int count=1;
        Queue<Pos> q = new LinkedList<>();

        q.offer(new Pos(a,b));
        visited[a][b]=true;
        while(!q.isEmpty()){

            Pos tmp = q.poll();
            for(int i=0;i<p.length;i++){
             int px = tmp.x + p[i][0];
             int py = tmp.y + p[i][1];

             if(px>=0&&py>=0&&px<n&&py<n&&!visited[px][py]&&arr[px][py]==1){
                 q.offer(new Pos(px,py));
                 visited[px][py]=true;
                 count++;
             }


            }
        }

        result.add(count);
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
