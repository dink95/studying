package infrun.hash;

import java.util.*;

public class Hash1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        char[] chars = s.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<chars.length;i++){
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        List<Map.Entry<Character,Integer>>entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries,((o1, o2) -> o2.getValue().compareTo(o1.getValue())));

        System.out.println(entries.get(0).getKey());
    }
}
