package infrun.recursive.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class R8 {

    int [] path = {1,-1,5};
    int result =0;
    int [] check ;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();

        R8 r8 = new R8();
        System.out.println(r8.solution(start,end));
    }

    Queue<Integer> q = new LinkedList<>();
    public int solution(int start, int end){
        check= new int[10001];
        q.offer(start);

        int l=0; //level
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                int x =q.poll();

                if(x==end)
                    return l;

                for(int j=0;j<3;j++){
                    int leaf = x+path[j];

                    if(x==end) return l+1;//자식 노드를 구하는 것

                    if(leaf>=1&&leaf<=10000&&check[leaf]==0)//check==0이면 방문 x 이미 방문한 곳은 들리지 않는다
                    {
                        check[leaf]=1;
                        q.offer(leaf);
                    }
                }
            }
            l++;
        }


        return -1;
    }
}
