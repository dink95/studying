package infrun.sorting;

import java.util.*;

public class S8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();

        Set<Integer> set = new TreeSet<>();

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
            list.add(sc.nextInt());

        Collections.sort(list);

        for(int i=0;i<n;i++)
            set.add(list.get(i));

        Iterator<Integer> it = set.iterator();

        int count =1;
        while(it.hasNext()){
            int i= it.next();
            if(i==m)
                break;
            count++;
        }
        System.out.println(count);
    }
}
