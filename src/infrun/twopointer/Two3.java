package infrun.twopointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Two3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int max=0;
        int tmp=0;

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(in.nextInt());

        for(int i=m-1;i<n;i++){
            if(i==m-1){
                for(int j=0;j<m;j++)
                    max+=list.get(j);
                tmp=max;
            }else {
                tmp=tmp+list.get(i)-list.get(i-m);
                if(tmp>max)
                    max=tmp;

            }
        }
        System.out.println(max);

    }
}
