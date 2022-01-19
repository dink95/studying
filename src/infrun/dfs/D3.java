package infrun.dfs;

import java.util.Scanner;

public class D3 {

    static int result,max,n;
    static int[] time;
    static int[] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n= sc.nextInt();
        max = sc.nextInt();
        graph= new int[n];
        time= new int[n];

        for(int i=0;i<n;i++){
            graph[i]=sc.nextInt();
            time[i]=sc.nextInt();
        }


        D3 d =new D3();
        d.DFS(0,0,0);
        System.out.println(result);

    }

    private void DFS(int v,int score,int spend){
        if(spend>max)
            return;

        if(v==n){
            result= Math.max(result,score);

        }else{
            DFS(v+1,score+graph[v],spend+time[v]);
            DFS(v+1,score,spend);
        }
    }
}
