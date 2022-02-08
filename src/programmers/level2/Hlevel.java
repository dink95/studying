package programmers.level2;
import java.util.*;

public class Hlevel {
    class Solution {
        public int solution(int[] citations) {
            int answer = citations.length;
            Arrays.sort(citations);
            for(int i=0;i<citations.length;i++){
                if(answer>citations[i])
                    answer--;
                else
                    break;

            }
            return answer;
        }
    }
}
