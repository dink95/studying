package sort;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue();
        int[] sticks  = {1,8,2,5};

        for(int i : sticks){
            queue.offer(i);
        }
        int sum = 0;

        while(queue.size()>1){
            int two = queue.poll() + queue.poll();
            sum += two;
            queue.offer(sum);
        }

        System.out.println(sum);


        ArrayList<Queue<Integer>> ar = new ArrayList<>();



    }
}
