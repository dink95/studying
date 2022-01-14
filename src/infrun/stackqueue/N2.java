package infrun.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class N2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ca = s.toCharArray();

        System.out.println(solution(ca));
    }

    static String solution(char[] chars){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<chars.length;i++){
            if(chars[i]=='(')
                st.push(chars[i]);
            else if(chars[i]==')')
                st.pop();

            if(st.isEmpty()&&chars[i]!='('&&chars[i]!=')')
                sb.append(chars[i]);

        }

        return sb.toString();
    }
}
