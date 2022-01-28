package infrun2.part2;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {

        Integer arr[] = {3,4,7,2,-3,1,4,2};

        int count =0;
        int k=7;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum +=arr[j];
                if(sum==7)
                    count++;
            }
        }

        System.out.println(count);
    }

    public static  int subArrayMap(int []nums, int k){
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum +=nums[i];

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
