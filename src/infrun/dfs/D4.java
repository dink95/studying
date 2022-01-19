package infrun.dfs;

import java.util.Scanner;

public class D4 {


     static int n,m;
    static int ar [];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ar = new int[m];

        D4 d = new D4();

        d.DFS(0);

    }

    private void DFS(int l){
        if(m==l){
            for(int i : ar)
                System.out.print(i+" ");
            System.out.println();
        }else{
            for(int i=1;i<=n;i++){
                ar[l]=i;
                DFS(l+1);
            }

        }


    }
}
