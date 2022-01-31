package infrun.greedy;

import java.util.*;

public class G7 {
    static int[] udf;
    public static void main(String[] args) {

            Scanner kb = new Scanner(System.in);
            int n=kb.nextInt();
            int m=kb.nextInt();
            udf=new int[n+1];
            ArrayList<Edge> arr=new ArrayList<>();
            for(int i=1; i<=n; i++) udf[i]=i;
            for(int i=0; i<m; i++){
                int a=kb.nextInt();
                int b=kb.nextInt();
                int c=kb.nextInt();
                arr.add(new Edge(a, b, c));
            }
            int answer=0;
            Collections.sort(arr);

            for(Edge e : arr){
                int f1 = Find(e.v1);
                int f2 = Find(e.v2);

                if(f1!=f2){
                    Union(e.v1,e.v2);
                    answer+=e.cost;
                }
            }

        System.out.println(answer);



    }

    public static int Find(int v){
        if(v==udf[v])return v;
        else return udf[v]=Find(udf[v]);
    }

    public static void Union(int a, int b){
        int fa= Find(a);
        int fb = Find(b);
        if(fa!=fb)
            udf[fa]=fb;
    }
}


class Edge implements Comparable<Edge>{

    int v1;
    int v2;
    int cost;

    Edge(int v1,int v2,int cost){
        this.v1= v1;
        this.v2= v2;
        this.cost = cost;
    }
    public int compareTo(Edge e){
        return this.cost - e.cost;
    }

}