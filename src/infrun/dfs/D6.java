package infrun.dfs;

import java.util.Scanner;

public class D6 {

    static int n,m;
    static int ar [];
    static  int print[];
    static boolean check[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ar = new int[n];
        print = new int[m];
        check= new boolean[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }


        D6 d = new D6();

        d.DFS(0);

    }

    private void DFS(int l){
        if(m==l){
            for(int i : print)
                System.out.print(i+" ");
            System.out.println();
        }else{
            for(int i=0;i<n;i++){
                if(!check[i]){
                check[i]=true;
                print[l]=ar[i];
                DFS(l+1);
                check[i]=false;
                }
            }

        }


    }
}
