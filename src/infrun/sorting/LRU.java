package infrun.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<>();


        for(int i=0;i<m;i++){
            int tmp = sc.nextInt();

            if(list.contains(tmp)){
                list.remove(Integer.valueOf(tmp));
                list.add(0,tmp);
            }else {
                list.add(0,tmp);
                if(list.size()>n)
                    list.remove(n);
            }

        }
        for(int i : list)
            System.out.print(i+" ");


    }
}
