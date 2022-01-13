package infrun.arrray;

import java.util.PriorityQueue;
import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int max = in.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int numbers[] = new int[max];
        for(int i=0;i<max;i++){
            int num = in.nextInt();
            pq.add(num);
            numbers[i]=num;
        }
        for(int i : numbers){

        }
    }
}
