package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1697 {
    static int N,K,ans;
    static int[] visited = new int[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        if(N==K) {
            System.out.println(0);
            System.exit(0);
        }

        BFS();
        System.out.println(visited[K]);
    }

    private static void BFS(){
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);


        while(!q.isEmpty()){
            int tmp = q.poll();
            if(tmp==K)
                break;
            if(tmp>0&&visited[tmp-1]==0){
                q.offer(tmp-1);
                visited[tmp-1]=visited[tmp]+1;
            }
            if(tmp*2<100001&&visited[tmp*2]==0){
                q.offer(tmp*2);
                visited[tmp*2]=visited[tmp]+1;
            }
            if(tmp+1<100001&&visited[tmp+1]==0){
                q.offer(tmp+1);
                visited[tmp+1]=visited[tmp]+1;
            }



        }

    }
}
