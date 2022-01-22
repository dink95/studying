package infrun.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class G2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Room> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int no = sc.nextInt();
            int time = sc.nextInt();

            list.add(new Room(no,time));
        }

        Collections.sort(list);

        int result =1;
        int des = list.get(0).time;
        for(int i=1;i<n;i++){
            if(list.get(i).no>=des){
                result++;
                des = list.get(i).time;
            }

        }
//        for(int i=0;i<n;i++)
//            System.out.println(list.get(i).no + " "+list.get(i).time);
        System.out.println(result);

    }



}
class Room implements Comparable<Room>{

    int no;
    int time;

    Room(int n, int t){
        no = n;
        time = t;
    }

    public int compareTo(Room r){

                if(this.time==r.time)
                    return this.no - r.no;
                else
                return this.time - r.time;
    }
}
