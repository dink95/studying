package infrun2.sort;

import java.util.PriorityQueue;

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





    }
}
