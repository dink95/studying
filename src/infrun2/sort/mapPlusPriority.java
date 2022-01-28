package infrun2.sort;

import java.util.*;

public class mapPlusPriority {
    public static void main(String[] args) {
      //  String[] words= {"i", "study", "inflearn", "i", "study", "coding"};
        int k = 2;
        String[] words= {"a", "b", "c", "a", "b", "c", "a"};
        
        System.out.println(solve(words, k));
    }

    private static List<String> solve(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        //1.map
        for(String w : words) {
            map.put(w, map.getOrDefault(w, 0)+1); //a3 b2 c2
        }

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->
                a.getValue()==b.getValue()?a.getKey().compareTo(b.getKey()):b.getValue()-a.getValue());

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(entry);
        }

        while(k>0){
            result.add(pq.poll().getKey());
            k--;
        }

return result;
    }
}
