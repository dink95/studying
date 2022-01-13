package infrun.arrray;

import java.util.*;
//임시반장 선거

public class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] array= new int[n][5];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
             array[i][j]=sc.nextInt();
            }
        }
//        for(int i=0;i<n+2;i++)
//        System.out.println(Arrays.toString(array[i]));

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<5;k++){
                    if(array[i][k]==array[j][k]) {
                        map.put(i+1, map.getOrDefault(i+1, 0) + 1);
                        break;
                    }
                }
            }
        }

        List<Map.Entry<Integer,Integer>> result = new ArrayList<>(map.entrySet());
        Collections.sort(result,((o1, o2) -> o1.getValue()==o2.getValue()?o1.getKey().compareTo(o2.getKey())
                :o2.getValue().compareTo(o1.getValue())));

        System.out.println(result.get(0).getKey());
    }
}
