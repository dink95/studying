package coding.planet;
import java.util.*;

public class one {
    class Solution {
        public int solution(int[] t, int m) {
            int answer = 0;
            Arrays.sort(t);
            for(int i=0;i<m;i++)answer+=t[i]+1;


            return answer;
        }
    }
}
