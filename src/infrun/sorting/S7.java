package infrun.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        List<Pos> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y= sc.nextInt();
            Pos p = new Pos(x,y);
            list.add(p);
        }
        Collections.sort(list);

        for(Pos p : list)
            System.out.println(p.x +" "+p.y);
    }
}
class Pos implements Comparable<Pos>{
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pos o) {
        if(x==o.x){
            if(y>o.y)
                return 1;
            else
                return -1;
        }else{
            if(x>o.x)
                return 1;
            else
                return -1;
        }
    }
}
