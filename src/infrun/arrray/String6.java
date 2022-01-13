package infrun.arrray;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();

        for(int i=0;i<num;i++){


            int x = Integer.parseInt(new StringBuilder(in.next()).reverse().toString());
            if(check(x)){
                System.out.print(x+" ");
            }
        }


    }

    static boolean check(int n){
        if(n<=1)
            return false;
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;

    }
}
