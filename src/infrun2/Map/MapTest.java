package infrun2.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        String s = "inflearninlove";


        System.out.println(
                solve(s)
        );
    }

    private static int solve(String s) {

        if(s==null||s.length()==0)
            return -1;

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
//            if(!map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),1);
//            }else{
//                map.put(s.charAt(i),map.get(s.charAt(i)) +1);
//            }
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
