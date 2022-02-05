package acmicpc.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            int tmp = sc.nextInt();
            if(tmp!=0){
                st.push(tmp);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }

        if(st.isEmpty())
            System.out.println(0);
        else{
            int result = 0;
            while(!st.isEmpty()){
                result+=st.pop();
            }
            System.out.println(result);
        }

    }
}
