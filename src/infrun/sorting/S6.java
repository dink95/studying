package infrun.sorting;

import java.util.*;

public class S6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

       for(int i : solution(arr))
           System.out.print(i+" ");

    }
    static List<Integer> solution(int n[]){

       List<Integer> list = new ArrayList<>();

       int clone[] = n.clone();
       Arrays.sort(clone);
       for(int i=0;i<n.length;i++){
           if(n[i]!=clone[i])
               list.add(i+1);
       }



        return list;
    }
}
