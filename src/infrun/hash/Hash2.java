package infrun.hash;

import java.util.Arrays;
import java.util.Scanner;

public class Hash2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] n = in.next().toCharArray();
        char[] s = in.next().toCharArray();

        Arrays.sort(n);
        String s1 = new String(n);
        Arrays.sort(s);
        String s2 = new String(s);
        if(s1.equals(s2))
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
