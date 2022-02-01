package acmicpc;

import java.util.Scanner;

public class Main2606 {

    static boolean[] visit;
    static boolean[][] arr;
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        arr = new boolean[n+1][n+1];
        visit = new boolean[n+1];
        for(int i=0;i<k;i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            arr[a][b]=true;
            arr[b][a]=true;
        }
        DFS(1);
        System.out.println(result);

    }

    public static void DFS(int v){


        visit[v]=true;
        for(int i=1;i<arr.length;i++){
            if(arr[v][i]&&!visit[i]){
                visit[i]=true;
                result++;
                DFS(i);
            }
        }


    }
}
