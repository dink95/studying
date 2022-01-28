package acmicpc;

import java.util.*;

public class Main1294 {

    static Integer[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        arr = new Integer[n];
        int [] dp = new int[k+1];
        Arrays.fill(dp,10001);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Main1294 main1294 = new Main1294();

        dp[0]=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i];j<k+1;j++){
                dp[j]=Math.min(dp[j],dp[j-arr[i]]+1);
            }
        }
        System.out.println(dp[k]==10001?-1:dp[k]);

    }


}
