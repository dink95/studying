package infrun.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class S8_bSearch {
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
        int lt =0;
        int rt = a.length-1;
        int result =0;
        while(rt>=lt){
            int mid = (lt+rt)/2;

            if(a[mid]==m){
                result=mid+1;
                break;
            }
            else if(a[mid]>m){
                rt=mid-1;

            }else{
                lt=mid+1;
            }

        }
        return result;
    }
}
