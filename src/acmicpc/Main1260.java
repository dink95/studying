package acmicpc;

import java.util.*;

public class Main1260 {
    static int n,k;
    static boolean arr[][];
    static boolean visited[];
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

         n = sc.nextInt();
         k = sc.nextInt();
        int s = sc.nextInt();

        arr = new boolean[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0;i<k;i++){

            int v = sc.nextInt();
            int e = sc.nextInt();
            arr[v][e]=true;
            arr[e][v]=true;

        }

        DFS(s,0);
        System.out.println();
        BFS(s);
    }

    public static void DFS(int v, int l){
        System.out.print(v+" ");
        visited[v]=true;
        if(l==n){
            return;
        }
        for(int i=1;i<=n;i++){
            if(arr[v][i]&&!visited[i]){
                visited[i]=true;
                DFS(i,l+1);
            }
        }

    }
    public static void BFS(int v){
        Queue<Integer> q= new LinkedList<>();
        q.offer(v);

        boolean visit[] = new boolean[n+1];
        visit[v]=true;

        while(!q.isEmpty()){
            int  tmp= q.poll();
            System.out.print(tmp+" ");
            for(int i=1;i<=n;i++){
                if(!visit[i]&&arr[tmp][i]){
                    visit[i]=true;
                    q.offer(i);

                }
            }


        }

    }
}
