package infrun.dfs;

import java.util.Scanner;

public class D1 {

    static int graph[];
    static String answer ="NO";
    static int n;
    static int total =0;
    static boolean flag = false;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        graph = new int[n];


        for(int i=0;i<n;i++){
            graph[i]= sc.nextInt();
            total+=graph[i];
        }

        D1 d1 = new D1();
        d1.DFS(0,0);

        System.out.println(answer);
    }

    private void DFS(int l, int sum){
        if(flag||(sum>total/2))
            return;

        if(l==n){
            if(sum==(total-sum)) {
                answer = "YES";
                flag=true;
            }
        }else{
            DFS(l+1,sum+graph[l]);//자신을 포함하는 경우
            DFS(l+1,sum);//포함 x 다음 원소로
        }
    }
}
