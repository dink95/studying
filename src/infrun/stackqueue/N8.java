package infrun.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m= sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(solution(n,m,arr));

    }
    static int solution(int n, int m,int[] arr){

        Queue<Person> q = new LinkedList<>();
        int result =0;

        for(int i=0;i<n;i++){
            q.offer(new Person(i,arr[i]));
        }

        while(!q.isEmpty()){
            Person p = q.poll();

            for(Person tmp : q){
                if(p.danger<tmp.danger){
                    q.offer(p);
                    p=null;
                    break;
                }
            }
            if(p!=null){
                result+=1;
                if(p.index==m)
                    return result;
            }

        }

        return result;
    }
}
class Person{
    int index;
    int danger;

    Person(int index,int danger){
        this.index=index;
        this.danger=danger;
    }

}
