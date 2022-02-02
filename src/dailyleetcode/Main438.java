package dailyleetcode;

import java.util.*;
public class Main438 {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int[] alpa = new int[26];
            int pl = p.length();

            List<Integer> result = new ArrayList<>();
            for(int i=0;i<p.length();i++)
                alpa[p.charAt(i)-'a']++;


            if(s.length()<=p.length()){
                if(s.equals(p))
                    result.add(0);
                return result;
            }

            int[] slide = new int[26];
            for(int i=0;i<pl;i++){
                slide[s.charAt(i)-'a']++;
            }
            if(checkAna(slide,alpa))
                result.add(0);

            for(int i=pl;i<s.length();i++){
                boolean flag =false;
                slide[s.charAt(i)-'a']++;
                slide[s.charAt(i-pl)-'a']--;
                if(checkAna(slide,alpa))
                    result.add(i-pl+1);
            }

            return result;

        }

        public boolean checkAna(int[]alpa, int[] check){
            for(int i=0;i<26;i++){
                if(alpa[i]!=check[i])
                    return false;
            }
            return true;
        }
    }
}
