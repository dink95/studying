package programmers.allCheck;

import java.util.HashSet;
import java.util.HashSet;

public class SosuSearching {
    public static void main(String[] args) {

    }

}

class Solution {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();

        permutation("", numbers, set); //순열

        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }
        return count;
    }

    //순열방식으로 각각의 자리를 만들기
    public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        if(!prefix.equals("")) {
            set.add(Integer.valueOf(prefix)); //스트링을 Interger로 변환
        }

        for (int i = 0; i < n; i++){
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }

    }

    //소수찾기
    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2; i<=(int)Math.sqrt(n); i+=1){
            if(n%i==0) return false;
        }
        return true;
    }
}