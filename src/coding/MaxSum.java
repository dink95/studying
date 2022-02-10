package coding;

import java.util.*;

public class MaxSum {



    public static int findMaxSum(List<Integer> list) {
        int first =list.get(0); int second = list.get(1);
        for(int i=2;i<list.size();i++){
            int tmp = list.get(i);
                if(tmp>second&&tmp<first)
                    second=tmp;
                else if(tmp>first){
                    second=first;
                    first=tmp;
                }

        }
        return second+first;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        // Should return 20, since 9 and 11 are the largest elements
        // and their sum is 20
        System.out.println(findMaxSum(list));
    }
}