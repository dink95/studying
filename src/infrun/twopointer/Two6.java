package infrun.twopointer;

import java.util.Scanner;

public class Two6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int []a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int lt = 0;
        int cnt =0;
        int result = 0;
        for(int rt=0;rt<n;rt++){
            if(a[rt]==0)
                cnt++;

            while(cnt>m){
                if(a[lt]==0)cnt--;
                lt++;
            }

            result=Math.max(result,rt-lt+1);

        }
        System.out.println(result);
    }
}
