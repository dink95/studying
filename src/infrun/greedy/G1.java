package infrun.greedy;

import java.util.*;

public class G1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<P> list = new ArrayList<>();

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new P(h,w));
        }
        Collections.sort(list);

      int result =1;
        int max = list.get(0).w;

        for(int i=1;i<n;i++){
            if(max>list.get(i).w){
                max=list.get(i).w;
                result++;
            }
        }

        System.out.println(result);


    }


}
class P implements Comparable<P>{

    int h;
    int w;


    public P(int h,int w){
        this.h = h;
        this.w = w;

    }

    @Override
    public int compareTo(P o) {
        return this.h-o.h;
    }
}
