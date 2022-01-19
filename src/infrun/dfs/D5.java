package infrun.dfs;

import infrun.recursive.dfsbfs.R12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D5 {

    static int n,result=Integer.MAX_VALUE,m;
    static Integer ar [];//객체형으로 해야함
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ar = new Integer[n];

        for(int i=0;i<n;i++)
            ar[i]= sc.nextInt();

        m= sc.nextInt();
        Arrays.sort(ar, Collections.reverseOrder());
        D5 d = new D5();
        d.DFS(0,0);
        System.out.println(result);
    }

    private void DFS(int L,int sum){
        if(sum>m||L>=result)
            return;

        if(sum==m){
           result= Math.min(L, result);
        }else{
            for(int i=0;i<n;i++){
                DFS(L+1,sum+ar[i]);
            }

        }
    }
}
