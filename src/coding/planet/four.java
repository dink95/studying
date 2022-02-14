package coding.planet;
//3인가위바위보
public class four {
    class Solution {
        int[] r = new int[3];
        public int[] solution(String[] rsp3) {
            for(String s : rsp3){
                char o = s.charAt(0);
                char w = s.charAt(1);
                char t = s.charAt(2);
                if(o==w&&o==t)//같은 경우
                    continue;
                if(o!=w&&o!=t&&w!=t)
                    continue;
                if(o==w&&o!=t) //1 &2 same
                {
                    if(o=='S'&&t=='R')r[2]+=2;
                    else if(o=='R'&&t=='P')r[2]+=2;
                    else if(o=='P'&&t=='S')r[2]+=2;
                    else if(o=='S'&&t=='P')check(0,1);
                    else if(o=='R'&&t=='S')check(0,1);
                    else if(o=='P'&&t=='R')check(0,1);

                }else if(o!=w&&o==t)//1 &3 same
                {
                    if(o=='S'&&w=='R')r[1]+=2;
                    else if(o=='R'&&w=='P')r[1]+=2;
                    else if(o=='P'&&w=='S')r[1]+=2;
                    else if(o=='S'&&w=='P')check(0,2);
                    else if(o=='R'&&w=='S')check(0,2);
                    else if(o=='P'&&w=='R')check(0,2);
                }else if(t==w&&o!=t)//2 &3 same
                {
                    if(t=='S'&&o=='R')r[0]+=2;
                    else if(t=='R'&&o=='P')r[0]+=2;
                    else if(t=='P'&&o=='S')r[0]+=2;
                    else if(t=='S'&&o=='P')check(1,2);
                    else if(t=='R'&&o=='S')check(1,2);
                    else if(t=='P'&&o=='R')check(1,2);
                }



            }
            return r;
        }
        void check(int x,int y){
            if(r[x]==r[y]){
                r[x]++;
                r[y]++;
            }else{
                if(r[x]>r[y])r[y]+=2;
                else r[x]+=2;
            }
        }

    }
}
