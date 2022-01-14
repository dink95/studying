package infrun.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class N3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] array = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int m= sc.nextInt();
        int[] choose = new int[m];
        for(int i=0;i<m;i++)
            choose[i]=sc.nextInt()-1;

        System.out.println(solution(array,choose));

    }

    static int solution(int[][] t, int [] c){
        Stack<Integer> st = new Stack<>();
        int count=0;
        for(int i=0;i<c.length;i++){
            int num=0;
            for(int j=0;j<t.length;j++){
                if(t[j][c[i]]==0)
                    continue;
                else{
                    num=t[j][c[i]];
                    t[j][c[i]]=0;
                    break;
                }
            }
            if(num==0)
                continue;
            else
            {
                if(!st.isEmpty()&&st.peek()==num)
                {
                    st.pop();
                    count+=2;
                    continue;
                }
                st.push(num);
            }
        }



        int before=st.pop();
        while (!st.isEmpty()){
            int now = st.pop();
            if(before==now)
                count+=2;

            before=now;
        }


        return count;
    }
}
