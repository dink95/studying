package infrun.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class N5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char sa[] = s.toCharArray();
        System.out.println(solution(sa));
    }

    static int solution(char[]chars){
        int result=0;
        Stack<Character> st = new Stack<>();

        for(int i=0;i<chars.length;i++){
            if(chars[i]=='(')
                st.push(chars[i]);
            else{
                st.pop();
                if(chars[i]==')'&&chars[i-1]==')') {
                    result += 1;
                }else {
                    result+=st.size();
                }
            }

        }


        return result;
    }
}
