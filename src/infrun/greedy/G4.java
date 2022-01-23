package infrun.greedy;

import java.util.*;

public class G4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Company> list = new ArrayList<>();

        int big = 0;
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            int d = sc.nextInt();
            list.add(new Company(m,d));
        }
        Collections.sort(list);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        big = list.get(0).d;
        int result =0;

        int j=0;

        for(int i=big;i>=1;i--){
            for(;j<n;j++){
                if(list.get(j).d<i)
                    break;
                pq.offer(list.get(j).m);
            }
            if(!pq.isEmpty())
                result+=pq.poll();

        }

        System.out.println(result);

    }

}
class Company implements Comparable<Company>{

        int m;
        int d;

        Company(int m,int d){
            this.m = m;
            this.d =d;
        }

        public int compareTo(Company c){
            if(c.d>this.d)
                return 1;
            else if(c.d==this.d){
                if(c.m>this.m)
                    return 1;
                else if(c.m==this.m)
                    return 0;
                else
                    return -1;
            }else
                return -1;
        }
}
