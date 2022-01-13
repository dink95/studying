package infrun.arrray;

import java.util.Scanner;

public class String8 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] array = new int[input1];
        int[]rank = new int[input1];
        for(int i=0;i<input1;i++){
            array[i] = in.nextInt();
        }

        for(int i=0;i<input1;i++){
            rank[i]=1;

            for(int j=0;j<input1;j++) {
                if (i == j)
                    continue;
                if (array[i] < array[j])
                    rank[i]++;
            }
        }

        for(int i : rank)
            System.out.print(i +" ");
    }
}
