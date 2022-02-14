package coding.planet;
import java.util.*;
//상하의 문제
public class three {
    class Solution {
        public int solution(String[] color, int[] prices) {
            int answer = 0;
            Map<Character,Integer> map = new HashMap<>();//상의
            Map<Character,Integer> map2 = new HashMap<>();//하의
            map.put('B',0);map.put('W',0);map.put('R',0);map.put('Y',0);
            map.put('G',0);
            map2.put('B',0);map2.put('W',0);map2.put('R',0);map2.put('Y',0);
            map2.put('G',0);
            for(String s : color){
                char o = s.charAt(0);
                char w = s.charAt(1);
                map.put(o,map.get(o)+1);
                map2.put(w,map2.get(w)+1);
            }

            int left=0;
            for(Character c : map.keySet()){
                //System.out.println(map.get(c)+":"+map2.get(c)+":"+c);
                if(map.get(c)==0&&map2.get(c)==0)
                    continue;
                if(map.get(c)==0&&map2.get(c)!=0){
                    left+=map2.get(c);
                    continue;
                }
                if(map.get(c)!=0&&map2.get(c)==0){
                    left+=map.get(c);
                    continue;
                }

                int tmp =Math.abs(map.get(c)-map2.get(c));
                //System.out.println(tmp);
                if(tmp==0)answer+=map.get(c)*prices[0];
                else if(tmp>0){
                    left+=tmp;
                    if((map.get(c)+map2.get(c))-tmp>0)
                        answer+=((map.get(c)+map2.get(c))/2)*prices[0];
                }

            }
            //System.out.println(left);
            if(left*prices[0]>left/2*prices[1])answer+=(left/2*prices[1]);
            else answer+=(left*prices[0]);

            return answer;
        }
    }

}
