package infrun2.binarySerarch;

import java.util.Arrays;
import java.util.Scanner;

public class Main7795 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trys = sc.nextInt();
        for(int i=0;i<trys;i++){
            int aSize = sc.nextInt();
            int bSize = sc.nextInt();

            Integer []a = new Integer[aSize];
            Integer []b = new Integer[bSize];

            for(int j=0;j<aSize;j++){
                a[j]=sc.nextInt();
            }
            for(int j=0;j<bSize;j++){
                b[j]=sc.nextInt();
            }

            Arrays.sort(b);
            System.out.println(isCount(a,b));
        }

        }

    public static int isCount(Integer[] a, Integer[] b){
        int count = 0;
        int sizeA = a.length;
        int sizeB = b.length;

        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                if (a[i] <= b[j])
                    break;
                count++;
            }
        }
        return count;
    }
}



