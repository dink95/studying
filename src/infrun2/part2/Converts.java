package infrun2.part2;

import java.util.ArrayList;
import java.util.List;

public class Converts {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> convert(int[][] a) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<a.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<a[i].length; j++) {
                System.out.print(" a["+i+"]["+j+"] "+a[i][j]);
                list.add(a[i][j]);
            }
            System.out.println("");
            result.add(list);
        }
        return result;
    }

    // 2  list -> List<int[]>
    private static List<int[]> convert_ListInArray(List<List<Integer>> list) {
        List<int[]> intArrayList = new ArrayList<>();

        for (List<Integer> intList : list) {
            int[] intArray = new int[intList.size()];
            for (int i = 0; i < intArray.length; ++i) {
                intArray[i] = intList.get(i);
            }
            intArrayList.add(intArray);
        }
        return intArrayList;

    }

    public static  int[][] convert2(List<List<Integer>> list){
        int[][] result = new int[list.size()][];

        for(int i=0;i<list.size();i++)
            result[i] = new int[list.get(i).size()];

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++)
                result[i][j] = list.get(i).get(j);
        }
        return result;
    }
}
