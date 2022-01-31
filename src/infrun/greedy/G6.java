package infrun.greedy;

import java.util.Scanner;

public class G6 {

    static int[] unf;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        unf=new int[n+1];
        for(int i=1; i<=n; i++) unf[i]=i;
        for(int i=1; i<=m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            Union(a, b);
        }
        int a=kb.nextInt();
        int b=kb.nextInt();
        int fa=Find(a);
        int fb=Find(b);

//        for(int i=1;i<=n;i++)
//        System.out.print(unf[i]+" ");

        if(fa==fb) System.out.println("YES");
        else System.out.println("NO");
    }

    ///암기 서로소 문제
    private static void Union(int a, int b) {
        int fa= Find(a);
        int fb = Find(b);

        if(fa!=fb)
            unf[fa]=fb;

    }

    private static int Find(int v) {
    if(unf[v]==v) return v;
    else  return unf[v]=Find(unf[v]);
    }

}
