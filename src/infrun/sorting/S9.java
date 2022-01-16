package infrun.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class S9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();

        int [] a = new int[n];

        for(int i=0;i<n;i++)
            a[i] =sc.nextInt();
        System.out.println(solution(n,m,a));
    }
    static int solution(int n,int m, int[] a){
        int result = 0;
        int lt = Arrays.stream(a).max().getAsInt();
        int rt = Arrays.stream(a).sum();

        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(count(a,mid)<=m)// 더 줄 일 수 있다.
            {
                result=mid;
                rt=mid-1;
            }else //범위 초과
                lt=mid+1;
        }


        return result;
    }
    public static int count(int[] a, int capacity){
        int cnt =1,
                sum=0;

        for(int i : a){
            if(sum+i>capacity){
                cnt++;
                sum=i;//새로운 cd에 다시 새거 저장
            }else {
                sum+=i;//기존 cd의 저장
            }

        }
        return cnt;
    }


}
