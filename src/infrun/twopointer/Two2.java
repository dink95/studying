package infrun.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Two2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> array = new ArrayList<>();
        for(int i=0;i<n;i++){
            array.add(Integer.parseInt(st.nextToken()));
        }
        n = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();
         st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int k = Integer.parseInt(st.nextToken());
            if(array.contains(k))
                result.add(k);
            else
                continue;
        }
        Collections.sort(result);
        for (int i: result)
            System.out.print(i+" ");
    }
}
