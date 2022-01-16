package infrun.sorting;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S5 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(solution(arr));

    }
    static char solution(int n[]){

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n.length;i++){
            if(set.contains(n[i]))
                return 'D';

            set.add(n[i]);
        }
        return 'U';
    }
}
