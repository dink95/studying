package infrun.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class N1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ca = s.toCharArray();

        Stack<Character>  st = new Stack<>();


        Boolean check = false;
        for(int i=0;i<ca.length;i++){
            if(ca[i]=='(')
                st.push(ca[i]);
            else if(ca[i]==')'){
                if(st.isEmpty()) {
                    check=true;
                    break;
                }
                st.pop();
            }
        }
        if(!st.isEmpty()||check)
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}
