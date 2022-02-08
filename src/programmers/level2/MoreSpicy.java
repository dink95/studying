package programmers.level2;
import java.util.*;

public class MoreSpicy {
    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<scoville.length;i++){
                pq.offer(scoville[i]);
            }

            while(!pq.isEmpty()){
                if(pq.peek()<K){
                    int f = pq.poll();
                    if(pq.isEmpty())
                        return -1;
                    int s = pq.poll();
                    int sum = f+s*2;
                    pq.offer(sum);
                    answer++;
                }else
                    break;
            }

            return answer;
        }
    }
}
