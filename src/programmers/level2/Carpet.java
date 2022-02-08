package programmers.level2;

public class Carpet {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];

            int sum = brown+yellow;
            for(int i=1;i<=sum;i++){
                int row = i;
                int col = sum/i;
                if(row>col)
                    continue;

                if((row-2)*(col-2)==yellow){
                    answer[0]=col;
                    answer[1]=row;
                    return answer;
                }

            }

            return answer;
        }
    }
}
