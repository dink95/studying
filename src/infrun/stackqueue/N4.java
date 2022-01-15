package infrun.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class N4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char sa[] = s.toCharArray();

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<sa.length;i++){
            if(Character.isDigit(sa[i])){
                int num = sa[i]-'0';
                stack.push(num);
            }
            else {
                int f=stack.pop();
                int se =stack.pop();

                if(sa[i]=='+'){
                    stack.push((se+f));
                }else if(sa[i]=='-'){
                    stack.push((se-f));
                }else if(sa[i]=='*'){
                    stack.push((se*f));
                }else if(sa[i]=='/') {
                    stack.push( (se / f));
                }
            }
        }
        System.out.println((int) stack.pop());


    }
}
