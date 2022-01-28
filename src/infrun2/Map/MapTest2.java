package infrun2.Map;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {

        int [] nums = {1,1,2,2,2,3,4,4,4,5,5,5,5};

        int k =2;
        Map<Integer,Integer> map = new HashMap();
        List<Integer> result = new ArrayList<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> li = new ArrayList<>(map.entrySet());
        Collections.sort(li,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        for(Map.Entry<Integer,Integer> en : li){
            result.add(en.getKey());
        }
        Collections.sort(result,Collections.reverseOrder());
        for(int i=0;i<k;i++){
            System.out.println(result.get(i));
        }

    }
}
