package infrun.twopointer;

import java.util.*;

public class Two1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        List<Integer> array = new ArrayList<>();
        for(int i=0;i<n;i++){
            array.add(kb.nextInt());
        }
        n = kb.nextInt();
        List<Integer> array2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            array2.add(kb.nextInt());
        }
        array.addAll(array2);
        Collections.sort(array);
        System.out.println(array);

    }
}
