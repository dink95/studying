package infrun.arrray;

import java.util.Scanner;

public class String5 {


//에라토니테스의 체
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer=0;
        boolean [] ch = new boolean[n+1];
        ch[0]=ch[1]=true;

        for(int i=2;i*i<=n;i++){

            if(!ch[i]){
                for(int j=i*i;j<=n;j+=i){
                    ch[j]=true;
                }
                answer++;
            }

        }

        System.out.println(answer);
    }

}