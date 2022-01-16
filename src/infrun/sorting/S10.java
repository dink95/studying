package infrun.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();

        int [] a = new int[n];

        for(int i=0;i<n;i++)
            a[i] =sc.nextInt();
        System.out.println(solution(n,m,a));
    }

    private static int solution(int n, int m, int[] a) {
        Arrays.sort(a);
        int lt = 1; //답은 사이의 거리를 구하는 것!
        int rt = a[a.length-1];
        int result = 0;
        while (lt<=rt){
            int mid = (lt+rt)/2;

            if(count(a,mid)>=m){
                result= mid;
                lt = mid+1;
            }else {
                rt =mid-1;
            }

        }
        return result;
    }
    public static int count(int[] a, int dist){
        int cnt =1;//배치 말 수
        int ep = a[0];

        for(int i : a){
            if(i-ep>=dist){
                cnt++;
                ep=i;
            }
        }
        return cnt;
    }
}
