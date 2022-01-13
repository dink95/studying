package infrun.twopointer;

import java.util.Scanner;

public class Two5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int count =1,result=0;
        n--;//1빠진 것
        while (n>0){
            count++;
            n=n-count; //
            if(n%count==0)result++;
        }

        System.out.println(result);



    }
}
