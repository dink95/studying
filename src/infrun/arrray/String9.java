package infrun.arrray;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][]arr = new int[num][num];

        for(int i=0;i<num;i++) {
            for (int j = 0; j < num; j++)
                arr[i][j] = sc.nextInt();

        }
        int result = Integer.MIN_VALUE;

        int sumRow;
        int sumCol;

        for(int i=0;i<num;i++){

            sumCol=sumRow=0;
            for(int j=0;j<num;j++){
                sumCol+=arr[i][j];
                sumRow+=arr[j][i];
            }

            result = Math.max(result,sumCol);
            result = Math.max(result,sumRow);
        }
        sumCol=0;
        sumRow=0;

        for(int i=0;i<num;i++) {
            sumCol += arr[i][i];
            sumRow+=arr[i][num-i-1];
        }
        result = Math.max(result,sumCol);
        result = Math.max(result,sumRow);


        System.out.println(result);

    }
}
