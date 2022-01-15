package infrun.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        Queue<Integer> q= new LinkedList<>();

        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        int result= 0,count=0;
        while(!q.isEmpty()){
            count++;
            if(count%k==0)
                result=q.poll();
            else{
                q.offer(q.poll());
            }
        }

        System.out.println(result);
    }
}
