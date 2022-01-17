package infrun.recursive;

import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R1 r = new R1();

        r.solution(3);

    }

    public void solution(int n){

        if (n==0){
            return;
        }else
            System.out.print(n+" ");
         solution(n-1);

    }
}
