package infrun.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String m = sc.next();

        Queue<Character> q = new LinkedList<>();

        for(int i=0;i<n.length();i++){
            q.offer(n.charAt(i));
        }

        for(int i=0;i<m.length();i++){

            if(!q.isEmpty()&&q.peek()==m.charAt(i)){
                q.poll();
            }
        }
        if(q.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
