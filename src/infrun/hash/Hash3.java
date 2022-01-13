package infrun.hash;

import java.util.*;

public class Hash3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] p= new int[n];
        for(int i=0;i<n;i++){
            p[i]=in.nextInt();
        }
        int lt =0;
        for(int i=0;i<m-1;i++)
            map.put(p[i],map.getOrDefault(p[i],0)+1);

        int result =0;
        for(int i=m-1;i<n;i++){
            map.put(p[i],map.getOrDefault(p[i],0)+1);
            System.out.print(map.size()+" ");
            map.put(p[lt],map.get(p[lt])-1);
            if(map.get(p[lt])==0)map.remove(p[lt]);
            lt++;

        }


    }
}
