package infrun.recursive.dfsbfs;

import java.util.*;

public class R14 {

    static boolean visit[];
    static int dis[];
    static int n;
    static int m;

    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        visit=new boolean[n+1];
        dis=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        R14 r = new R14();

        r.BFS(1);
        for(int i=2;i<=n;i++){
            System.out.println(i+":"+dis[i]);
        }

    }

    public void BFS(int v){
        Queue<Integer> q = new LinkedList<>();
        visit[v]=true;
        dis[v]=0;
        q.offer(v);

        while(!q.isEmpty()){
            int cv = q.poll();

            for(int nv : graph.get(cv)){
                if(!visit[nv]) {
                    visit[nv] = true;
                    q.offer(nv);
                    dis[nv]=dis[cv]+1;
                }

            }

        }


    }
}
