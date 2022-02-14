package coding.planet;
import java.util.*;
//통장 입출금
public class two {
    class Solution {
        public int[] solution(int[] deposit) {
            Stack<Integer> st = new Stack<>();

            for(int i : deposit){
                if(i>0){
                    st.push(i);
                }else{
                    int num = i;
                    while(!st.isEmpty()){
                        int tmp = st.pop();
                        if(tmp+num>0){
                            st.push(tmp+num);
                            break;
                        }else{
                            num= num+tmp;
                        }
                    }
                }
            }
            int[] answer = new int[st.size()];
            for(int i=st.size()-1;i>=0;i--){
                answer[i]=st.pop();
            }


            return answer;


        }
    }
}
