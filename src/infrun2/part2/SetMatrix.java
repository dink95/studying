package infrun2.part2;

import java.util.HashSet;
import java.util.Set;

public class SetMatrix {
    public static void main(String[] args) {
        int [][] a={{0,1,1},{1,0,1},{1,1,1}};


        prints(a);
        solve(a);
        prints(a);

    }

    private static void solve(int[][] a) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                if(a[i][j]==0){
                    rowSet.add(i);
                    colSet.add(i);
                }

        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                if(rowSet.contains(i)||colSet.contains(j))
                    a[i][j] =0;

    }

    private static void prints(int[][] a) {
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
