package infrun.dfs;

import java.util.Scanner;

public class D2 {

    static int n,max;
    static int result;
    static int[] weight;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        max = sc.nextInt();
        n=sc.nextInt();


        weight= new int[n];
        for(int i=0;i<n;i++)
            weight[i]=sc.nextInt();

        D2 d2 = new D2();

        d2.DFS(0,0);
        System.out.println(result);
    }

    private void DFS(int s, int total){
        if(total==max){
            result=total;
            return;
        }


        if(s==n){
            if(total<=max&&result<total)
            {
                result=total;
            }
            return;
        }else {
            DFS(s+1,total+weight[s]);
            DFS(s+1,total);
        }

    }

}
