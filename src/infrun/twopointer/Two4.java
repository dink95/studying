package infrun.twopointer;

import java.util.Scanner;

public class Two4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int array[]= new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }


        int lt =0;
        int result =0;
        int sum=0;
        for(int rt=0;rt<n;rt++){
            sum+=array[rt];

            if(sum==m)result++;

            while (sum>=m){
                sum-=array[lt++];
                if(sum==m)
                    result++;
            }
        }

        System.out.println(result);

    }
}
